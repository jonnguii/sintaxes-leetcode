package Ex03_AllMatch;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = List.of(10, 15, 20, 25, 30);

        List<Integer> transform = nums.stream()
                .filter(n -> n > 20)
                .map(n -> n * 2)
                .sorted()
                .toList();


        System.out.println(transform);
    }
}
