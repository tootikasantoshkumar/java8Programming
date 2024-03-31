package interview.question.intRelated;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
    public static void main(String[] args) {
        Integer[] num={10,15,8,49,25,98,98,32,15};
        Set<Integer> s= new HashSet<>();
        Arrays.asList(num).stream().filter(n->!s.add(n)).forEach(System.out::println);
    }
}
