package interview.question;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindNumberOfTimeNumberOrWordRepeated {
    public static void main(String[] args) {
        Integer[] num={5,3,4,1,3,7,2,9,9,4};
        Arrays.asList(num).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((k,v)-> System.out.println(Collectors.joining("-")));
    }
}
