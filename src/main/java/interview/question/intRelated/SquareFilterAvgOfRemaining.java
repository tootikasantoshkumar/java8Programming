package interview.question.intRelated;

import java.util.Arrays;
import java.util.OptionalDouble;

public class SquareFilterAvgOfRemaining {
    public static void main(String[] args) {
        //Write a Java 8 program to square the list of numbers and then filter out
        // the numbers greater than 100 and then find the average of the remaining numbers?
        Integer[] num={100, 100, 9, 8, 200 };
        OptionalDouble average = Arrays.asList(num).stream().mapToInt(n -> n).map(n -> n * n).filter(n -> n > 100).average();
        System.out.println(average);
    }
}
