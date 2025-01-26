package BinarySearch;

public class TotalSubArr {

  public static void sumSubArr(int[] arr){
    int currSum;
    int maxSum = Integer.MIN_VALUE;
    for(int i = 0; i < arr.length; i++){
      for(int j = i; j < arr.length; j++){
        currSum = 0;
        for(int k = i; k <= j; k++){
          System.out.print(arr[k]+ " ");
          currSum = currSum + arr[k];
        }
        System.out.println("Sum is " + currSum);
        if (currSum > maxSum) {
          maxSum = currSum;
        }
      }
      System.out.println();
    }
    System.out.println("Maximum sum is = " + maxSum);
  }
  
  public static void main(String[] args) {
      int[] arr = {2, 4, 6, 8, 10};

      sumSubArr(arr);
  }
}
