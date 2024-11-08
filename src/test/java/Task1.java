import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Eve", "Charlie", "Daniel");

        List<String> filteredNames = names.stream()
                .filter(name -> name.contains("e"))
                .collect(Collectors.toList());

        filteredNames.forEach(System.out::println);


    }
}