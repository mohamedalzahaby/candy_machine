package zahaby_candy_machine;
import java.lang.String;
import java.util.Scanner;
public class CandyMachine {
    
    private Dispenser candy;
    private Chips chips;
    private CashRegister cashRegister;

    public CandyMachine(Dispenser candy, Chips chips, CashRegister cashRegister) {
        this.candy = candy;
        this.chips = chips;
        this.cashRegister = cashRegister;
    }

    public Dispenser getCandy() {
        return candy;
    }

    public void setCandy(Dispenser candy) {
        this.candy = candy;
    }

    public Dispenser getChips() {
        return chips;
    }

    public void setChips(Chips chips) {
        this.chips = chips;
    }

    public CashRegister getCashRegister() {
        return cashRegister;
    }

    public void setCashRegister(CashRegister cashRegister) {
        this.cashRegister = cashRegister;
    }
    
    public String showMenu()
    {
        //Show the number of products sold by the candy machine.
        String CandyCost = String.valueOf(this.candy.getProductCost());
        String Candynumber = String.valueOf(this.candy.getNumberOfItems());
        String candyData  =  "candy Cost:  " +  CandyCost + "   candy number:  " +  Candynumber ;
        
        String chipsCost = String.valueOf(this.chips.getProductCost());
        String chipsnumber = String.valueOf(this.chips.getNumberOfItems());
        String chipsData =  "chips Cost:  " +  chipsCost + "    chips number:  " +  chipsnumber ;
        
        return candyData + "\n" + chipsData;
    }
    public void SellProduct()
    {
        //Allow the customer to select the product and buy it.
        System.out.println("choose 1 for candy , 2 for chips");
        Scanner choice = new Scanner(System.in);
        int product = choice.nextInt();
//        this.SellProductChoiceValidation(choice);
        if (product == 2){
            System.out.println("choose souce: 1 for cheese ,2 for tomato , 3 for chocolate");
            Scanner souceNumber = new Scanner(System.in);
            this.chips.setSouceValue(souceNumber.nextInt());
        }
        System.out.println("choose the amount you want :");
        Scanner x = new Scanner(System.in);
        int amount = x.nextInt();
//        this.SellProductAmountValidation( amount , choice);
        
        System.out.println("press 1 for buy , 2 for back:");
        Scanner choice2 = new Scanner(System.in);
        int buy = choice2.nextInt();
//        this.SellProductChoiceValidation(choice2);
        if(buy == 1){
            //if candy
            if (product == 1) {
                System.out.println("bill : " + (this.candy.getProductCost() * amount));
            } else {
                System.out.println("bill : " + (this.chips.getProductCost() * amount));
            }
        }    
    }
    
    public void SellProductChoiceValidation(Scanner choice)
    {
        System.out.println("SellProductChoiceValidation:");
        while (!choice.nextLine().equals("1")  || !choice.nextLine().equals("2") ){            
            System.out.println("SellProductChoiceValidation: while");
            System.out.println("press 1 for buy , 2 for back:");
        }
    }
    
    public void SellProductAmountValidation(Scanner amount , Scanner choice)
    {
        int index = Integer.valueOf(choice.nextLine())-1;
        int Candynumber = this.candy.getNumberOfItems();
        int chipsnumber = this.chips.getNumberOfItems();
        int [] products = { Candynumber , chipsnumber };
        while ( 
                Integer.valueOf(amount.nextLine()) > 1  && 
                Integer.valueOf(amount.nextLine()) < products[index] 
            ){            
                System.out.println("please enter a number from 1 to" +  products[index]  );
            }
    }
    
    
}
