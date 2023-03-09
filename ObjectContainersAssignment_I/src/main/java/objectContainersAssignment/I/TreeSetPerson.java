package objectContainersAssignment.I;

/* TreeSet collection element is required to be created using the 2 Comparators (NameComparator and AgeComparator).
 *
 *  For adding elements in the TreeSet 3 persons are to be declared and function add to be used.
 *  For iterate and printing two methods were used: one for the case when NameComparator is used and one for when the AgeComparator is used.
 *
 *  @param NameComparator - compares the objects of type Person from name point of view
 *  @param AgeComparator - compares the objects of type Person from age point of view
 *
 *  The iterator is used to go from one element to another using hasNext and next.
 * */


import java.util.List;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Iterator;


public class TreeSetPerson {
    public static void main(String[] args) {

        TreeSet<Person> personsNameComparator = new TreeSet<>(new NameComparator());
        TreeSet<Person> personsAgeComparator = new TreeSet<>(new AgeComparator());

        Person victorPopescu = new Person("1580714070021", "Popescu Victor", "65",
                "Grivitei 65, Brasov", "mechanic");
        Person anaIrimes = new Person("2780911080036", "Irimes Ana", "45",
                "Mihai Viteazu 74, Sibiu", "Java programmer");
        Person bogdanStana = new Person("1860815060045", "Stana Bogdan", "37",
                "Calea Bucuresti 32A, Brasov", "student");

        personsNameComparator.add(victorPopescu);
        personsNameComparator.add(anaIrimes);
        personsNameComparator.add(bogdanStana);

        personsAgeComparator.add(victorPopescu);
        personsAgeComparator.add(anaIrimes);
        personsAgeComparator.add(bogdanStana);

        printTreeSetNameComparator(personsNameComparator);
        printTreeSetAgeComparator(personsAgeComparator);
    }

    public static void printTreeSetNameComparator(TreeSet<Person> personsNameComparator) {

        System.out.println("\n");

        System.out.println("The TreeSet has the following data (name comparator): " + "\n");
        Iterator<Person> personsIteratorNameComparator = personsNameComparator.iterator();

        while (personsIteratorNameComparator.hasNext()) {
            final Person nextPerson = personsIteratorNameComparator.next();

            System.out.print("- Name: ");
            System.out.print(nextPerson.name + "\n");
            System.out.print("- Age: ");
            System.out.print(nextPerson.age + "\n");

        }

    }

    public static void printTreeSetAgeComparator(TreeSet<Person> personsAgeComparator) {

        System.out.println("\n");

        System.out.println("The TreeSet has the following data (age comparator): " + "\n");
        Iterator<Person> personsIteratorAgeComparator = personsAgeComparator.iterator();

        while (personsIteratorAgeComparator.hasNext()) {
            final Person nextPerson = personsIteratorAgeComparator.next();

            System.out.print("- Name: ");
            System.out.print(nextPerson.name + "\n");
            System.out.print("- Age: ");
            System.out.print(nextPerson.age + "\n");

        }

    }
}
