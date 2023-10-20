import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("tanaka", 28));
        personList.add(new Person("suzuki", 25));
        personList.add(new Person("izawa", 32));

        for (Person a:personList) {
            System.out.println(a.getName() + " ha " + a.getAge() + " sai");
        }

        System.out.println("1: " + personList.get(0).getName() + "sanndesu.");

    }
}
