

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Line_Trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No of test cases:");
        int tests = sc.nextInt();
        int gasStations = sc.nextInt();
        int oneway = sc.nextInt();
        int[] station = new int[gasStations];

        for(int i =0;i<gasStations;i++){
            station[i] = sc.nextInt();
        }
        

    }

}
