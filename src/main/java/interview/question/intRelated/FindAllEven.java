package interview.question.intRelated;

import java.util.Arrays;

public class FindAllEven {
    public static void main(String[] args) {
        Integer[] num={10,15,8,49,25,98,32};
        Arrays.asList(num).stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
