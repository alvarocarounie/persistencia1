package ejercicio1;


	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;

	public class MatrixFileWriter {
	    public static void writeMatrixToFile(int[][] matrix, String filePath) throws IOException {
	        File file = new File(filePath);
	        FileWriter writer = new FileWriter(file);

	       
	        writer.close();
	    }
	}


