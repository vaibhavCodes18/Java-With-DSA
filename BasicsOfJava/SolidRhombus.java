public class SolidRhombus {

  public static void solidRhomubs(int n) {

    // rows / line
    for(int i = 1; i <= n; i++){
      // space
      for(int j = 1; j <= n-i; j++){
        System.out.print(" ");
      }
      // stars
      for(int k = 1; k <= n; k++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    solidRhomubs(5);
  }
}
