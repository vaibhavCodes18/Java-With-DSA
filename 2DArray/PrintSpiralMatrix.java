class PrintSpiralMatrix{
	
	public static void printMatrix(int[][] matrix){
		int startRow = 0;
		int startCol = 0;
		int endRow = matrix.length-1;
		int endCol = matrix[0].length-1;
		
		while(startRow <= endRow && startCol <= endCol){
			//top
			for(int i = startCol; i <= endCol; i++){
				System.out.print(matrix[startRow][i]+" ");
			}
			
			for(int i = startRow+1; i <= endRow; i++){
				System.out.print(matrix[i][endCol]+" ");
			}
			
			for(int i = endCol-1; i >= startCol; i--){
				System.out.print(matrix[endRow][i]+" ");
			}
			
			for(int i = endRow-1; i >= startRow+1; i--){
				System.out.print(matrix[i][startCol]+" ");
			}
			
			startRow++;
			startCol++;
			endRow--;
			endCol--;
		}
	}
	
	public static void main(String[] args){
		int[][] matrix = {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16}
		};
		printMatrix(matrix);
	}
}