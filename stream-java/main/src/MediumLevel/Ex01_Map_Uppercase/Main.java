package MediumLevel.Ex01_Map_Uppercase;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("joao", "ana", "carlos");

        List<String> namesUp = names.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(namesUp);
    }

}
