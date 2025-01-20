public class DecimalToBin {

  public static int decimalToBin(int num){
    int pow = 0;
    int bin = 0;
    while (num > 0) {
      int rem = num % 2;
      bin = bin + rem * (int)Math.pow(10, pow);
      pow++;
      num = num / 2;
    }
    return  bin;
  }

  public static void main(String[] args) {
    int dec = 5;
    int bin = decimalToBin(dec);
    System.out.println("Decimal = " + dec + ", Binary = " + bin);
  }
}
