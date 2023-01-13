import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;

/**
 * Simple HelloWorld program (clear of Checkstyle and SpotBugs warnings).
 *
 * @author Rui Q.
 */
public final class HelloWorld {

    /**
     * No argument constructor--private to prevent instantiation.
     */
    private HelloWorld() {
    // no code needed here
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments; unused here
     */
    public static void main(String[] args) {
        SimpleWriter consoleOut = new SimpleWriter1L();
        SimpleReader keyboardIn = new SimpleReader1L();
        consoleOut.print("please enter your name: ");
        String name = keyboardIn.nextLine();
        // print out the result
        consoleOut.println("Hello " + name);
        // close IO stream
        consoleOut.close();
        keyboardIn.close();
    }

}
