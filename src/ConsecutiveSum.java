import java.util.Arrays;
import java.util.Scanner;

public class ConsecutiveSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        int count =0;
        while (tests-->0){
            int lenght = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[lenght];

            for(int i =0;i<lenght;i++){
                a[i] = sc.nextInt();
            }

            int[] max = new int[k];

            for(int i =0;i<lenght;i++){
                int reminder = i%k;//index ko devide karna hai not the number
                max[reminder] = Math.max(max[reminder],a[i]);
            }

            long sum =0;
            for(int val:max){
                sum+=val;
            }
            System.out.println(sum);

        }

    }


}
