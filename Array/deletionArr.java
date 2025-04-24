import java.util.Scanner;

public class deletionArr {
  public static void main(String[] args){
    int n, p, i;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter size of the array = ");
    n = in.nextInt();
    int[] a = new int[n];
    System.out.println("Enter elements");
    for(i = 0; i < n; i++){
      a[i] = in.nextInt();
    }
    System.out.println("Enter  position");
    p = in.nextInt();

    for(i = p-1; i < n-1; i++){
      a[i] = a[i+1];
    }
    n--;
    for(i = 0; i < n; i++){
      System.out.println(a[i]);
    }
  }
}
