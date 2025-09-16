import java.util.Scanner;
public class Line_Trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("No of test cases:");
        int tests = sc.nextInt();

        while (tests-->0) {

            int gasStations = sc.nextInt();
            int total_distance = sc.nextInt();
            int[] station = new int[gasStations];

            for (int i = 0; i < gasStations; i++) {
                station[i] = sc.nextInt();
            }

            int max =station[0];

            for (int i = 1; i < gasStations; i++) {
                int dis = station[i] - station[i-1];
                max = Math.max(dis, max);
            }
            max = Math.max(max, 2 * (total_distance - station[gasStations - 1]));
            System.out.println(max);
        }
    }

}
