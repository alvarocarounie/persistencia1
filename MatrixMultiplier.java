package ejercicio1;

public class MatrixMultiplier {
	public static void main(String[] args) {
   
    }

   
		
		int[][] multiply(int[][] matrix1, int[][] matrix2) {
		    int m1Rows = matrix1.length;
		    int m1Cols = matrix1[0].length;
		    int m2Cols = matrix2[0].length;

		    int[][] result = new int[m1Rows][m2Cols];

		    for (int i = 0; i < m1Rows; i++) {
		        for (int j = 0; j < m2Cols; j++) {
		            for (int k = 0; k < m1Cols; k++) {
		                result[i][j] += matrix1[i][k] * matrix2[k][j];
		            }
		        }
		    }

		    return result;
		}

    }

