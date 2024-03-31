package interview.question;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighestNumber {
    public static void main(String[] args) {
        Integer[] arr={12,16,45,11,18,22,19,20,45};
       Arrays.stream(arr).sorted().forEach(System.out::println);
        System.out.println("===========");
        System.out.println(Arrays.asList(arr).stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
    }
}
