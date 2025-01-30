public class TrappingRainwater {

  public static int trappingRainWater(int[] arr){
    int n = arr.length;
    int[] leftMax = new int[arr.length];
    int[] rightMax = new int[arr.length];
    int trappedWater = 0;

    // leftmax
    leftMax[0] = arr[0];
    for(int i = 1; i < arr.length; i++){
      leftMax[i] = Math.max(arr[i], leftMax[i-1]);
    }

    // rightmax
    rightMax[n-1] = arr[n-1];
    for(int i = n-2; i >= 0; i--){
      rightMax[i]= Math.max(arr[i], rightMax[i+1]);
    }

    for(int i = 0; i < arr.length; i++){
      int waterLEvel = Math.min(leftMax[i], rightMax[i]);
      trappedWater += waterLEvel - arr[i];
    }
    return trappedWater;
  }

  public static void main(String[] args){
    int[] arr = {4, 2, 0, 6, 3, 2, 5};
    int a = trappingRainWater(arr);
    System.out.println(a);
  }
}
