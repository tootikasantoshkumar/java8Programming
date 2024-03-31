package interview.question;

public class KadaneAlgorithmSolution {
    public static void main(String[] args) {
        int[] num={8,9,-1,1,6,5,7,-6};
        int curMax=num[0],globalMax=num[0];
        for(int i=1;i<num.length;i++){
            if(num[i]<0){
                curMax=0;
            }
            else{
                curMax=curMax+num[i];
            }
            if(globalMax<curMax){
                globalMax=curMax;
            }

        }
        System.out.println("max:"+globalMax);
    }
}
