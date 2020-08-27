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

   private String name;
}

// /Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk
// /Library/Java/JavaVirtualMachines/adoptopenjdk-11.jdk