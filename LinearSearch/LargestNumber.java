package LinearSearch;

public class LargestNumber {

  public static int largestNum(int numbers[]){
    int largest = -1;

    for(int i = 0; i < numbers.length; i++){
      if(numbers[i] > largest){
        largest = numbers[i];
      }
    }

    return largest;
  }

  public static void main(String[] args){
    int numbers[] = {1, 4, 7, 9, 8, 45};

    int max = largestNum(numbers);
    System.out.println("Largest number in the array is: " + max);
  }
}
