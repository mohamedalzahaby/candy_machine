package zahaby_candy_machine;

import java.util.HashMap;

public class Chips extends Dispenser
{
    HashMap<String, Double> souceCosts;
    HashMap<Integer, String> souces;
    double souceValue;

    public Chips() {
        this.numberOfItems = 50;
        this.ProductCost = 50.0;
        
        souceCosts = new HashMap<>();
        souceCosts.put("cheese", 50.0);
        souceCosts.put("tomato", 60.0);
        souceCosts.put("chocolate", 50.0);
        
        souces = new HashMap<>();
        souces.put(1,"cheese");
        souces.put(2,"tomato");
        souces.put(3,"chocolate");
    }
    
    public Chips(int setNoOfItems, int setCost , int souceNumber) 
    {
        this.numberOfItems = setNoOfItems;
        this.ProductCost = setCost;
        
        souceCosts = new HashMap<>();
        String souceName = souces.get(souceNumber);
        this.souceValue = souceCosts.get(souceName);
    }
    public void setSouceValue(int souceNumber)
    {
        String souceName = souces.get(souceNumber);
        this.souceValue = souceCosts.get(souceName);
    }
    public double getSouceValue(int souceNumber)
    {
        return this.souceValue;
    }
    @Override
    public double getProductCost(){
        return this.ProductCost + this.souceValue;
    }
    
    
    
}
