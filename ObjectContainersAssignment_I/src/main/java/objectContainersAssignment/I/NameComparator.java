package objectContainersAssignment.I;


/* One of the requirements of the assignment is to use a comparator for name.
 *  <p>
 *   Method NameComparator compares two object of class Person from name point of view.
 *
 * @para person1 - first person to be compared
 * @param person2 = second person to be compared
 *
 *  Also, the Comparator Java Library is used.
 * */

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {

    @Override

    public int compare(Person person1, Person person2) {
        return person1.name.compareTo(person2.name);
    }

}
