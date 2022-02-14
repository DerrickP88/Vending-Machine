import java.util.Scanner;

public class VendingMachine {

    private static double total;

    public static void main(String[] args){
        System.out.println("enter quarters");
        Scanner coinReader = new Scanner(System.in);
        int quarters = Integer.parseInt (coinReader.nextLine());
        System.out.println("you entered "+quarters+" quarters");
        System.out.println("enter dimes");
        int dimes = Integer.parseInt (coinReader.nextLine());
        System.out.println("enter nickels");
        int nickels = Integer.parseInt(coinReader.nextLine());
        System.out.println("you have $"+total(quarters,dimes, nickels));
    }
    public static double total(int quarters, int dimes, int nickels){
        total = (quarters *0.25)+(dimes *0.10)+(nickels *0.05);
        return total ;
    }


}

