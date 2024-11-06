import re
import util as u  

def main(filename):
    with open(f"{filename}.txt", 'r') as temp_file:
        txt = [line.strip() for line in temp_file]
    tokens = u.lexer(txt)
    
    if u.parser(tokens) or u.runProgram(tokens):
        return True
    
    return False


def runProgram():
    print("Escribe el nombre del archivo ubicado en la misma carpeta que el código (sin .txt). Si se deja en blanco, se ejecutará 'code-examples.txt' por defecto.")
    filename = input("- ")
    if filename == "":
        filename = 'code-examples'
    
    result = main(filename)

    if result == True:
        print("La sintaxis del programa es correcta :)")
    else:
        print("La sintaxis del programa es incorrecta :'(")

runProgram()
