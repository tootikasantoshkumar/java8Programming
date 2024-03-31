package interview.question;

import java.util.Arrays;
import java.util.List;

public class NumberStartingWith1 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        myList.stream().map(num->String.valueOf(num)).filter(str->str.startsWith("1")).forEach(System.out::println);
    }
}
