package different.type.programming;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateWordsInAString {
    public static void main(String[] args) {
        String sentence = "Java is a programming language and Java is also a platform";
        Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(w->w.getValue()>1).forEach(k-> System.out.println(k.getKey()+":"+k.getValue()));
    }
}
