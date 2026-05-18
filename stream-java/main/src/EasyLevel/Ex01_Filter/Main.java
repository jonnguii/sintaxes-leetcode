package EasyLevel.Ex01_Filter;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numss = List.of(1, 2, 3 , 4, 5, 6);

        numss.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
