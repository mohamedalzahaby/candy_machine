package zahaby_candy_machine;

public class Dispenser {
    
    
    protected int numberOfItems;
    protected double ProductCost;

    public Dispenser()
    {
        this.numberOfItems = 50;
        this.ProductCost = 50.0;
    }
    public Dispenser(int setNoOfItems, double setCost) 
    {
        this.numberOfItems = setNoOfItems;
        this.ProductCost = setCost;
    }
    public void setProductCost(double ProductCost) {
        this.ProductCost = ProductCost;
    }
    public double getProductCost(){
        return this.ProductCost;
    }
    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }
    public int getNumberOfItems(){
        return this.numberOfItems;
    }
    public void makeSale()
    {
        this.numberOfItems = this.numberOfItems - 1; 
    }
    
    
}
