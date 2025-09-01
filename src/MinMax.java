

class Pair<K,V>{
    K min;
    V max;

    Pair(K min,V max){
        this.min=min;
        this.max=max;
    }

    @Override
    public String toString() {
        return min + " "+ max;
    }
}

public class MinMax {

    public static Pair<Integer,Integer> getMinMax(int[] arr){
        int min,max,i;
        int n = arr.length;

        if(n%2 == 0){
            if(arr[0]<arr[1]){
                min = arr[0];
                max = arr[1];
            }else{
                min = arr[1];
                max = arr[0];
            }
        i=2;
        }else{
            min = arr[0];
            max = arr[0];
            i = 1;
        }

        while(i<n-1){
            int localmin,localmax;

            if(arr[i]<arr[i+1]){
                localmax = arr[i+1];
                localmin = arr[i];
            }else{
                localmax = arr[i];
                localmin = arr[i+1];
            }

            if(localmax>max) max = localmax;
            if(localmin<min) min = localmin;
            i+=2;
        }


        return new Pair<>(min,max);
    }


    public static void main(String[] args) {
        int[] arr ={2,3,4,5,7,9};

        System.out.println(getMinMax(arr));
    }
}