package workbook6.dataprocessingstreams;

import workbook6.dataprocessingloops.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {

        // 1. Create an Array List to contain people's names
        ArrayList<workbook6.dataprocessingloops.Person> people = new ArrayList<>();

        // 2. Add 10 people to the list
        people.add(new workbook6.dataprocessingloops.Person("John", "Smith", 25));
        people.add(new workbook6.dataprocessingloops.Person("Jane", "Doe", 22));
        people.add(new workbook6.dataprocessingloops.Person("Michael", "Brown", 30));
        people.add(new workbook6.dataprocessingloops.Person("Emily", "Davis", 24));
        people.add(new workbook6.dataprocessingloops.Person("David", "Wilson", 28));
        people.add(new workbook6.dataprocessingloops.Person("Sarah", "Johnson", 26));
        people.add(new workbook6.dataprocessingloops.Person("James", "Taylor", 32));
        people.add(new workbook6.dataprocessingloops.Person("Jessica", "Lee", 23));
        people.add(new workbook6.dataprocessingloops.Person("Daniel", "Garcia", 27));
        people.add(new workbook6.dataprocessingloops.Person("Ashley", "Martinez", 21));

        // 3. Prompt the user for a name to search
        Scanner read = new Scanner(System.in);

        System.out.print("Enter a first or last name: ");
        String searchName = read.nextLine();

        // 4. Create a list to store the matching people using streams
        List<Person> matchingPeople = people.stream()
                .filter(person -> person.getFirstName().equalsIgnoreCase(searchName) ||
                        person.getLastName().equalsIgnoreCase(searchName))
                .toList();


        // 5. Display matching people using streams
        matchingPeople.forEach(person ->
                System.out.println(person.getFirstName() + " " + person.getLastName()));

        // 6. Calculate total and average age
        int totalAge = people.stream()
                .map(Person::getAge)
                .reduce(0, Integer::sum);

        double averageAge = (double) totalAge / people.size();

        // 7. Find the oldest and youngest ages
        int oldestAge = people.stream()
                .map(Person::getAge)
                .reduce(Integer::max)
                .orElse(0);

        int youngestAge = people.stream()
                .map(Person::getAge)
                .reduce(Integer::min)
                .orElse(0);

        // 8. Display results
        System.out.println("Average age: " + averageAge);
        System.out.println("Oldest age: " + oldestAge);
        System.out.println("Youngest age: " + youngestAge);

        read.close();

    }
}
