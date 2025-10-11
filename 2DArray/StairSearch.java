class StairSearch{

	public static boolean stairSearch(int[][] matrix, int key){
		int row = 0, col = matrix[0].length-1;
		
		while(row < matrix.length && col >= 0){
			if(key == matrix[row][col]){
				System.out.print("Key is found at (" + row + ", " + col + ")");
				return true;
			}
			else if(key < matrix[row][col]){
				col--;
			}
			else if(key > matrix[row][col]){
				row++;
			}
		}
		System.out.print("Key is not found");
		return false;
	}
	
	public static boolean stairSearchTwo(int[][] matrix, int key){
		int row = matrix.length-1, col = 0;
		
		while(col < matrix[0].length && row >= 0){
			if(key == matrix[row][col]){
				System.out.print("Key is found at (" + row + ", " + col + ")");
				return true;
			}
			else if(key < matrix[row][col])
				row--;
			else if(key > matrix[row][col])
				col++;
		}
		System.out.print("Key is not found");
		return false;
		
	}
	
	public static void main(String[] args){
		int[][] matrix = {
			{10,20,30,40},
			{15,25,35,45},
			{27,29,37,48},
			{32,33,39,50}
		};
		int key = 33;
	
		stairSearchTwo(matrix, key);
	}
}