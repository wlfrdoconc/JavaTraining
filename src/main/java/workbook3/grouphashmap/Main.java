package workbook3.grouphashmap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Person 2: Create a HashMap and add grades
        HashMap<String, Integer> grades = new HashMap<>();

        grades.put("Sama", 95);
        grades.put("Will", 88);
        grades.put("Ron", 92);

        // Person 3: Retrieve and update grades
        System.out.println("Sama's grade: " + grades.get("Sama"));

        grades.replace("Will", 98);

        // Person 4: Remove a student
        grades.remove("Ron");

        // Display all remaining students with the grades
        for (String student : grades.keySet()) {
            System.out.println(student + ": " + grades.get(student));
        }

        // Display just the grades of the student -
        for (Integer grade: grades.values()) {
            System.out.println(grade);
        }

        // .keySet() only returns all of the keys from the HashMap
        for (String student : grades.keySet()) {
            System.out.println(student);
        }

    }
}
