import java.util.Scanner;

// User defined exception
class InvalidLoginException extends Exception {
    InvalidLoginException(String message) {
        super(message);
    }
}

public class UserAuth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Correct credentials
        String correctUsername = "admin";
        String correctPassword = "1234";

        try {
            System.out.print("Enter username: ");
            String username = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();
     
            if (!username.equals(correctUsername) || !password.equals(correctPassword)) {
                throw new InvalidLoginException("Invalid Username or Password!");
            }

            System.out.println("Login Successful!");

        } catch (InvalidLoginException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}