package EasyLevel.Ex02_Filter_Greater;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = List.of(3, 7, 10, 15, 20);

            List <Integer> greaterThan10 = nums.stream()
                    .filter(n -> n > 10)
                    .toList();

        System.out.println(greaterThan10);

    }
}
