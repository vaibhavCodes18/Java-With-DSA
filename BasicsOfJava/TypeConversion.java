package BasicsOfJava;

public class TypeConversion {
  public static void main(String args[]){
    //  Implicit Type Conversion
    int a = 10;
    double b = a;
    System.out.println(b); // 10.0

    // Explicit Type Conversion
    double c = 10.5;
    int d = (int)c;
    System.out.println(d); // 10

    // String to Integer
    String e = "143";
    int f = Integer.parseInt(e);
    System.out.println(f); // 10 integer

    // Integer to String:
    int g = 104;
    String h = String.valueOf(g);
    System.out.println(h); // 10 string
  }
}
