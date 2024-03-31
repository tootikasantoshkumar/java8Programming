package different.type.programming;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseEachWordInASentence {
    public static void main(String[] args) {
        String str="I am string not reversed";
        Arrays.stream(str.split(" ")).map(w-> {
           if(w.length()>1)
               return IntStream.range(0,w.length()).mapToObj(i-> String.valueOf(w.charAt(w.length()-1-i))).collect(Collectors.joining());
           else
               return w;
        }).forEach(System.out::println);
    }
}
