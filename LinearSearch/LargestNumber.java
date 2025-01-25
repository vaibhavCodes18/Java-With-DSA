package LinearSearch;

public class LargestNumber {

  public static int largestNum(int numbers[]){
    int largest = Integer.MIN_VALUE;
    int smallest = Integer.MAX_VALUE;

    for(int i = 0; i < numbers.length; i++){
      if(numbers[i] > largest){
        largest = numbers[i];
      }
      if(smallest > numbers[i]){
        smallest = numbers[i];
      }
    }
    System.out.println("Smallest number is " + smallest);
    return largest;
  }
                              
  public static void main(String[] args){
    int numbers[] = {1, 4, 87, 9, 8, 45};

    int max = largestNum(numbers);
    System.out.println("Largest number in the array is: " + max);
  }
}
