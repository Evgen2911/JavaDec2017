package lesson171226;

import java.util.Arrays;

public class TwoDimensionalArrayExample {
	
	public static void main(String[] args) {
		
		int[] a = new int[0];
		
		int[][] matrix = new int[3][];
		
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(matrix[i]);
		}
		
		int[][] matrix2 = new int[3][3];
		
		printMatrix(matrix2);
		
		int[] m3[] = {
				{0,1,2}, 
				{0,1}, 
				{0}};
		
		printMatrix(m3);
		
		int m4[][] = new int[3][];
		
		m4[0] = new int[4];
//		m4[1] = new int[6];
		m4[2] = new int[8];
		
		printMatrix(m4);
		
		printMatrix2(m4);
		printMatrix2(null);
	}

	public static void printMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.println(Arrays.toString(m[i]));
		}
	}

	public static void printMatrix2(int[][] m) {
		if (m == null) {  // guard condition
			return;
		}
		for (int i = 0; i < m.length; i++) {
			if (m[i] == null) {
				System.out.println("null");
				continue;
			}
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j]);
			}
		}
	}
	
}
