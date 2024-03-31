package different.type.programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Integer[] num={10,15,8,49,25,98,32,71};
        int number=Arrays.asList(num).stream().distinct().sorted(Comparator.comparing(Integer::intValue).reversed()).skip(1).findFirst().get();
        System.out.println("second hightest:"+number);
        int number2=Arrays.asList(num).stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
        System.out.println("second hightest:"+number2);
    }
}
