
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
    private String yearOfBirth;
    
    // Constructor
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    
    // Mutator functions
    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    
    // Accessor function
    public void printInfo() {
        System.out.println("Dog name: " + name);
        System.out.println("Dog breed: " + breed);
        if(yearOfBirth != null) {
            System.out.println("Dog year of birth: " + yearOfBirth);
        } else {
            System.out.println("The member has not entered year of birth for dog: " + name);
        }
    }
    
    public String getName() {
        return name;
    }
    
    public String getBreed() {
        return breed;
    }
    
    public String getYearOfBirth() {
        return yearOfBirth;
    }
}
