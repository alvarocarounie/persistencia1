package ejercicio1;

    
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.Scanner;


	class MatrixMultiplier ();
	    public static void main(String[] args) {
	        String matrix1FilePath = "matrix1.txt";
	        String matrix2FilePath = "matrix2.txt";
	        String resultFilePath = "result.txt";

	        try {
	            int[][] matrix1 = MatrixFileReader.readMatrixFromFile(matrix1FilePath);
	            int[][] matrix2 = MatrixFileReader.readMatrixFromFile(matrix2FilePath);
	            int[][] result = multiply(matrix1, matrix2);
	            MatrixFileWriter.writeMatrixToFile(result, resultFilePath);
	            System.out.println("Matrices multiplied successfully. Result saved in result.txt");
	        } catch (IOException e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        }
	    }

	    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
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

	class MatrixFileReader {
	    public static int[][] readMatrixFromFile(String filePath) throws IOException {
	        File file = new File();
	        Scanner scanner = new Scanner(file);

	        int rows = 0;
	        int cols = 0;

	      
	        while (scanner.hasNextLine()) {
	            rows++;
	            String[] rowValues = scanner.nextLine().split(" ");
	            cols = rowValues.length;
	        }

	        int[][] matrix = new int[rows][cols];

	       
	        scanner = new Scanner(file);

	      
	        for (int i = 0; i < rows; i++) {
	            String[] rowValues = scanner.nextLine().split(" ");
}
			return null;
}}