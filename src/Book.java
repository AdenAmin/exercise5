import java.util.ArrayList;
import java.util.List;

public class Book {
    private Person a;
    private List<Person>listOfPeople = new ArrayList<>();

    void addPerson(Person a ){
        listOfPeople.add(a);
    }

    @Override
    public String toString() {
        return "Book{" +
                "a=" + a +
                ", listOfPeople=" + listOfPeople +
                '}';
    }
}
