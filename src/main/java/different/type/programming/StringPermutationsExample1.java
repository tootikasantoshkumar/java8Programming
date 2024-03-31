package different.type.programming;


public class StringPermutationsExample1 {

    public static void main(String[] args) {

        stringPermuteAndPrint("", "ABC");
    }

    private static void stringPermuteAndPrint(String prefix, String str) {
        int n = str.length();
        System.out.println("----------------------------");
        System.out.println("Value of N:"+n);
        if (n == 0) {
            System.out.println("with in if block");
            System.out.println(prefix + " ");
        } else {
            for (int i = 0; i < n; i++) {

                System.out.println("parameter1:"+prefix + str.charAt(i));
                System.out.println("parameter2   :"+"p1:"+str.substring(i + 1, n)+":  p2:"+str.substring(0, i)+":  whole:"+str.substring(i + 1, n) + str.substring(0, i));
                System.out.println("first:"+"i is:"+i+":"+str.substring(i + 1, n)+":second:"+str.substring(0, i));
                stringPermuteAndPrint(prefix + str.charAt(i), str.substring(i + 1, n) + str.substring(0, i));
            }
        }
    }

}