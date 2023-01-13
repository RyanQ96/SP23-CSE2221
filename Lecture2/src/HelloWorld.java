import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

public class HelloWorld {
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
    	
//    	System.out.println("Hello World"); 
    	/**
    	 * 2. Strongly typed
    	 * Format: <Type> <name> = <value/expression>; 
    	 */
    	
//    	String info = "Hello String"; 
//    	SimpleWriter consoleOut = new SimpleWriter1L(); 
//    	consoleOut.println(info);
//    	SimpleReader keyboardIn = new SimpleReader1L(); 
//    	String name = keyboardIn.nextLine();
//    	consoleOut.println(name);
//    	
    	/**
    	 * 3. IO for file
    	 */
    	SimpleWriter consoleOut = new SimpleWriter1L(); 
//    	SimpleWriter fileOut = new SimpleWriter1L("1.txt");
    	SimpleReader fileIn = new SimpleReader1L("1.txt");
//    	String info = "Hello String 2222"; 
//    	fileOut.println(info);
    	String value = fileIn.nextLine();
    	consoleOut.println(value);
    	
    	consoleOut.println("123");
    	
    	String s1 = "123132"; 
    	int i1 = 3;
    	char c = 'c';
    	double d1 = 3.3;
    	boolean flag = true;//false
    	
    	String name = "Rui"; 
    	String hello = "Hello "; 
    	
    	String res = hello + "Rui";
    	int aa = 1; 
    	int bb = 2; 
    	
    	double cc = (double)aa/bb; 
    	consoleOut.print(res);
    	
    	
    	fileIn.close();
    	consoleOut.close();
    	
    }

}
