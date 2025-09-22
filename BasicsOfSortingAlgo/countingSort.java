class countingSort{
	public static void pritnArr(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] ar){
		int[] arr = {4, 5, 6, 7, 2, 1};
		int largest = Integer.MIN_VALUE;
		
		for(int i = 0; i<arr.length; i++){
			largest = Math.max(largest, arr[i]);
		}
		
		int[] count = new int[largest+1];
		for(int i = 0; i<arr.length; i++){
			count[arr[i]]++;
		}
		int j = 0;
		for(int i = 0; i<count.length;i++){
			while(count[i] > 0){
				arr[j] = i;
				j++;
				count[i]--;
			}
		}
		pritnArr(arr);
	}
}