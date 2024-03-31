package different.type.programming;

import java.util.stream.IntStream;

public class PalindromCheckProgram {
    public static void main(String[] args) {
        String str="A man, a plan, a canal, Panama";
        String s=str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        System.out.println("xxxx"+s);
        boolean b = IntStream.range(0, (s.length() - 1) / 2).allMatch(i -> s.charAt(i) == s.charAt(s.length() - 1 - i));
        System.out.println(""+b);
    }
}
