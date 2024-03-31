package interview.question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateNumbersInAList {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set=new HashSet<>();
        myList.stream().filter(num->!set.add(num)).forEach(System.out::println);
    }
}
