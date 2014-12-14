package com.map.dev.algo.matrix;

public class MatrixUtil {
	
	
	
	public static int getMinElementVector(int[] mat)
	{
		int result = -1;
		for (int i = 0; mat!= null && i < mat.length; i++) {
			if(result == -1)
			{
				result = 0;
			}
			else if(mat[result] > mat[i])
			{
				result = i;
			}
		}
		return result;
		
	}
	
	// not considerer duplicate values and negaticve case not handled
	public static MatrixBlock getMinElement2DMatrix(int[][] mat)
	{
		MatrixBlock result = new MatrixBlock();
		result.row = 0;
		result.column = 0;
		
		int[] minColumn = new int[mat.length];
		for (int i = 0; i < mat.length; i++) 
		{
			int[] row = mat[i];
			for (int j = 0; j < row.length; j++) 
			{
				if(i ==0  && j ==0)
				{
					result.value = mat[0][0];
				}else if(result.value > row[j])
				{
					result.row = i;
					result.column = j;
					result.value = mat[i][j];
				}
			}	
		}
		return result;
	}
	
	
	
	
	
	
	
	
	

}
