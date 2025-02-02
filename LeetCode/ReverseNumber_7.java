public class ReverseNumber_7 {

  public static int reverseInteger(int n){
      int rev = 0;
      while(n > 0){
        int lastDigit = n %10;
        n /= 10;
        rev = (rev * 10) + lastDigit;
      }
       
        // If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.Assume the environment does not allow you to store 64-bit i
      return (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) ? 0 :rev;
  }
  public static void main(String[] args) {
      int n = 1534236469;
      System.out.println(reverseInteger(n));
  }
}
