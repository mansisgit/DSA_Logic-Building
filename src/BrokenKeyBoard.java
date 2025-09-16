import java.util.Scanner;
public class BrokenKeyBoard {
    public static void main(String[] args)throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while(tests-->0){
            int length = sc.nextInt();
            String word = sc.next();
            //input taken

            int presscount = 0;
            boolean flag = true;
            for(int i =0;i<length;i++){
                presscount++;
                if(presscount % 2 == 0 && i+1<length && word.charAt(i) == word.charAt(i+1)){
                    i++;
                }else{
                    if(i!=length-1){
                        flag=false;
                    }
                }
            }


            if(flag){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
}
