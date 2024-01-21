import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){

        Employee JonathanSims = new Employee( "Jonathan","Sims","Archivist", 27045.78);
        Employee MartinBlackwood = new Employee("Martin", "Blackwood", "Assistant",  50000.00);
        Student MelanieKing = new Student("Melanie","King",2.3);
        Student GeorgieBarker = new Student("Georgie","Barker",3.8);

        ArrayList<Person> people = new ArrayList<Person>();
        people.add(JonathanSims);
        people.add(MartinBlackwood);
        people.add(MelanieKing);
        people.add(GeorgieBarker);

        printData(people);
    }

    private static void printData(ArrayList<Person> people) {
        System.out.println(people.toString());
    }
}
