import components.random.Random;
import components.random.Random1L;
import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Function
 */
public final class Function {
	
	/**
	 * Version 1 add up two numbers 
	 * @param num1
	 * @param num2
	 * @return
	 */
	static SimpleWriter out = new SimpleWriter1L(); 
	
	private static int addTwoNums(int num1, int num2) {
		
		int res = num1 + num2;
		
		return res;
		
	}
	public static void addTwoNumsPrint(int num1, int num2, SimpleWriter output) {
		
		int res = num1 + num2;
//		SimpleWriter output = new SimpleWriter1L();
		output.println(res);
//		output.close(); 
		
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
        
//        int a = 3; 
//        a++;  //a--// a = a + 1; 
//        
//        if (++a > 4 ) { // a = a+1; a > 4 // a++ > 4 -> a > 4; a = a + 1;
//        	output.println("goes to if:" + a);
//        } else {
//        	output.println(a);
//        }
        
        /**
         * Function 
         */
        
        output.println(addTwoNums(2, 3)); // Math.pow(2, 3)
//        output.println(res);
        addTwoNumsPrint(2, 3, output);
        
        input.close();
        output.close();
    }
    

}


