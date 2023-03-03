import java.util.Arrays;

import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumber1L;
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
	
	
	
	public static boolean compareArray(int[] a, int[] b) {
		boolean flag = true; 
		if (a.length == b.length) {
			for (int i = 0; i < a.length && flag; i++) {
				if (a[i] != b[i]) {
					flag = false;
				}
			}
			
		} else {
			flag = false; 
		}
		return flag;
	}
	
	public static boolean compareArrayNN(NaturalNumber[] a, NaturalNumber[] b) {
		boolean flag = true; 
		if (a.length == b.length) {
			for (int i = 0; i < a.length && flag; i++) {
				if (!a[i].equals(b[i])) {
					flag = false;
				}
			}
			
		} else {
			flag = false; 
		}
		return flag;
	}
	
	/**
	 * 
	 * @param n
	 * @require n >= 0
	 * @return
	 */
	public static int sum3(int n) {
		int res = 0;
		if (n == 0) {
			res = 0; 
		} else {
			res = n + sum3(n-1);
		}
		return res;
	}
	
	public static String reverse(String s) {
		String output = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char cur = s.charAt(i);
			output += cur;
		}
		return output; 
	}
	
	public static int sum(int n) {
		int sum = 0; 
		for (int i = 1; i < n+1; i++) {
			sum += i;
		}
		return sum;
	}
	/**
	 * 
	 * @param n
	 * @return
	 * @require n >= 0 
	 * 	
	 */
	public static int sum2(int n) {
		int res = 0;
		if (n > 0) {
			res = n + sum2(n-1);
		}
		return res; 
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
        
        int[] a = {1, 2, 3, 4, 5}; 
        int[] b = new int[a.length + 1];
        NaturalNumber n1 = new NaturalNumber1L(3);
        NaturalNumber n2 = new NaturalNumber1L(4);
        // n1.transferFrom(n2);// 
        n1.copyFrom(n2);
        n2.copyFrom(new NaturalNumber1L(0));
        String s1 = "Hello";
        String s2 = "Hello";
        s1.equals(s2);
        input.close();
        output.close();
    }
    

}


