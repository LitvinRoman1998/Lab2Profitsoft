package lab.profitsoft.people;

public class Person {
    String lastName;
    String firstName;
    String patronimic;

    public Person(String lastName, String firstName, String patronimic) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronimic = patronimic;
    }

    public Person(){
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronimic() {
        return patronimic;
    }
}
