package interview.question;

import java.util.Arrays;

public class MultiplyArrayWithItself {
    public static void main(String[] args) {
        Integer[] inputArray={3,5,4,6,9};
        Arrays.stream(inputArray).map(i->i*i).forEach(System.out::println);
    }
}
