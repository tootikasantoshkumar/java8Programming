package interview.question;

import java.util.Arrays;
import java.util.stream.Stream;

public class MultiplyAllNumberInAnArray {
    public static void main(String[] args) {
        Integer[] input={1,2,3,4,5,6,7,8,9};
        int sum=1;
        Integer integerStream = Arrays.asList(input).stream().map(i -> sum * i).findFirst().get();
        System.out.println(sum);
    }
}
