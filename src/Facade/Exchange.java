package Facade;

public interface Exchange {

    public void addCustomer(Customer customer);
    public void deleteCustomer(Customer customer);
    public void updateAmount(Customer customer, Crypto cryptocoin, Double amounts);
    public void updatePrice(Crypto cryptocoin, Double amount);

}
