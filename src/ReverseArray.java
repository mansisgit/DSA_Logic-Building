import java.util.Arrays;

public class ReverseArray {

    public static int[] Reverse(int[] arr){
        int lft =0 ,right = arr.length-1;

        while(lft<right){

            arr[lft]^=arr[right];
            arr[right]^=arr[lft];
            arr[lft]^=arr[right];

            lft++;
            right--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(Reverse(arr)));
    }
}
