import java.util.Scanner;

// Step 2: Employee class
class Employee {
    int empid;
    String name;
    double salary;
    String address;

    // Step 3: Constructor
    Employee(int empid, String name, double salary, String address) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

// Step 4: Teacher class inheriting Employee
class Teacher extends Employee {

    String department;
    String subject;

    // Step 6: Constructor using super()
    Teacher(int empid, String name, double salary, String address,
            String department, String subject) {

        super(empid, name, salary, address);
        this.department = department;
        this.subject = subject;
    }

    // Step 7: Display method
    void display() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Subject Taught: " + subject);
        System.out.println("----------------------------");
    }
}

// Step 8: Main class
public class TeacherDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 9
        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Step 10
        Teacher t[] = new Teacher[n];

        // Step 11
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details of Teacher " + (i + 1));

            System.out.print("Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            System.out.print("Subject Taught: ");
            String subject = sc.nextLine();

            t[i] = new Teacher(id, name, salary, address, dept, subject);
        }

        // Step 12 & 13
        System.out.println("\nTeacher Details:");
        for (int i = 0; i < n; i++) {
            t[i].display();
        }

        sc.close();
    }
}