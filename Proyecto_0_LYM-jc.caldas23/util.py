import re

reservedChars = [',', ';', '{', '}', '(', ')', '=']
reservedNames = [
    "if", "else", "fi", "do", "od", "repeat", "times", "NEW", "VAR", "MACRO", "EXEC",
    "walk", "turnToMy", "blocked?", "safeExe", "moves", "drop", "letgo", "nop", "grab", 
    "front", "left", "right", "back", "myChips", "zero?", "roomForChips"
]

programError = False

def runProgram(tokens):
    for token in tokens:
        if token in reservedNames:
            continue
    return not programError

def parser(tokens):
    global programError
    tokenNum = 0
    while tokenNum < len(tokens):
        currentToken = tokens[tokenNum]
        if currentToken in reservedNames or currentToken in reservedChars or isValidVariableName(currentToken):
            if currentToken == "if":
                tokenNum = parseIfStatement(tokens, tokenNum)
            elif currentToken == "do":
                tokenNum = parseLoopStatement(tokens, tokenNum)
            elif currentToken == "NEW":
                tokenNum = parseNewStatement(tokens, tokenNum)
            elif currentToken == "EXEC":
                tokenNum = parseExecStatement(tokens, tokenNum)
            else:
                tokenNum += 1
        else:
            return error("Unrecognized token", currentToken)
        tokenNum += 1

    return not programError

def lexer(txt):
    if isinstance(txt, list):
        txt = "".join(txt)
 
    tokens = re.findall(r'\w+|[{}();=,]', txt)
    return tokens

def isValidVariableName(varName):
    return varName not in reservedNames + reservedChars

def parseExecStatement(tokens, tokenNum):
    return parseBlock(tokens, tokenNum + 1, "EXEC")

def parseIfStatement(tokens, tokenNum):
    if tokens[tokenNum + 1] == "not":
        if tokens[tokenNum + 2] == "(":
            closingParenIndex = findClosingParen(tokens, tokenNum + 2)
            if closingParenIndex == -1:
                return error("Expected closing ')' after 'not'", tokenNum)
            return closingParenIndex + 1
        return error("Expected '( )' after 'not'", tokenNum)
    
    if tokens[tokenNum + 1] == "(":
        closingParenIndex = findClosingParen(tokens, tokenNum + 1)
        if closingParenIndex == -1:
            return error("Expected closing ')' after condition", tokenNum)
        return closingParenIndex + 1
    
    return error("Expected '( )' after 'if'", tokenNum)

def findClosingParen(tokens, openParenIndex):
    openParens = 0
    for i in range(openParenIndex, len(tokens)):
        if tokens[i] == "(":
            openParens += 1
        elif tokens[i] == ")":
            openParens -= 1
            if openParens == 0:
                return i
    return -1 

def parseLoopStatement(tokens, tokenNum):
    return tokenNum + 4 if tokens[tokenNum + 1] == "(" else error("Expected '(' after 'do'", tokenNum)

def parseNewStatement(tokens, tokenNum):
    if tokens[tokenNum + 1] == "VAR":
        return tokenNum + 4 if tokens[tokenNum + 3] == "=" else error("Expected '=' after variable", tokenNum)
    if tokens[tokenNum + 1] == "MACRO":
        return tokenNum + 7 if tokens[tokenNum + 3] == "(" and tokens[tokenNum + 5] == ")" else error("Invalid MACRO", tokenNum)
    return error("Expected VAR or MACRO", tokenNum)

def parseBlock(tokens, tokenNum, name):
    if tokens[tokenNum] != "{":
        return error(f"Expected '{{' after '{name}'", tokenNum)
    
    tokenNum += 1
    while tokens[tokenNum] != "}":
        currentToken = tokens[tokenNum]
        if currentToken == "letgo":
            return error("Command 'letgo' should be 'letGo'", tokenNum)
        if currentToken == "move":
            return error("Command 'move' should be 'walk'", tokenNum)
        if currentToken == "rooomForChips":
            return error("Typo 'rooomForChips' should be 'roomForChips'", tokenNum)
        tokenNum += 1
    
    return tokenNum + 1

def error(msg, tokenNum):
    global programError
    programError = True
    print(f"Error: {msg} at token {tokenNum}")
    return tokenNum
