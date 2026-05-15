package Ex02_Map_Uppercase;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> nomes = List.of("joao", "ana", "carlos");

        List<String> nomesUp = nomes.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(nomesUp);
    }

}
