package objectContainersAssignment.I;

/* Defining a class Hobby is one of the requirements of the assignment, with the mandatory fields: name, frequency, List<Address>
 *
 * <p>
 * Method Hobby is a constructor that will be invoked when an object will be created. It is used to give initial values to class members.
 * @param hobbyName - name of the hobby (e.g. cycling, swimming, climbing)
 * @param frequency - tells the number of times the hobby is being practice per week
 * @param List<Address> - stores the address where a Person is living.
 *
 * <p>
 * Method toString is used to display our object as a string (hobbyName and address fields - requested in HashMap file).
 *
 * */

import java.util.List;

public class Hobby {

    public String hobbyName;

    public int frequency;

    List<Address> address;

    public Hobby(String hobbyName, int frequency, List<Address> address) {
        this.hobbyName = hobbyName;
        this.frequency = frequency;
        this.address = address;
    }

    @Override
    public String toString() {
        return "\n" + "- name: " + hobbyName + "\n" +
                "- country: " + address;
    }


}
