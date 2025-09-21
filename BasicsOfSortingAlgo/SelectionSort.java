class SelectionSort{
	public static void main(String[] args){
		int[] arr = {7,11,15,20,1,25};
		int n = arr.length;
		
		for(int i = 0; i < n-1; i++){
			int minPos = i;
			for(int j = i+1; j < n; j++){
				if(arr[minPos] > arr[j]){
					minPos = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[minPos];
			arr[minPos] = temp;
		}
		for(int i = 0; i < n; i++){
			System.out.println(arr[i]);
		}
	}
}