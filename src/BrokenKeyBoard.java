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
            boolean flag = false;
            for(int i =0;i<length;i++){
                presscount++;
                char c = word.charAt(i);
                if( presscount%2 == 0 && c == word.charAt(i+1)){
                    flag = true;
                    presscount++;
                }else{
                    flag=false;
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
