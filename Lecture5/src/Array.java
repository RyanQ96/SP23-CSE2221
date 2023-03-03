import java.util.Arrays;
import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Function
 */
public final class Array {
	
	
	public static String generateSeries(int num) {
		int currentNum = num; 
		String res = ""; 
		while (currentNum > 1) {
//			out.print(currentNum + ", "); 
			res += currentNum + ", ";
			if (currentNum % 2 == 0) {
				currentNum /= 2; 
			} else {
				currentNum = currentNum * 3 + 1; 
			}
		}
//		out.println(currentNum); 
		res += currentNum; 
		return res; 
	}
	
	
	public static int[] insertIntoArr(int[] arr, int element) {
		
		int[] expandedArr = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			expandedArr[i] = arr[i];
		}
		expandedArr[expandedArr.length - 1] = element; 
		return expandedArr; 
	}
	
	/**
	 * Main method.
	 * 
	 * @param args the command line arguments; unused here
	 */
	public static void main(String[] args) {
		/*
		 * Open input and output streams
		 */
		SimpleReader input = new SimpleReader1L();
		SimpleWriter output = new SimpleWriter1L();
//		output.println(generateSeries(17));
		/**
		 * Array 
		 */
		int[] arr = new int[4];
		arr[0] = 1;
		arr[1] = 2; 
		arr[2] = 3;
		arr[3] = 4;
		
//		int[] arr2 = {1, 2, 3, 4};
		output.println(Arrays.toString(arr));
		arr = insertIntoArr(arr, 100);
		output.println(Arrays.toString(arr));
		input.close();
		output.close();
	}

}
