import java.util.*;
public class Target_Practice {
    public static void main(String[] args) throws java.lang.Exception {
        int[][] scor_mat = {
                {1,1,1,1,1,1,1,1,1,1},
                {1,2,2,2,2,2,2,2,2,1},
                {1,2,3,3,3,3,3,3,2,1},
                {1,2,3,4,4,4,4,3,2,1},
                {1,2,3,4,5,5,4,3,2,1},
                {1,2,3,4,5,5,4,3,2,1},
                {1,2,3,4,4,4,4,3,2,1},
                {1,2,3,3,3,3,3,3,2,1},
                {1,2,2,2,2,2,2,2,2,1},
                {1,1,1,1,1,1,1,1,1,1}
        };

        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();

        while(tests-- > 0) {
            char[][] mat = new char[10][10];
            for (int i = 0; i < 10; i++) {//10
                String s = sc.next();//row wise input liya hai
                for(int j =0;j<10;j++){//10
                    mat[i][j] = s.charAt(j);//tracing string
                }
            }

            int score =0;
            for (int i = 0; i < 10; i++) {//10
                for (int j = 0; j < 10; j++) {//10
                    //tracing through all points
                    if(mat[i][j] == 'X'){
                       score+=scor_mat[i][j];
                    }
                }
            }
            System.out.println(score);
        }
    }
}
