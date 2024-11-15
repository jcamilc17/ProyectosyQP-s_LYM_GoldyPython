// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/CodeDecodeEmpty.gold"
import gold.*;
import gold.structures.*;
import gold.structures.automaton.*;
import gold.structures.bag.*;
import gold.structures.collection.*;
import gold.structures.deque.*;
import gold.structures.disjointset.*;
import gold.structures.graph.*;
import gold.structures.heap.*;
import gold.structures.list.*;
import gold.structures.map.*;
import gold.structures.multimap.*;
import gold.structures.point.*;
import gold.structures.queue.*;
import gold.structures.set.*;
import gold.structures.stack.*;
import gold.structures.tree.*;
import gold.structures.tree.binary.*;
import gold.structures.tree.nary.*;
import gold.structures.tuple.*;
import gold.structures.turingMachine.*;
import gold.swing.*;
import gold.swing.icon.*;
import gold.swing.icon.ajaxload.*;
import gold.swing.icon.famfamfam.*;
import gold.swing.icon.gold.*;
import gold.swing.icon.jlfgr.*;
import gold.swing.icon.wikimedia.*;
import gold.swing.icon.windows.*;
import gold.swing.look.*;
import gold.swing.util.*;
import gold.test.*;
import gold.test.automaton.*;
import gold.test.general.*;
import gold.test.graph.*;
import gold.util.*;
import gold.visualization.*;
import gold.visualization.automaton.*;
import gold.visualization.graph.*;
import gold.visualization.quadtree.*;
import gold.visualization.turingMachine.*;
import gold.visualization.util.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class CodeDecodeEmpty {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=12;
      java.util.Scanner sc=null;
      sc=$invokeConstructor(java.util.Scanner.class,new Object[]{$invokeField(System.class,"in",true,null)});
      $line=13;
      Object coder=$fix(CodeDecodeEmpty.createCoder());
      $line=14;
      Object deCoder=$fix(CodeDecodeEmpty.createDecoder());
      $line=21;
      Utilities.testCodeDecode($cast(gold.structures.automaton.ITransducer.class,coder),$cast(gold.structures.automaton.ITransducer.class,deCoder));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CodeDecodeEmpty.class,"main",$line);
    }
  }
  public static ITransducer createCoder() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=26;
      Object A=$fix($opUnionY($opIntvlY('a','z'),GCollections.asSet(' ')));
      $line=27;
      Object B=$fix($opIntvlY(0,4));
      $line=28;
      Object C=$fix($opIntvlY(0,2));
      $line=29;
      gold.structures.set.ISet $v1=$newSet();
      $v2:for (Object a:GCollections.unmodifiableCollection(A)) {
        for (Object b:GCollections.unmodifiableCollection(B)) {
          for (Object c:GCollections.unmodifiableCollection(B)) {
            for (Object d:GCollections.unmodifiableCollection(C)) {
              $v1.add(GCollections.asList(a,b,c,d));
            }
          }
        }
      }
      gold.structures.set.ISet $v3=$newSet();
      $v4:for (Object a:GCollections.unmodifiableCollection(A)) {
        for (Object b:GCollections.unmodifiableCollection(B)) {
          for (Object c:GCollections.unmodifiableCollection(B)) {
            for (Object d:GCollections.unmodifiableCollection(C)) {
              $v3.add(GCollections.asList("F",a,b,c,d));
            }
          }
        }
      }
      Object Q=$fix($opUnionY($opUnionY($v1,GCollections.asSet("I","E")),$v3));
      $line=30;
      Object In=$fix($opUnionY(A,GCollections.asSet('.')));
      $line=31;
      Object Out=$fix($opUnionY($opUnionY($opIntvlY('a','z'),$opIntvlY('0','9')),GCollections.asSet('.',' ')));
      $line=32;
      Object q_0=$fix("I");
      $line=33;
      gold.structures.set.ISet $v5=$newSet();
      $v6:for (Object a:GCollections.unmodifiableCollection(A)) {
        for (Object b:GCollections.unmodifiableCollection(B)) {
          for (Object c:GCollections.unmodifiableCollection(B)) {
            for (Object d:GCollections.unmodifiableCollection(C)) {
              $v5.add(GCollections.asList("F",a,b,c,d));
            }
          }
        }
      }
      Object F=$fix($v5);
      $line=35;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,In,Out,q_0,F,new GMethod(CodeDecodeEmpty.class,"\u03B4"),new GMethod(CodeDecodeEmpty.class,"g"),new GMethod(CodeDecodeEmpty.class,"h")});
      if (true) break $try;
      $line=37;
      $rethrow(new RuntimeException("The function \"createCoder()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CodeDecodeEmpty.class,"createCoder",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object \u03B4(Object q, Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=41;
      if ($opEqualY(q,"E")) {
        $line=41;
        $result="E";
        if (true) break $try;
      }
      else {
        $line=42;
        if (($opEqualY(q,"I")&&$opEqualY(s,' '))) {
          $line=42;
          $result="E";
          if (true) break $try;
        }
        else {
          $line=43;
          if (($opEqualY(q,"I")&&$opMembrY(s,$opIntvlY('a','z')))) {
            $line=43;
            $result=GCollections.asList(s,1,1,2);
            if (true) break $try;
          }
          else {
            $line=44;
            if ($opEqualY($getArrayValue(q,new Object[]{0}),"F")) {
              $line=44;
              $result="E";
              if (true) break $try;
            }
            else {
              $line=45;
              if ($opEqualY($opAbsolY(q),4)) {
                $line=47;
                Object firstletter=$fix($getArrayValue(q,new Object[]{0}));
                $line=48;
                Object i=$fix($getArrayValue(q,new Object[]{1}));
                $line=49;
                Object len=$fix($getArrayValue(q,new Object[]{2}));
                $line=50;
                Object j=$fix($getArrayValue(q,new Object[]{3}));
                $line=51;
                if ($opEqualY(s,' ')) {
                  $line=52;
                  if ($opEqualY(firstletter,' ')) {
                    $line=52;
                    $result="E";
                    if (true) break $try;
                  }
                  else {
                    $line=53;
                    $result=GCollections.asList(s,i,len,1);
                    if (true) break $try;
                  }
                }
                else {
                  $line=55;
                  if ($opEqualY(s,'.')) {
                    $line=56;
                    if ($opEqualY(firstletter,' ')) {
                      $line=56;
                      $result="E";
                      if (true) break $try;
                    }
                    else {
                      $line=57;
                      $result=GCollections.asList("F",firstletter,$opModulY(i,5),$opModulY(len,5),j);
                      if (true) break $try;
                    }
                  }
                  else {
                    $line=60;
                    if ($opEqualY(firstletter,' ')) {
                      $line=60;
                      $result=GCollections.asList(s,$opModulY($opAdditY(i,1),5),1,$opModulY($opAdditY(j,1),3));
                      if (true) break $try;
                    }
                    else {
                      $line=61;
                      $result=GCollections.asList(firstletter,i,$opModulY($opAdditY(len,1),5),$opModulY($opAdditY(j,1),3));
                      if (true) break $try;
                    }
                  }
                }
              }
              else {
                $line=64;
                $result="E";
                if (true) break $try;
              }
            }
          }
        }
      }
      $line=66;
      $rethrow(new RuntimeException("The function \"\u03B4(q:Object,s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CodeDecodeEmpty.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object h(Object q, Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=69;
      if (($opEqualY(q,"E")||$opEqualY(q,"F"))) {
        $line=69;
        $result="";
        if (true) break $try;
      }
      else {
        $line=70;
        if (($opEqualY(q,"I")&&$opEqualY(s," "))) {
          $line=70;
          $result="";
          if (true) break $try;
        }
        else {
          $line=71;
          if (($opEqualY(q,"I")&&$opMembrY(s,$opIntvlY('a','z')))) {
            $line=71;
            $result=s;
            if (true) break $try;
          }
          else {
            $line=72;
            if ($opEqualY($opAbsolY(q),4)) {
              $line=73;
              Object firstletter=$fix($getArrayValue(q,new Object[]{0}));
              $line=74;
              Object i=$fix($getArrayValue(q,new Object[]{1}));
              $line=75;
              Object len=$fix($getArrayValue(q,new Object[]{2}));
              $line=76;
              Object j=$fix($getArrayValue(q,new Object[]{3}));
              $line=77;
              if ($opEqualY(s,' ')) {
                $line=78;
                if ($opEqualY(firstletter,' ')) {
                  $line=78;
                  $result="";
                  if (true) break $try;
                }
                else {
                  $line=80;
                  $result=firstletter;
                  if (true) break $try;
                }
              }
              else {
                $line=82;
                if ($opEqualY(s,'.')) {
                  $line=82;
                  $result=firstletter;
                  if (true) break $try;
                }
                else {
                  $line=84;
                  if ($opEqualY(firstletter,' ')) {
                    $line=84;
                    $result=s;
                    if (true) break $try;
                  }
                  else {
                    $line=86;
                    if ($opEqualY(firstletter,s)) {
                      $line=86;
                      $result=j;
                      if (true) break $try;
                    }
                    else {
                      $line=87;
                      $result=s;
                      if (true) break $try;
                    }
                  }
                }
              }
            }
            else {
              $line=91;
              $result="";
              if (true) break $try;
            }
          }
        }
      }
      $line=93;
      $rethrow(new RuntimeException("The function \"h(q:Object,s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CodeDecodeEmpty.class,"h",$line);
    }
    return $result;
  }
  public static Object g(Object q) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=96;
      if ((!$opEqualY(q,"I")&&!$opEqualY(q,"E"))) {
        $line=97;
        if (!$opEqualY($getArrayValue(q,new Object[]{0}),"F")) {
          $line=98;
          Object firstletter=$fix($getArrayValue(q,new Object[]{0}));
          $line=99;
          Object i=$fix($getArrayValue(q,new Object[]{1}));
          $line=100;
          Object len=$fix($getArrayValue(q,new Object[]{2}));
          $line=101;
          Object j=$fix($getArrayValue(q,new Object[]{3}));
          $line=102;
          if ($opEqualY($getArrayValue(q,new Object[]{0}),' ')) {
            $line=102;
            $result=$opModulY($opAdditY(i,len),5);
            if (true) break $try;
          }
          else {
            $line=103;
            $result="";
            if (true) break $try;
          }
        }
        else {
          $line=105;
          if ($opEqualY($getArrayValue(q,new Object[]{0}),"F")) {
            $line=106;
            Object firstletter=$fix($getArrayValue(q,new Object[]{0}));
            $line=107;
            Object i=$fix($getArrayValue(q,new Object[]{2}));
            $line=108;
            Object len=$fix($getArrayValue(q,new Object[]{3}));
            $line=109;
            Object j=$fix($getArrayValue(q,new Object[]{4}));
            $line=110;
            $result=$opAdditY($opModulY($opAdditY(i,len),5),".");
            if (true) break $try;
          }
          else {
            $line=111;
            $result="";
            if (true) break $try;
          }
        }
      }
      else {
        $line=113;
        $result="";
        if (true) break $try;
      }
      $line=115;
      $rethrow(new RuntimeException("The function \"g(q:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CodeDecodeEmpty.class,"g",$line);
    }
    return $result;
  }
  public static ITransducer createDecoder() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=118;
      Object A=$fix($opUnionY($opIntvlY('a','z'),GCollections.asSet(' ')));
      $line=119;
      Object B=$fix($opIntvlY('0','4'));
      $line=120;
      Object C=$fix($opIntvlY(0,2));
      $line=121;
      Object D=$fix($opIntvlY(0,4));
      $line=122;
      Object E=$fix($opUnionY($opIntvlY('a','z'),GCollections.asSet(0)));
      $line=123;
      gold.structures.set.ISet $v7=$newSet();
      $v8:for (Object a:GCollections.unmodifiableCollection(A)) {
        for (Object b:GCollections.unmodifiableCollection(D)) {
          for (Object c:GCollections.unmodifiableCollection(D)) {
            for (Object d:GCollections.unmodifiableCollection(C)) {
              for (Object let:GCollections.unmodifiableCollection(E)) {
                $v7.add(GCollections.asList(a,b,c,d,let));
              }
            }
          }
        }
      }
      Object Q=$fix($opUnionY($v7,GCollections.asSet("I","E","F")));
      $line=124;
      Object In=$fix($opUnionY($opUnionY($opIntvlY('a','z'),B),GCollections.asSet('.')));
      $line=125;
      Object Out=$fix($opUnionY(A,GCollections.asSet('.',' ')));
      $line=126;
      Object q_0=$fix("I");
      $line=127;
      Object F=$fix(GCollections.asSet("F"));
      $line=129;
      $result=$invokeConstructor(GDeterministicTransducer.class,new Object[]{Q,In,Out,q_0,F,new GMethod(CodeDecodeEmpty.class,"\u03B41"),new GMethod(CodeDecodeEmpty.class,"g1"),new GMethod(CodeDecodeEmpty.class,"h1")});
      if (true) break $try;
      $line=131;
      $rethrow(new RuntimeException("The function \"createDecoder()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CodeDecodeEmpty.class,"createDecoder",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object \u03B41(Object q, Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=134;
      if (($opEqualY(q,"E")||$opEqualY(q,"F"))) {
        $line=134;
        $result="E";
        if (true) break $try;
      }
      else {
        $line=135;
        if (($opEqualY(q,"I")&&$opMembrY(s,$opIntvlY('a','z')))) {
          $line=135;
          $result=GCollections.asList(s,1,1,2,0);
          if (true) break $try;
        }
        else {
          $line=136;
          if ($opEqualY($opAbsolY(q),5)) {
            $line=137;
            Object firstletter=$fix($getArrayValue(q,new Object[]{0}));
            $line=138;
            Object i=$fix($getArrayValue(q,new Object[]{1}));
            $line=139;
            Object len=$fix($getArrayValue(q,new Object[]{2}));
            $line=140;
            Object j=$fix($getArrayValue(q,new Object[]{3}));
            $line=141;
            Object count=$fix($getArrayValue(q,new Object[]{4}));
            $line=142;
            if (($opMembrY(firstletter,$opIntvlY('a','z'))&&$opMembrY(s,$opIntvlY('0','2')))) {
              $line=143;
              s=$fix($opSubtrY(s,'0'));
              $line=144;
              if ($opEqualY(s,j)) {
                $line=145;
                $result=GCollections.asList(firstletter,i,$opModulY($opAdditY(len,1),5),$opModulY($opAdditY(j,1),3),0);
                if (true) break $try;
              }
              else {
                $line=146;
                $result="E";
                if (true) break $try;
              }
            }
            else {
              $line=148;
              if (($opMembrY(firstletter,$opIntvlY('a','z'))&&$opMembrY(s,$opIntvlY('a','z')))) {
                $line=149;
                if ($opEqualY(s,firstletter)) {
                  $line=149;
                  $result=GCollections.asList(' ',i,len,$opModulY($opAdditY(j,1),3),0);
                  if (true) break $try;
                }
                else {
                  $line=150;
                  if (!$opEqualY(s,firstletter)) {
                    $line=150;
                    $result=GCollections.asList(firstletter,i,$opModulY($opAdditY(len,1),5),$opModulY($opAdditY(j,1),3),0);
                    if (true) break $try;
                  }
                  else {
                    $line=151;
                    $result="E";
                    if (true) break $try;
                  }
                }
              }
              else {
                $line=153;
                if ($opEqualY(firstletter,' ')) {
                  $line=154;
                  if ($opMembrY(s,$opIntvlY('a','z'))) {
                    $line=154;
                    $result=GCollections.asList(s,$opModulY($opAdditY(i,1),5),1,2,s);
                    if (true) break $try;
                  }
                  else {
                    $line=155;
                    if ($opMembrY(s,$opIntvlY('0','4'))) {
                      $line=156;
                      s=$fix($opSubtrY(s,'0'));
                      $line=157;
                      if ($opEqualY(s,$opModulY($opAdditY(len,i),5))) {
                        $line=157;
                        $result=GCollections.asList(' ',i,1,1,0);
                        if (true) break $try;
                      }
                      else {
                        $line=158;
                        $result="E";
                        if (true) break $try;
                      }
                    }
                    else {
                      $line=160;
                      if ($opEqualY(s,'.')) {
                        $line=160;
                        $result="F";
                        if (true) break $try;
                      }
                    }
                  }
                }
                else {
                  $line=162;
                  $result="E";
                  if (true) break $try;
                }
              }
            }
          }
          else {
            $line=164;
            $result="E";
            if (true) break $try;
          }
        }
      }
      $line=166;
      $rethrow(new RuntimeException("The function \"\u03B41(q:Object,s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CodeDecodeEmpty.class,"\u03B41",$line);
    }
    return $result;
  }
  public static Object h1(Object q, Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=169;
      if (($opEqualY(q,"E")||$opEqualY(q,"F"))) {
        $line=169;
        $result="";
        if (true) break $try;
      }
      else {
        $line=170;
        if (($opEqualY(q,"I")&&$opMembrY(s,$opIntvlY('a','z')))) {
          $line=170;
          $result=s;
          if (true) break $try;
        }
        else {
          $line=171;
          if ($opEqualY($opAbsolY(q),5)) {
            $line=172;
            Object firstletter=$fix($getArrayValue(q,new Object[]{0}));
            $line=173;
            Object i=$fix($getArrayValue(q,new Object[]{1}));
            $line=174;
            Object len=$fix($getArrayValue(q,new Object[]{2}));
            $line=175;
            Object j=$fix($getArrayValue(q,new Object[]{3}));
            $line=176;
            if (($opMembrY(firstletter,$opIntvlY('a','z'))&&$opMembrY(s,$opIntvlY('0','2')))) {
              $line=177;
              s=$fix($opSubtrY(s,'0'));
              $line=178;
              if ($opEqualY(s,j)) {
                $line=178;
                $result=firstletter;
                if (true) break $try;
              }
              else {
                $line=179;
                $result="";
                if (true) break $try;
              }
            }
            else {
              $line=181;
              if (($opMembrY(firstletter,$opIntvlY('a','z'))&&$opMembrY(s,$opIntvlY('a','z')))) {
                $line=182;
                if (!$opEqualY(s,firstletter)) {
                  $line=182;
                  $result=s;
                  if (true) break $try;
                }
                else {
                  $line=183;
                  $result="";
                  if (true) break $try;
                }
              }
              else {
                $line=185;
                if (($opEqualY(firstletter,' ')&&$opMembrY(s,$opIntvlY('a','z')))) {
                  $line=185;
                  $result=' ';
                  if (true) break $try;
                }
                else {
                  $line=186;
                  if (($opEqualY(firstletter,' ')&&$opEqualY(s,'.'))) {
                    $line=186;
                    $result='.';
                    if (true) break $try;
                  }
                  else {
                    $line=187;
                    $result="";
                    if (true) break $try;
                  }
                }
              }
            }
          }
          else {
            $line=189;
            $result="";
            if (true) break $try;
          }
        }
      }
      $line=191;
      $rethrow(new RuntimeException("The function \"h1(q:Object,s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CodeDecodeEmpty.class,"h1",$line);
    }
    return $result;
  }
  public static Object g1(Object q) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=194;
      if (((!$opEqualY(q,"I")&&!$opEqualY(q,"E"))&&!$opEqualY(q,"F"))) {
        $line=195;
        Object let=$fix($getArrayValue(q,new Object[]{4}));
        $line=196;
        if (!$opEqualY(let,0)) {
          $line=196;
          $result=let;
          if (true) break $try;
        }
      }
      $line=199;
      $result="";
      if (true) break $try;
      $line=200;
      $rethrow(new RuntimeException("The function \"g1(q:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CodeDecodeEmpty.class,"g1",$line);
    }
    return $result;
  }
}
