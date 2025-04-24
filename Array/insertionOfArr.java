
import java.util.Scanner;

public class insertionOfArr {
  public static void main(String[] args){
    int i, n, p, x;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter size of the array = ");
    n = in.nextInt();
    int[] arr = new int[n+1];
    System.out.println("Enter array elements = ");
    
    for(i = 0; i < n; i++){
      arr[i] = in.nextInt();
    }

    System.out.println("Enter number & position");
    x = in.nextInt();
    p = in.nextInt();
    n++;
    
    for(i = n-1; i > p-1; i--){
      arr[i] = arr[i-1];
    }
    
    arr[p-1] = x;
    
    for(i = 0; i < n; i++){
      System.out.println(arr[i]);
    }
  }
}
