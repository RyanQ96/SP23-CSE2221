
import java.util.Random;

import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

public class Lecture3 {
	/**
	 * Main method.
	 *
	 * @param args the command line arguments; unused here
	 */
	public static void main(String[] args) {

		SimpleWriter consoleOut = new SimpleWriter1L();
		/**
		 * Variables & Operations
		 */

		double aa = .1;
		double bb = .2;
		double res = aa + bb;

		boolean flag = true; // false
		boolean flag2 = !flag;

		char c = 'c';
		String hello = "Hello";
		int a = 4;
		int b = 3 + 1;
		int cc = a % b;

//    	consoleOut.println(a == b);
//    	consoleOut.println(a != b);

//    	consoleOut.print(cc);

		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = "He" + "llo";

		consoleOut.println(s1 == s2);
		consoleOut.println(s1 == s3);
		consoleOut.println(s1.equals(s2));

		Random rnd = new Random();
		consoleOut.println(rnd.nextDouble());
		int diceNumber;
		double diceProb = rnd.nextDouble();
		if (diceProb < .333) {
			diceNumber = 1;
		} else if (diceProb < .667) {
			diceNumber = 2;
		} else {
			diceNumber = 3;
		}

		consoleOut.println(diceNumber);
		/**
		 * Conditions
		 */

		int sum = 0;
		consoleOut.println(System.identityHashCode(aa));
		consoleOut.println(System.identityHashCode(bb));
//    	sum = sum + 1;
//    	sum = sum + 2;
//    	sum = sum + 3;
//    	sum = sum + 4;
//    	for (int i = 1; i <= 4; i++) {
//    		sum = sum + i;
//    	}
		int target = 4;
		int i = 1;
		while (i <= target) {
			sum = sum + i;
			i = i + 1; // i += 1 // i++ // i-- -> i -= 1 -> i = i - 1
			i *= 1; // i = i * 1;
		}

		consoleOut.println(sum);

		consoleOut.close();

	}

	private static Random Random1L() {
		// TODO Auto-generated method stub
		return null;
	}

}
