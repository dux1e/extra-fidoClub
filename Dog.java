
/**
 * Write a description of class Dog here.
 *
 * @author Joakim Christensen
 * @version 30-09-2020
 */
public class Dog
{
    // Instance variablese
    private String name;
    private String breed;
    
    // Constructor
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    
    // Mutator functions
    
    // Accessor function
    public void printInfo() {
        System.out.println("Dog name: " + name);
        System.out.println("Dog breed: " + breed);
    }
    
    public String getName() {
        return name;
    }
    
    public String getBreed() {
        return breed;
    }
    
    
}
