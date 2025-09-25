class SelectionSortDesc{
	public static void pritnArr(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args){
		int[] arr = {5, 4, 1, 3, 2};
		for(int i = 0; i < arr.length-1; i++){
			int maxPos = i;
			for(int j = i+1; j < arr.length; j++){
				if(arr[maxPos] < arr[j]){
					maxPos = j;
				}
			}
			int temp = arr[maxPos];
			arr[maxPos] = arr[i];
			arr[i] = temp;
		}
		pritnArr(arr);
	}
}