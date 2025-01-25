public class PalindromePyramid {

  public static void panildromePyramid(int n){
    
    // rows
    for(int i = 1; i <= n; i++){
      // spaces
      for(int j = 1; j <= n-i; j++){
        System.out.print(" ");
      }
      // numbers - desc
      for(int k = i; k >= 1; k--){
        System.out.print(k);
      }
      // numbers - asc
      for(int j = 2; j <= i; j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }

  public static void main(String[] args){
    panildromePyramid(4);
  }
}
