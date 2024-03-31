package different.type.programming;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseVowelsInAGivenString {
    public static void main(String[] args) {
        String str= "wreite a program to reverse a vowels in a String";
        int len=str.length();
        String collect = IntStream.range(0, len).map(i -> len - 1 - i).mapToObj(j -> String.valueOf(str.charAt(j))).collect(Collectors.joining());
        System.out.println("reverse string:"+collect);
        String collect1 = collect.chars().mapToObj(c -> (char) c).filter(c -> {
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                        return true;
                    else
                        return false;
                }
        ).map(c -> String.valueOf(c)).collect(Collectors.joining());
        System.out.println("reverse vowel:"+collect1);


    }
}
