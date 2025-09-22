import java.util.Scanner;

public class MakeAequalB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while (tests-->0){
            int length = sc.nextInt();
            int[] a = new int[length];
            int[] b = new int[length];

            for(int i=0;i<length;i++) a[i] = sc.nextInt();
            for(int i=0;i<length;i++) b[i] = sc.nextInt();

            int countA =0,countB =0,diff=0;//agar exactly same hai toh diff=0
            for(int i=0;i<length;i++){
                if(a[i] == 1) countA++;//counting 1s in a
                if(b[i] == 1) countB++;//counting 1s in b
                if(a[i] != b[i]) diff++;
            }

            int opsIfOnlyFlip = diff;
            int opsIfAdjustCount = 1+ Math.abs(countA-countB);

            int total_operations = Math.min(opsIfAdjustCount,opsIfOnlyFlip);//kaamm lena hai
            System.out.println(total_operations);
        }

    }
}
