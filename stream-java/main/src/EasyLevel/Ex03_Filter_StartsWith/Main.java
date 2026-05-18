package EasyLevel.Ex03_Filter_StartsWith;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Ana", "Bruno", "Carlos", "Beatriz");

        List<String> startWithB = names.stream()
                .filter( n -> n.startsWith("b") || n.startsWith("B"))
                .toList();

        System.out.println(startWithB);

    }
}
