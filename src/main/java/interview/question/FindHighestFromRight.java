package interview.question;

import java.util.HashMap;
import java.util.Map;

public class FindHighestFromRight {
    public static void main(String[] args) {
        int arr[]={8,9,5,11,6,1,7,6};
        //output=11,11,11,-1,7,7,-1,-1
        //map -- ()
        Map<Integer,Integer> map= new HashMap<>();
        for (int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        for (int i=0;i<arr.length;i++){
            int high=arr[i];
            for (int j=i+1;j<arr.length;j++){

                if(high<=arr[j]){
                    high=arr[j];
                }

            }
            if(map.get(high)>i){
                System.out.print(high+",");
            }
            else
                System.out.print(-1+",");
        }
    }
}
