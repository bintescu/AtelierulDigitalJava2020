package Facade;

import java.util.ArrayList;
import java.util.List;

public class Binance implements Exchange {

    List<Customer> allCustomers = new ArrayList<>();

    @Override
    public void addCustomer(Customer customer) {
        allCustomers.add(customer);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        allCustomers.remove(customer);
    }

    @Override
    public void updateAmount(Customer customer,Crypto cryptocoin, Double amount) {
        customer.updateAmount(cryptocoin,amount);
    }

    @Override
    public void updatePrice(Crypto cryptocoin, Double amount) {
        if (Elrond.class.equals(cryptocoin.getClass())) {
            ((Elrond)cryptocoin).updatePrice(amount);
        }
        if(Bitcoin.class.equals(cryptocoin.getClass())){
            ((Bitcoin)cryptocoin).updatePrice(amount);
        }
    }

    public void notifyCustomers(Crypto crypto, double price){
        for (Customer c: allCustomers) {
            c.observerUpdate(crypto, price);
        }
    }
}
