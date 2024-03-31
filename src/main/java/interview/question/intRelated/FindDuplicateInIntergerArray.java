package interview.question.intRelated;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateInIntergerArray {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        System.out.println("One way to find duplicate in Interger Array");
        myList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(m->m.getValue()>=2).forEach(m->System.out.println(m.getKey()));
        System.out.println("Another Way to find Duplicate ");
        Set<Integer> set= new HashSet<>();
        myList.stream().filter(n->!set.add(n)).forEach(System.out::println);

    }
}
