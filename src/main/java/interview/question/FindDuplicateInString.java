package interview.question;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateInString {
    public static void main(String[] args) {
        String str="howmany vowels are there in a string check program";
        Set<Character> set=new HashSet<>();
        //str.chars().peek(c->(char)c).
        str.chars().mapToObj(c->(char)c).filter(c->!set.add(c))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((k,v)->System.out.println("charactor:  "+k+" count is :"+(v+1)));
      //  set.forEach(System.out::println);


    }
}
