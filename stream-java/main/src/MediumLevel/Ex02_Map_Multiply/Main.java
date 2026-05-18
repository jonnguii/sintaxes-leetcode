package MediumLevel.Ex02_Map_Multiply;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5);

        List <Integer> multiBy3 = nums.stream()
                .map(n -> n * 3)
                .toList();

        System.out.println(multiBy3);
    }
}
