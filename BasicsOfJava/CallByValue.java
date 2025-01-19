public class CallByValue {

  public static void swap(int x, int y){
    int temp = x;
    x = y;
    y = temp;

    System.out.println("This is copy x = " + x + ", y = " + y);
  }

  public static void main(String[] args) {
    int x = 10;
    int y = 5;
    swap(x, y);
    System.out.println("This is original x = " + x + ", y = " + y); // not change this x & y values, becz this argument values  actully is copy of original value, original value will not changed copy value is changed
  }
}
