package interview.question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AvgMarksOfSubject {
    public static void main(String[] args) {
        String[] str={"1-english:60","2-hindi:50","3-english:40","4-hindi:30"};
        Map<String, List<Integer>> map= new HashMap<>();
        for(int i=0;i<str.length;i++){

           String[] subjectMark= str[i].split(":");

           if(map.containsKey(subjectMark[0].split("-")[1])){
              List<Integer> marks=map.get(subjectMark[0].split("-")[1]);
              marks.add(Integer.valueOf(subjectMark[1]));
               map.put(subjectMark[0].split("-")[1], marks);
           }
           else
           {
              // System.out.println("mark"+Integer.valueOf(subjectMark[1]));

            List<Integer> l= new ArrayList();
            l.add(Integer.valueOf(subjectMark[1]));

               map.put(subjectMark[0].split("-")[1],l);
           }
         /*  map.forEach((k,v)-> {
               System.out.print("sub:"+k+":mark:");
               v.stream().forEach(System.out::print);
               System.out.println();
                   }
           );*/
        }
       // map.forEach((k,v)->System.out.println("subject:"+k+":mark Avg"+v.size()));
        map.forEach((k,v)->System.out.println(k+":"+v.stream().reduce((a,b)->(a+b)).get()/v.size()));
        System.out.println("Another way of calcution");
        map.forEach((k,v)->
                {
                    double avg=v.stream().mapToDouble(d->d).average().orElse(0.0);
                    System.out.println("subject:"+k+":avg:"+avg);
                }
                );
    }
}
