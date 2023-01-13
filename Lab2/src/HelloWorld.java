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
        SimpleWriter out = new SimpleWriter1L();
        SimpleReader keyboardIn = new SimpleReader1L();
        String name = keyboardIn.nextLine();
        out.println("Hello " + name);
        out.close();
        keyboardIn.close();
    }

}
