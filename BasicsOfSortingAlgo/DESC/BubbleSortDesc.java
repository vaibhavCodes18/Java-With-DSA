class BubbleSortDesc{
	public static void pritnArr(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args){
		int arr[] = {3, 6, 2, 1,8, 7, 4, 5, 3, 1};
		
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length-1-i; j++){
				if(arr[j] < arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		pritnArr(arr);
	}
}