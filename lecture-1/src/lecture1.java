import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 *
 *
 * @author Rui Q.  
 */
public final class lecture1 {

    /**
     * No argument constructor--private to prevent instantiation.
     */
    private lecture1() {
        // no code needed here
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments; unused here
     */
    public static void main(String[] args) {
        
    	/** 
         * 1. Simplest java program 
         */
    	
    	System.out.println("Hello World"); 
    	
    	SimpleWriter out = new SimpleWriter1L(); 
    	
    	out.println("Hello World");
    	
    	
    	
    	/**
    	 * 2. Strongly typed language 
    	 */
        
    	String info = "Hello World"; 
    	out.println(info);
    	
    	out.close();
        
    }

}
