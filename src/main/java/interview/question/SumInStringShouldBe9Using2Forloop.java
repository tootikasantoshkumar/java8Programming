package interview.question;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumInStringShouldBe9Using2Forloop {
    public static void main(String[] args) {
        Integer[] num={1,4,8,2,3,7,6,5};
        Arrays.stream(num).sorted().forEach(System.out::println);
      //  System.out.println("number"+num);
        int sum=0,target=9;

        for (int i=0;i<num.length-1;i++)
            for(int j=i+1;j<num.length;j++)
                if(num[i]+num[j]==target)
                  System.out.println("{"+num[i]+","+num[j]+"}");



    }



}
