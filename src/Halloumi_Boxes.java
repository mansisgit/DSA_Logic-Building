
import java.util.*;

public class Halloumi_Boxes  {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while(tests-->0) {
            int boxes = sc.nextInt();
            int sub_arr_length = sc.nextInt();
            int[] arr = new int[boxes];
            for (int i = 0; i < boxes; i++) {
                arr[i] = sc.nextInt();
            }

            int[] dupicate = Arrays.copyOf(arr,arr.length);

            Arrays.sort(dupicate);
            if(Arrays.equals(arr,dupicate) || sub_arr_length>1){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
        }

    }
}

