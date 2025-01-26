// package BinarySearch;

public class ReverseArr {

  // while loop
  public static void reverseArr(int[] arr){
    int start = 0, end = arr.length-1;

    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  // for loop
  public static void reversearray(int[] arr){

    int start = 0, end = arr.length-1;

    for (int i = start; i < end; i++) {
      int temp = arr[i];
      arr[i] = arr[end];
      arr[end] = temp;
      end--;
    }
  }

  public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4, 5, 6, 89, 90};

      reversearray(arr);
      for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
      }
  }
}
