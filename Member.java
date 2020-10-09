
/**
 * Write a description of class Member here.
 *
 * @author Joakim Christensen
 * @version 30-09-2020
 */

import java.util.ArrayList;

public class Member
{
    // Instance variablese
    private String name;
    private String phoneNo;
    private String email;
    private int paidYear;
    private ArrayList<Dog> dogs;

    // Constructor
    public Member(String name, String phoneNo) {
        this.dogs = new ArrayList<>();
        this.name = name;
        this.phoneNo = phoneNo;
    }

    // Mutator functions
    public void setMail(String email) {
        this.email = email;
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public void payDog(int YYYY) {
        paidYear = YYYY;
    }

    // Accessor functions
    public void printInfo() {
        System.out.println("Member name: " + name);
        System.out.println("Member phone number: " + phoneNo);
        if(email != null) {
            System.out.println("Member mail: " + email);
        } else {
            System.out.println("The member has not entered a mail");
        }
        if(dogs != null) {
        getDog();
        } else {
        System.out.println("The member hos not yet assigned a dog");
        }
    }

    public boolean isFeeDue(int thisYear) {
        boolean feeDue;
        feeDue = false;
        for(Dog dog : dogs) {
            if (thisYear == paidYear) {
                feeDue = true;
            }
        }
        return feeDue;
    }

    public boolean hasDog() {
        boolean hasDog;
        hasDog = false;
        if(dogs != null) {
            hasDog = true;
        }
        return hasDog;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phoneNo;
    }

    public String getMail() {
        return email;
    }

    public void getDog() {
        for(Dog d : dogs) {
            d.printInfo();
        }
    }
}
