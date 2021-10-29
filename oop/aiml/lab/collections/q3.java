/*  Code by Desh Iyer

    3. Write a program for the following HashSet

        •	copy another collection object to HashSet object.
        •	delete all entries at one call from HashSet
        •	search user defined objects from HashSet

 */

import java.util.*;

public class q3 {
    public static void main(String[] args) {
        // Creating a Scanner object to take user input
        Scanner in = new Scanner(System.in);

        // Creating a HashSet of names
        HashSet<String> names = new HashSet<String>();

        // Adding names to the HashSet
        names.add("Bhavy");
        names.add("Bharat");
        names.add("Divy");
        names.add("Divyam");

        // Printing original HS
        System.out.println("Printing values in original HashSet:");
        for (String Value: names) {
            System.out.println(Value);
        }

        // Creating a copy of the org HS
        System.out.println("\nCreating a copy of the above HashSet");
        HashSet<String> copy = (HashSet<String>) names.clone();

        System.out.println("\nClearing original HashSet");
        names.clear();
        System.out.println("\nOriginal HashSet: " + names);

        // Taking user input
        System.out.println("\nEnter a value to search the HashSet for: ");
        String lookFor = in.next();

        // Searching HS for user inputted String
        if (copy.contains(lookFor)) {
            System.out.println("Value entered is present in the HashSet!");
        } else {
            System.out.println("Value entered is NOT present in the HashSet!");
        }

        in.close();
    }
}
