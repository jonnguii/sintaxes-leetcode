package HardLevel.Ex03_Filter_Map_Length;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Ana", "Amanda", "Bruno", "Aline", "Carlos");

        List<Integer> namesLength = names.stream()
                .filter(n -> n.startsWith("A"))
                .map(String::length)
                .sorted()
                .toList();

        System.out.println(namesLength);
    }
}
