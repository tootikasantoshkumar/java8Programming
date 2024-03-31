package interview.question.stringrelated;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindRepeatedCharacterInString {
    public static void main(String[] args) {
       String input = "Java Hungry Blog Alive is Awesome";
        Character character = input.chars().mapToObj(c -> (char) c)
                .map(c->Character.toLowerCase(c))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 1).map(entry -> entry.getKey())
                .findFirst().get();
        System.out.println("first repeat character:  "+character);
    }
}
