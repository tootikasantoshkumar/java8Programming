package different.type.programming;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateWordRemover {
    public static void main(String[] args) {
        String inputString = "Java is a programming language and Java is widely used in the software industry.";

        Map<String, Long> collect = Arrays.stream(inputString.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        String collect1 = Arrays.stream(inputString.split(" ")).distinct().collect(Collectors.joining(" "));
        System.out.println(collect1);
    }
}
