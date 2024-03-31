package interview.question;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.List;

public class FindOnlyEven {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        myList.stream().filter(num->num%2==0).forEach(System.out::println);

    }


}
