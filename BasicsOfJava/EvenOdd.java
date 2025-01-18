import java.util.Scanner;

public class EvenOdd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int evenNum = 0;
    int oddNum = 0;
    int num = 0;
    int choice;

    do {
      System.out.println("Enter a number : ");
      num = sc.nextInt();

      if (num % 2 == 0) {
        evenNum += num;
      } else {
        oddNum += num;
      }
      System.out.println("Do you want to continue? (1 for yes, 0 for no)");
      choice = sc.nextInt();
    } while (choice == 1);
    System.out.println("Sum of all even number is : " + evenNum);
    System.out.println("Sum of all odd number is : " + oddNum);
  }
}