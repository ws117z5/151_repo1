package edu.sjsu.cs.cs151.vladimir;
/**
 * Main class
 */
public class HelloWorld {
    /**
     * Hellow world Class
     * @param args main with args
     */
    public static void main(String[] args) {
        System.out.println("name : Vladimir Koroteev");
        System.out.println("git : https://github.com/ws117z5/151_repo1");

        System.out.println((new Greeter("Vladimir")).sayHello());
        (new Greeter("Vladimir")).drawQuote();
        (new Greeter("Vladimir")).drawGopher();
    }

}