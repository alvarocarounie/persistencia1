package ejercicio1;



	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;

	public class MatrixFileReader {
	    public static int[][] readMatrixFromFile(String filePath) throws FileNotFoundException {
	        File file = new File(filePath);
	        Scanner scanner = new Scanner(file);

	      

	        scanner.close();
			return null;
	    }
	}


