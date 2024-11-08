import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;

public class Task3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Eve", "Charlie", "Daniel");

        Collections.sort(names);

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}