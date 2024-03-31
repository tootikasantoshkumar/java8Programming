package interview.question;

import java.util.stream.IntStream;

public class PrimeNumberTill100 {
    public static void main(String[] args) {
        for (int i=2;i< 100000;i++) {
            int finalI = i;
            boolean flag=IntStream.range(2,i).noneMatch(num-> finalI %num==0);
            if(flag){
                System.out.println(i);
            }

        }
    }
}
