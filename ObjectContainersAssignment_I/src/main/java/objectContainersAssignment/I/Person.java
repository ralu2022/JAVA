package objectContainersAssignment.I;

/*  The first task of the assignment is to store Person in a TreeSet. Therefore, we will need to define a class named
 *   Person.
 *   Moving forward, we are asked to define 2 Comparators (one for name and one for age). So, from here we deduct that
 *   it mandatory to have as fields name and age in our class Person.
 *
 *   <p>
 *   Method Person is a constructor that will be invoked when an object will be created. It is used to give initial values to class members.
 *
 *   @param personalIdentificationNumber
 *   @param name - name of the person
 *   @param age  - age of the person
 *   @param address - address where the person lives
 *   @param occupation - occupation of the person
 *
 *   <p>
     Method toString is used to display our object as a string (all fields).
 *
 *  <p>
     Methods equals() and hashCode() are used to compare two objects.

 * */


import java.util.Objects;

public class Person {
    public String personalIdentificationNumber;
    public String name;
    public String age;
    public String address;
    public String occupation;

    public Person(String personalIdentificationNumber, String name, String age, String address, String occupation) {
        this.personalIdentificationNumber = personalIdentificationNumber;
        this.name = name;
        this.age = age;
        this.address = address;
        this.occupation = occupation;
    }

    @Override

    public String toString() {
        return "\n" + "The selected person has the following data: " + "\n" + "- personal identification number: " +
                personalIdentificationNumber + "\n" + "- name: " + name + "\n" + "- age: " + age + "\n" + "" +
                "- address: " + address + "\n" + "- occupation: " + occupation + "\n";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        final Person person = (Person) object;

        if (!Objects.equals(name, person.name)) {
            return false;
        }

        return Objects.equals(age, person.age);
    }

    @Override

    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }

}
