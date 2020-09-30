

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class JJJTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class JJJTest
{
    private Member Joe;
    private Member Jane;
    private Member Jean;
    private Dog JoesHund;
    private Dog JanesHund;
    private Dog JeansHund;

    /**
     * Default constructor for test class JJJTest
     */
    public JJJTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        Joe = new Member("Joe", null);
        Joe.printInfo();
        Jane = new Member("Jane", null);
        Jean = new Member("Jean", null);
        JoesHund = new Dog("Fiddo", "Gravhund");
        JanesHund = new Dog("Basse", "Sankt Berner");
        JeansHund = new Dog("Olse", "Labrador");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
