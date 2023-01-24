import components.random.Random;
import components.random.Random1L;
import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Function
 */
public final class TracingTable {

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

		/**
		 * Passing by copy / Passing by value
		 */

		int i = 4, j = 1, n = 0;
		while (i > j) { 
			if (n % 2 == 0) {  
				i--;
			} else { 
				j++;
			}
			n++; 
		}
		input.close();
		output.close();
	}

}
