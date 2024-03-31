package interview.question.intRelated;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IntegerArrayReturnTrueIfAppearedTwiceTrueIfDistinct {
    public static void main(String[] args) {
        System.out.println("Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.");
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().collect(Collectors.partitioningBy(m->m.getValue()>1)).entrySet().stream().
                forEach(m->{
                    if(m.getKey())
                    {
                        System.out.println("key:"+m.getKey());
                        m.getValue().stream().forEach(System.out::println);
                    }
                    else
                        System.out.println("key:"+m.getKey());
                        m.getValue().stream().forEach(System.out::println);
                });
    }
}
