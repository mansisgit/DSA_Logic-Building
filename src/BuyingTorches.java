import java.util.Scanner;

public class BuyingTorches {

    public static long cell_division(long a , long b){
        return (a+b-1)/b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while (tests-->0){

            long Sticks_initial= sc.nextInt();
            long Sticks_for_1_coal = sc.nextInt();
            long torches = sc.nextInt();

            long Sticks_gained = Sticks_initial-1;//trade 1
            long Sticks_needed = Sticks_for_1_coal*torches + torches-1;

            long trade = 0;
            trade = cell_division(Sticks_needed,Sticks_gained);
            trade+=torches;//trade type 2;

            System.out.println(trade);

        }

    }
}
