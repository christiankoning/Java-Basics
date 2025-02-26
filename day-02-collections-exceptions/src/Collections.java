import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Collections {
    public static void main(String[] args) {
        Collecting collecting = new Collecting();

        collecting.addName("Chris");
        collecting.addName("Test");

        collecting.addNumber(14);
        collecting.addNumber(26);
        collecting.addNumber(7);

        collecting.addNameAndAge("Christian", 26);
        collecting.addNameAndAge("Test", 19);

        collecting.printCollections();
    }
}

class Collecting {
    ArrayList<String> name;
    HashSet<Integer> number;
    HashMap<String, Integer> nameAge;

    public Collecting() {
        name = new ArrayList<>();
        number = new HashSet<>();
        nameAge = new HashMap<>();
    }

    public void addName(String newName) {
        if(newName == null || newName.length() < 2 || newName.length() > 25 || !newName.matches("[a-zA-Z ]+")) {
            System.out.println("Invalid name. Name needs to be between 2 and 25 characters long (no numbers)");
        } else {
            name.add(newName);
        }
    }

    public void addNumber(int num) {
        number.add(num);
    }

    public void addNameAndAge(String newName, int age) {
        if(newName == null || newName.length() < 2 || newName.length() > 25 || !newName.matches("[a-zA-Z ]+")) {
            System.out.println("Invalid name. Name needs to be between 2 and 25 characters long (no numbers)");
        } else if (age < 0 || age > 100) {
            System.out.println("Invalid age. Age needs to be between 0 and 100)");
        } else {
            nameAge.put(newName, age);
        }
    }

    public void printCollections() {

        // Using a foreach
        System.out.println("Names in ArrayList:");
        for (String n : name) {
            System.out.println(n);
        }

        // Using an iterator
        System.out.println("Numbers in HashSet:");
        Iterator<Integer> it = number.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Using Streams API foreach
        System.out.println("Names and ages in HashMap:");
        nameAge.forEach((key, value) -> System.out.println(key + " is " + value + " years old."));
    }
}
