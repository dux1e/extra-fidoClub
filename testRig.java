

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class testRig.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class testRig
{
    private Dog dog1;
    private Member member1;

    
    

    /**
     * Default constructor for test class testRig
     */
    public testRig()
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
        dog1 = new Dog("Tyrk", "Broholmer");
        member1 = new Member("Joakim", "+45 11 22 33 44");
        member1.setDog(dog1);
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
