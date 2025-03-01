import java.io.*;
import java.util.Scanner;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void saveToFile() {
        try {
            FileWriter writer = new FileWriter("studentDetails.txt", true); // Append mode
            writer.write("Name: " + name + ", Age: " + age + "\n");
            writer.close();
            System.out.println("Student Details Saved Successfully!");
        } catch (IOException e) {
            System.out.println("An Error Occurred While Saving Data.");
            e.printStackTrace();
        }
    }

    public static void retrieveFromFile() {
        try {
            File file = new File("studentDetails.txt");
            if (!file.exists()) {
                System.out.println("No Student Records Found!");
                return;
            }
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("\n--- Student Details ---");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An Error Occurred While Reading Data.");
            e.printStackTrace();
        }
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter Your Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    sc.nextLine(); 
                    String name = sc.nextLine();
                    System.out.print("Enter Student Age: ");
                    int age = sc.nextInt();

                    Student student = new Student(name, age);
                    student.saveToFile();
                    break;

                case 2:
                    Student.retrieveFromFile();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice! Try Again.");
            }
        }
    }
}
