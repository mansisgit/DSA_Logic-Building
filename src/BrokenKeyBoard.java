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
                if(presscount%2 ==0){//check only for even press

                    if(i+1<length && word.charAt(i) == word.charAt(i+1)){
                        i++;
                    }else{
                        flag=false;
                        break;
                    }
                }
            }
            System.out.println(flag ? "YES":"NO");
            }

        }
    }

