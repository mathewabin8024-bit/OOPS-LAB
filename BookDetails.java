import java.util.Scanner;

// Step 2: Publisher class
class Publisher {
    String publisher_name;
}

// Step 3: Book class inherits Publisher
class Book extends Publisher {
    String book_name;
    String author;
}

// Step 5: Literature class inherits Book
class Literature extends Book {

    String type;

    void readData(Scanner sc) {
        System.out.print("Enter Publisher Name: ");
        publisher_name = sc.nextLine();

        System.out.print("Enter Book Name: ");
        book_name = sc.nextLine();

        System.out.print("Enter Author Name: ");
        author = sc.nextLine();

        System.out.print("Enter Literature Type: ");
        type = sc.nextLine();
    }

    void display() {
        System.out.println("\nCategory: Literature");
        System.out.println("Publisher: " + publisher_name);
        System.out.println("Book Name: " + book_name);
        System.out.println("Author: " + author);
        System.out.println("Type: " + type);
    }
}

// Step 7: Fiction class inherits Book
class Fiction extends Book {

    String type;

    void readData(Scanner sc) {
        System.out.print("Enter Publisher Name: ");
        publisher_name = sc.nextLine();

        System.out.print("Enter Book Name: ");
        book_name = sc.nextLine();

        System.out.print("Enter Author Name: ");
        author = sc.nextLine();

        System.out.print("Enter Fiction Type: ");
        type = sc.nextLine();
    }

    void display() {
        System.out.println("\nCategory: Fiction");
        System.out.println("Publisher: " + publisher_name);
        System.out.println("Book Name: " + book_name);
        System.out.println("Author: " + author);
        System.out.println("Type: " + type);
    }
}

// Step 11: Main class
public class BookDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("\nEnter Category (Literature/Fiction): ");
            String category = sc.nextLine();

            if (category.equalsIgnoreCase("Literature")) {

                Literature l = new Literature();
                l.readData(sc);
                l.display();

            } else if (category.equalsIgnoreCase("Fiction")) {

                Fiction f = new Fiction();
                f.readData(sc);
                f.display();

            } else {
                System.out.println("Invalid Category");
            }
        }

        sc.close();
    }
}