public class Palindrome_09 {

  public static boolean  isPalindrome(int x){
    int n = x;
    int rev = 0;

    while(n > 0){
      int lastDigit = n % 10;
      rev = (rev * 10) + lastDigit;
      
      n /= 10;
    }

    System.out.println(n);
    return rev == x;
  }

  public static void main(String[] args) {
    int n = 121;
    System.out.println(isPalindrome(n));
  }
}
