package BasicsOfJava;

public class ReverseNumber {
  public static void main(String args[]) {
    // int n = 4455666;
    // while (n > 0) {
    // int lastdigit = n % 10;
    // System.out.print(lastdigit);
    // n /= 10;
    // }
    // System.out.println(" ");
    
    // int num = 12556;
    // int reverseNumber = 0;

    // while (num != 0) {
    // reverseNumber = num % 10;
    // num = num / 10;
    // System.out.print(reverseNumber);
    // }

    int n = 123;
    int reverse = 0;
    while (n > 0) {
      int lastdigit = n % 10;
      reverse = ((reverse * 10) + lastdigit);
      n /= 10;
    }
    System.out.println(reverse);

  }
}
