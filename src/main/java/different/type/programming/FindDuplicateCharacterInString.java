package different.type.programming;

import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateCharacterInString {
    public static void main(String[] args) {
        String str="find duplicate character in string";
        str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(c->c.getValue()>1).forEach(k-> System.out.println(k.getKey()+":"+k.getValue()));
    }
}
