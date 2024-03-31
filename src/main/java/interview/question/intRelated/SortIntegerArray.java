package interview.question.intRelated;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortIntegerArray {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream().distinct().sorted(Comparator.comparing(Integer::intValue)).
                forEach(System.out::println);

        System.out.println("Sorting using reverse order");
        myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}
