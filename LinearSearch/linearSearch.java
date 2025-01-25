public class linearSearch {

  public static int linearSearc(int numbers[], int key){
    for(int i = 0; i < numbers.length; i++){
      if(numbers[i] == key){
        return i;
      }
    }
    return  -1;
  }

  public static void main(String[] args) {
    int numbers[] = {1, 45, 67, 89, 44, 34, 7};
    int key = 89;

    int index = linearSearc(numbers, key);

    if(index == -1){
      System.out.println("NOT FOUND");
    }
    else{
      System.out.println("Element " + key + " is present at index " + index);
    }
  }
}
