package interview.question.stringrelated;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HowmanyTimesCharacterRepeated {
    public static void main(String[] args) {
        String str="howmany characters are there in a string check program";
        Map<Character, Long> collect = str.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.forEach((k,v)->System.out.println(k+"::"+v));
    }
}
