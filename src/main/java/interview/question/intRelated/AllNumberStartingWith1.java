package interview.question.intRelated;

import java.util.Arrays;

public class AllNumberStartingWith1 {
    public static void main(String[] args) {
        Integer[] num={10,15,8,49,25,98,32};
        Arrays.asList(num).stream().map(n->String.valueOf(n)).filter(n->n.startsWith("1")).mapToInt(n->Integer.valueOf(n)).forEach(System.out::println);
    }
}
