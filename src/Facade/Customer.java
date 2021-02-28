package Facade;

import java.util.HashMap;
import java.util.Map;

public class Customer {
    private String name;
    private Map<Crypto,Double> allCurencies = new HashMap<>();

    public Customer(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void observerUpdate(Crypto crypto, double value){
        System.out.println("Hello " + this.name + " , price for " + crypto.getClass().getName().subSequence(8,crypto.getClass().getName().length()) + " was updated at " + value);
    }

    public void updateAmount(Crypto crypto, Double amount){
        allCurencies.put(crypto,amount);
    }


}
