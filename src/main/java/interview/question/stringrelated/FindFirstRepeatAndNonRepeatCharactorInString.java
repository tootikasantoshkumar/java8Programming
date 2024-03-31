package interview.question.stringrelated;

import java.sql.SQLOutput;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepeatAndNonRepeatCharactorInString {
    public static void main(String[] args) {

        String input="find first repeat and non repeat charactor in a string program";
        System.out.println("find first repeat and non repeat charactor in a string program");
        Character character = input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1)
                .map(e -> e.getKey()).findFirst().get();
        System.out.println(character);
        System.out.println("Find all charactor and number of times its present ");
        input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet()
                .stream().forEach(entry-> System.out.println(entry.getKey()+":"+entry.getValue()));
    }
}
