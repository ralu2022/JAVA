package objectContainersAssignment.I;

/* One of the requests of the assignment is to create a Hobby class that has a field List<Address>. From here we conclude
*  that we need a class called Address.
*
*  <p>
   Method Person is a constructor that will be invoked when an object will be created. It is used to give initial values to class members.
*
*  @param streetName  - name of the street
*  @param streetNumber - number of the street where the person has its house/location
*  @param town - name of the town where the person has its house/location
*  @param country - name of the country where the person has its house/location
*
*  <p>
   Method toString is used to display our object as a string (in this case only the country field).
*
* */

public class Address {

    public String streetName;
    public String streetNumber;
    public String town;
    public String country;

    public Address(String streetName, String streetNumber, String town, String country) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.town = town;
        this.country = country;
    }

    public String toString() {
        return country + " ";
    }

}


