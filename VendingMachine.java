import java.util.ArrayList;
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
        System.out.println("enter pennies");
        ArrayList<Coin> bank = new ArrayList<>();
        for (int x =0;x<quarters;x++){
            bank.add(new Coin(0.25));
        }

        for (int x =0;x<dimes;x++){
            bank.add(new Coin(0.10));
        }

        for (int x =0;x<nickels;x++){
            bank.add(new Coin(0.05));
        }

        int pennies = Integer.parseInt (coinReader.nextLine());
        for (int x = 0; x<pennies; x++){
            bank.add(new Coin(0.01));
        }



        System.out.println("you have $"+total(bank));
    }

    private static double total(ArrayList<Coin> bank) {
        for(Coin c : bank){
            if(c.getValue() != 0.01){
                total += c.getValue();
            }else{
                System.out.println("rejecting penny");
            }
        }
        return total ;
    }

    public static double total(int quarters, int dimes, int nickels){
        total = (quarters *0.25)+(dimes *0.10)+(nickels *0.05);
        return total ;
    }


}

