
import java.util.Scanner;

public class BinaryToDecimal {

  public static int binaryToDecimal(int n){

    int pow = 0;
    int dec = 0;

    while (n > 0) {
      int lastDigit = n % 10;
      dec += (lastDigit * (int)Math.pow(2, pow));
      n /= 10;
      pow++;
    }

    return dec;
  }

  public static  void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number: ");
    int num = sc.nextInt();

    int decimal = binaryToDecimal(num);
    System.out.println("Binary = " + num + ", Decimal = " + decimal);
  }
}