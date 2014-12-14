package com.map.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.map.dev.algo.matrix.MatrixBlock;
import com.map.dev.algo.matrix.MatrixUtil;

public class ShortestDistanceTestCase {

	@Test
	public void test() {
		
		int[][] testData = {{4,2,3},{6,1,10},{9,2,4}};
		int resultRow = 1;
		int resultColumn = 1;
		MatrixBlock block = MatrixUtil.getMinElement2DMatrix(testData);
		
		Assert.assertTrue(block.row == resultRow && block.column == resultColumn);
//		fail("Not yet implemented");
	}

}
