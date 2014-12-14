package com.map.dev.algo.matrix;

public class MatrixBlock {


	public int row;
	public int column;
	public int value;



	public static MatrixBlock[] convertVectorToArrayOfMatrixBlock(int[] mat)
	{
		
		MatrixBlock[] result = new MatrixBlock[mat.length];

		for (int i = 0; i < mat.length; i++) 
		{
			MatrixBlock temp = new MatrixBlock();
			temp.column = i;
			temp.row = 0;
			temp.value = mat[i];
			result[i]  = temp;
			
		}
		
		return result;
	}
	
	
	public static MatrixBlock[][] convert2DMatrixTo2dArrayOfMatrixBlock(int[][] mat)
	{
		
		MatrixBlock[][] result = new MatrixBlock[mat.length][mat[0].length];
		
		
		for (int i = 0; i < mat.length; i++) 
		{
			int[]  vector = mat[i];
			
			for (int j = 0; j < result.length; j++) 
			{
				
				MatrixBlock temp = new MatrixBlock();
				temp.column = i;
				temp.row = j;
				temp.value = vector[j];
				result[i][j]  = temp;
			}
			
		}
		
		return result;
	}

	
	



}
