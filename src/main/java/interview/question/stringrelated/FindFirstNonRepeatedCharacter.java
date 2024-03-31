package interview.question.stringrelated;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String s= "Java Hungry Blog Alive is Awesome";
        Character character = s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1).map(entry -> entry.getKey()).findFirst().get();
        System.out.println("first non repeated char:"+character);

    }
}

