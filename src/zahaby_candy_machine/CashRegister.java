package zahaby_candy_machine;

public class CashRegister {

    private int cashOnHand;
    
    public CashRegister()
    {
        this.cashOnHand = 500;
    }
    //Default constructor
    //To set the cash in the register 500 cents
    //Postcondition: cashOnHand = 500;
    public CashRegister(int cashIn)
    {
        this.cashOnHand = cashIn;
    }
    public void setCashOnHand(int cashIn)
    {
        this.cashOnHand = cashIn;
    }
    //Constructor with parameters
    //Postcondition: cashOnHand = cashIn;
    public int getCashOnHand()
    {
        return this.cashOnHand ;
    }
    //Method to show the current amount in the cash register
    //Postcondition: The value of the instance variable
    // cashOnHand is returned
    public void acceptAmount(int amountIn)
    {
        this.cashOnHand = this.cashOnHand + amountIn;
    }
    //Method to save received amount deposited by
    //the customer and update the amount in the register
    //Postcondition: cashOnHand = cashOnHand + amountIn
    public String toString()
    {
        return "“With you Ahmed in your service, How can I help you?”";
    }
    //Method to display this message “With you Ahmed in your service, How can I help you?”
    
}
