import components.random.Random;
import components.random.Random1L;
import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Function
 */
public final class PassingByValue {
	
	
	
	public static void switchValue(int num1, int num2, SimpleWriter consoleOut) {		
		int tmp = num1; 
		num1 = num2; 
		num2 = tmp;
		consoleOut.close(); 
	}
	
    /**
     * Main method.
     * 
     * @param args
     *            the command line arguments; unused here
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
        
        int a = 3; 
        int b = 4; 
        
        switchValue(a, b, output); 
        output.println("Value of a: " + a + "; Value of b: " + b);
        
        
        input.close();
        output.close();
    }
    

}


