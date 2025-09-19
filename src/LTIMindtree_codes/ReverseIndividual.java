package LTIMindtree_codes;

import java.util.Scanner;

public class ReverseIndividual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split(" ");
        StringBuilder output = new StringBuilder();

        for(String word : arr){
            for(int i = word.length()-1;i>=0;i--){
                output.append(word.charAt(i));
            }
            output.append(" ");
        }
        System.out.println(output);
    }
}
