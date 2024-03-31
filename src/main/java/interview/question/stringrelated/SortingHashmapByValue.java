package interview.question.stringrelated;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingHashmapByValue {
    public static void main(String[] args) {
        Map<String,Integer> map= new HashMap<>();
        map.put("xx",1121);
        map.put("bb",453);
        map.put("dd",3453);
        map.put("ee",24);
        map.put("ww",5646);
        map.put("gg",34532);
        map.put("jj",2435234);
        map.put("yy",3456);
        map.put("oo",34);
        map.put("pp",345345);
        map.put("qq",75);

     map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(o1,o2)->o1, LinkedHashMap::new)).forEach((k,v)->System.out.println(k+":"+v));





    }
}
