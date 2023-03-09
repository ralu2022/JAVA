package objectContainersAssignment.I;

/*
 * Another requirement of the assignment is to use a HashMap with structure <Person, List<Hobby> and print a Person with name of the hobbies and countries
 *
 * For the first parameter Person is needed to declare object of Person class.
 *
 * For the second parameter is needed for a list to be defined of type Hobby. For adding elements to this list, we also need a list of addresses because the last
 * field for Hobby class is List<Address>. Therefore, first step is to add elements to Address list, then to Hobby list (with add function).
 *
 * After adding elements to Hobby list, the HashMap can be populated, using put function.
 *
 *
 * */


import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class HashMapHobby {

    public static void main(String[] args) {

        HashMap<Person, List<Hobby>> hobbies = new HashMap<>();

        Person victorPopescu = new Person("1580714070021", "Popescu Victor", "65",
                "Grivitei 65, Brasov", "mechanic");
        Person anaIrimes = new Person("2780911080036", "Irimes Ana", "45",
                "Mihai Viteazu 74, Sibiu", "Java programmer");
        Person bogdanStana = new Person("1860815060045", "Stana Bogdan", "37",
                "Calea Bucuresti 32A, Brasov", "student");


        Address address1 = new Address("Carpatilor", "160", "Brasov", "Romania");

        List<Address> address = new ArrayList<>();
        address.add(address1);

        Hobby hobbyCycling = new Hobby("Cycling", 2, address);
        Hobby hobbySwimming = new Hobby("Swimming", 1, address);
        Hobby hobbyClimbing = new Hobby("Climbing", 2, address);

        List<Hobby> hobby = new ArrayList<>();
        hobby.add(hobbyCycling);
        hobby.add(hobbySwimming);
        hobby.add(hobbyClimbing);

        hobbies.put(victorPopescu, hobby);

        System.out.print(hobbies);

    }
}

