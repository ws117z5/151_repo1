package edu.sjsu.cs.cs151.vladimir;

import java.util.Scanner;
import java.lang.Math;
//import javax.swing;
//import com.sun.misc;

/**
 * Dummy class
 */
public class Greeter {
   /**
    * Greeter constructor
    * @param aName a Name to greet
    */
   public Greeter(String aName) {
      name = aName;
   }

   /**
    * Returning a full greeting
    * @return string Hello, "Name"
    */
   public String sayHello() {
      return "Hello, " + name + "!";
   }

   public void drawQuote() {
      System.out.println(
       "   _______________________________   \n"
      +"  |                               |   \n"
      +"  |         Unlike Java,          |   \n"
      +"  |   Go and other new languages  |   \n"
      +"  |          Allow you            |   \n"
      +"  |  To use multiline strings     |   \n"
      +"  |                               |   \n"
      +"  |          But what does        |   \n"
      +"  |      A stupid Gopher knows    |   \n"
      +"  |      Less then John Snow      |   \n"
      +"  |_______________________________|   \n"
      +"   (       )   \n"
      +"      (   )   \n"
      +"        ( )   \n"
      +"         ( )   \n"
      +"           ()   ");
   }

   public void drawGopher() {
      String askiiGopher = 
      "       ,_---~~~~~----._\n"       
      +" _,,_,*^____      _____``*g*\"*, \n"
     +"/ __/ /'     ^.  /      \\ ^@q   f\n"
    +"[  @f | @))    |  | @))   l  0 _/  \n"
    +" \\`/   \\~____ / __ \\_____/    \\   \n"
    +"  |           _l__l_           I   \n"
    +"  }          [______]           I  \n"
    +"  ]            | | |            |  \n"
    +"  ]             ~ ~             |  \n"
    +"  |                            |   \n"
    +"   |                           |   \n\n\n"
    +"Tanks to github.com/belbomemo for the askii version of gopher";

      System.out.println(askiiGopher);
   }

   private String name;
}

// /Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk
// /Library/Java/JavaVirtualMachines/adoptopenjdk-11.jdk