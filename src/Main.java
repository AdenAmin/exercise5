import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Name");
        String name = userInput.nextLine();
        System.out.println("Email");
        String mail = userInput.nextLine();


        Person person1 = new Person(name,mail);
        System.out.println(person1);

        Book addBook = new Book();
        addBook.addPerson(person1);
        System.out.println(addBook);
    }
}