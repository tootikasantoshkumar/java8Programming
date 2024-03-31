package interview.question;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumInStringShouldBe9 {
    public static void main(String[] args) {
        Integer[] num={1,4,8,2,3,7,6,5};
        int sum=0,target=9;

        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<num.length;i++)
            map.put(num[i],i);
       // Arrays.asList(num).forEach(i-> map.put(i,new Integer[]{}));
        findCombi(num,map,target);

    }

    private static void findCombi(Integer[] num, Map<Integer, Integer> map, int target) {
      for (int i=0;i<num.length;i++){
          int rest=target-num[i];
          if(map.containsKey(rest)){
              
             // integers={i,num.};

          }
      }
    }

}
