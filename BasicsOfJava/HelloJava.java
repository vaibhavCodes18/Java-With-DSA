package BasicsOfJava;

import java.util.*;

public class HelloJava {
  public static void main(String args[]) {
    System.out.println("Hello, Java!");
    Scanner ssc = new Scanner(System.in);
    System.out.println("Enter your name:");
    String name = ssc.nextLine();
    System.out.println("Hello, " + name + "!");
  }
}
