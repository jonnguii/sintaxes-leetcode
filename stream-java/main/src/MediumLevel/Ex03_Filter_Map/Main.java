package MediumLevel.Ex03_Filter_Map;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("joao", "ana", "carlos", "maria");

        List<String> namesGreater4Upper = names.stream()
                .filter(n -> n.length() > 4)
                .map(String::toUpperCase)
                .toList();

        System.out.println(namesGreater4Upper);
    }
}
