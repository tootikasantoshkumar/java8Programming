package interview.question.intRelated;

import java.util.Arrays;
import java.util.Comparator;

public class FindMax {
    public static void main(String[] args) {
        Integer[] num={10,15,8,49,25,98,98,32,15};
        Integer i=Arrays.asList(num).stream().sorted(Comparator.comparing(Integer::intValue).reversed()).findFirst().get();
        System.out.println(i);

        System.out.println("Another Way of finding Max");
        Integer max=Arrays.asList(num).stream().max(Comparator.comparing(Integer::intValue)).get();
        System.out.println("max :"+max);
    }
}
