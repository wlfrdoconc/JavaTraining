package workbook6.dataprocessingloops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {

        // 1. Create an Array List to contain people's names
        ArrayList<Person> people = new ArrayList<>();

        // 2. Add 10 people to the list
        people.add(new Person("John", "Smith", 25));
        people.add(new Person("Jane", "Doe", 22));
        people.add(new Person("Michael", "Brown", 30));
        people.add(new Person("Emily", "Davis", 24));
        people.add(new Person("David", "Wilson", 28));
        people.add(new Person("Sarah", "Johnson", 26));
        people.add(new Person("James", "Taylor", 32));
        people.add(new Person("Jessica", "Lee", 23));
        people.add(new Person("Daniel", "Garcia", 27));
        people.add(new Person("Ashley", "Martinez", 21));

        // 3. Prompt the user for a name to search
        Scanner read = new Scanner(System.in);

        System.out.print("Enter a first or last name: ");
        String searchName = read.nextLine();

        // 4. Create a list to store the matching people
        List<Person> matchingPeople = new ArrayList<>();

        for (Person person : people) {
            if (person.getFirstName().equalsIgnoreCase(searchName) ||
                    person.getLastName().equalsIgnoreCase(searchName)) {

                matchingPeople.add(person);
            }
        }

        // 5. Display matching people
        for (Person person : matchingPeople) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }

        // 6. Initialize variables
        int totalAge = 0;
        int oldestAge = people.get(0).getAge();
        int youngestAge = people.get(0).getAge();

        // 7. Loop through the original list
        for (Person person : people) {

            totalAge += person.getAge();

            if (person.getAge() > oldestAge) {
                oldestAge = person.getAge();
            }

            if (person.getAge() < youngestAge) {
                youngestAge = person.getAge();
            }
        }

        // 8. Calculate the average and display results
        double averageAge = (double) totalAge / people.size();

        System.out.println("Average age: " + averageAge);
        System.out.println("Oldest age: " + oldestAge);
        System.out.println("Youngest age: " + youngestAge);
    }
}
