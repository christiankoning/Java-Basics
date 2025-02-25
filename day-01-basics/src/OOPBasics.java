public class OOPBasics {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.setAge(26);
        student1.setAge(101); // Test invalid age
        System.out.println("Student's age is: " + student1.getAge());

        student1.setName("Chris");
        student1.setName(""); // Test invalid name
        System.out.println("Student's name is: " + student1.getName());

        student1.setGrade(8);
        student1.setGrade(11); // Test invalid grade
        System.out.println("Student's grade is: " + student1.getGrade());
    }
}
class Student {
    private String name;
    private int age;
    private int grade;

    public void setName(String name) {
        if (name == null || name.length() < 2 || name.length() > 25 || !name.matches("[a-zA-Z ]+"))
        {
            System.out.println("Invalid name. Please enter a valid name with 2-25 letters (no numbers)");
        }
        else {
            this.name = name;
            System.out.println("Name updated to: " + name);
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age < 5 || age > 100) {
            System.out.println("Invalid age. Please enter a number from 5 to 100");
        } else {
            this.age = age;
            System.out.println("Age updated to: " + age);
        }
    }

    public int getAge() {
        return age;
    }

    public void setGrade(int grade) {
        if (grade < 1 || grade > 10) {
            System.out.println("Invalid grade. Please enter a number from 1 to 10");
        } else {
            this.grade = grade;
            System.out.println("Grade updated to: " + grade);
        }
    }

    public int getGrade() {
        return grade;
    }
}
