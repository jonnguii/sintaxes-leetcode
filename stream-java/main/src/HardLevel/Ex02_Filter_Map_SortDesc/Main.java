package HardLevel.Ex02_Filter_Map_SortDesc;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = List.of(5, 12, 18, 25, 30, 7);

        List<Integer> numsTransform = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(numsTransform);
    }
}
