package interview.question;



import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class HowmanyVowelsInString {
    public static void main(String[] args) {
        String str="howmany vowels are there in a string check program";
      //  Arrays.stream(str.split("")).peek(String::toUpperCase).forEach(System.out::println);
        Arrays.stream(str.split("")).filter(ch-> (ch == "a" || ch == "e" || ch == "i" || ch == "o" || ch == "u"))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().forEach(System.out::println);
/*
        Stream<Character> characterStream = str.chars().mapToObj(ch -> (char) ch).filter(ch ->
                (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'));
        Map<Character,Long> map= characterStream.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map.forEach((k,v)->System.out.println("key:"+k+" :Value:"+v));*/
    }
}
