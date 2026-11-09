package workbook4.hoteloperations;

// Person superclass that Guest and Clerk will extend from

public class Person {
    private String name;
    private int age;
    private int personId;
    private String phoneNumber;
    private String emailAddress;

    // Constructors

    // Empty constructor
    public Person() {

    }

    // Parameterized Constructor
    public Person(String name, int age, int personId, String phoneNumber, String emailAddress) {
        this.name = name;
        this.age = age;
        this.personId = personId;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    // Overloaded Parameterized Constructor
    public Person(String name, int personId) {
        this.name = name;
        this.personId = personId;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

}
