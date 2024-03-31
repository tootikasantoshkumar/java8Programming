package different.type.programming;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzIfDivBy3BuzzifDivBy5 {
    public static void main(String[] args) {
        String collect = IntStream.range(1, 101).mapToObj(i -> {
            if (i % 3 == 0)
                return "Fizz";
            if (i % 5 == 0)
                return "Buzz";
            return i;
        }).map(i -> String.valueOf(i)).collect(Collectors.joining(","));
        System.out.println(collect);
    }
}
