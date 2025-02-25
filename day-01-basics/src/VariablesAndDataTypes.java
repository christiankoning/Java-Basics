public class VariablesAndDataTypes {
    public static void main(String[] args) {
        // Primitive Data Types
        int myInt = 10;
        double myDouble = 5.99;
        char myChar = 'A';
        boolean myBool = true;
        float myFloat = 1.5f;

        System.out.println("Integer: " + myInt);
        System.out.println("Double: " + myDouble);
        System.out.println("Character: " + myChar);
        System.out.println("Boolean: " + myBool);
        System.out.println("Float: " + myFloat);

        // Non Primitive Data Types
        String myString = "This is non primitive";
        int[] numbers = {1, 2, 3, 4, 5};
        Person person1 = new Person("Christian", 26, "The Netherlands");

        System.out.println("String: " + myString);
        System.out.println("First Number: " + numbers[0]);
        System.out.println("Second Number: " + numbers[1]);
        System.out.println("Last Number: " + numbers[4]);

        person1.introduce();
        person1.setAge(21); // Change the age to 21
        person1.setAge(-5); // Test negative age
        person1.setAge(150); // Test upper limit of age
        System.out.println("The person's age is: " + person1.getAge()); // Get the person's age
        System.out.println("The person's nationality is: " + person1.getNationality());
        person1.changeNationality("Germany"); // change the nationality to Germany
        person1.changeNationality(""); // Test empty nationality
        person1.changeNationality("testing123"); // Test string with numbers
    }
}

// Class with attributes and a method
class Person {
    String name;
    int age;
    String nationality;

    // Constructor
    public Person(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    // Method that returns info
    public void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old. I am from " + nationality);
    }

    // Change age
    public void setAge(int newAge) {
        if (newAge > 0 && newAge < 120) {
            this.age = newAge;
            System.out.println("Age updated to " + newAge + " years old.");
        } else {
            System.out.println("Invalid age.");
        }
    }

    public int getAge() {
        return age;
    }

    public void changeNationality(String newNationality) {
        if (newNationality == null || newNationality.length() < 2 || newNationality.length() > 50 || !newNationality.matches("[a-zA-Z ]+")) {
            System.out.println("Invalid nationality. Please enter a valid name");
        }
        else {
            nationality = newNationality;
            System.out.println("Nationality updated to: " + nationality);
        }

    }

    public String getNationality() {
        return nationality;
    }
}
