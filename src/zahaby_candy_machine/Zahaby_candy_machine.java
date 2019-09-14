package zahaby_candy_machine;

import java.util.Scanner;

public class Zahaby_candy_machine {

    public static void main(String[] args) {
        String answer = "";
        int terminate = -1;
        Scanner scanner = new Scanner(System.in);
        Chips chips = new Chips();
        Dispenser candy = new Dispenser();
        CashRegister cashRegister = new CashRegister();
        CandyMachine candyMachine  = new CandyMachine(candy, chips, cashRegister);
        
        System.out.println(candyMachine.showMenu());
        System.out.println("Do you want to buy?y/n");
        answer = scanner.nextLine();
        while(!"y".equals(answer) && !"n".equals(answer)){
            System.out.println("Do you want to buy?y/n");
            answer = scanner.nextLine();
        }
        if ("y".equals(answer)) {
            candyMachine.SellProduct();
        }
        
        while (terminate != 1) {
            System.out.println("press 1 to close the program");
            Scanner s = new Scanner(System.in);
            terminate = s.nextInt();
        }
        
        
    }
    
}
