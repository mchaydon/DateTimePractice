package practice;

/**
 * This class represents a person in the real world.
 * 
 * @author Mike Haydon, mike.c.haydon@gmail.com
 * @version 1.00
 */
public class Person {
    private String firstName;
    private String lastName;
    private int x; /** The X-factor for this person */

    /** Default constructor */
    public Person() {}

    /**
     * Convenience constructor for quickly creating and initializing 
     * an object.
     * 
     * @param firstName - not validated
     * @param lastName - not validated+
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
}
