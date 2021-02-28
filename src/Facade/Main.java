package Facade;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Andrei");
        Customer c2 = new Customer("Mihai");
        Binance binance = new Binance();
        Bitcoin bitcoin = new Bitcoin(10000,binance);
        Elrond elrond = new Elrond(150,binance);
        binance.addCustomer(c1);
        binance.addCustomer(c2);
        binance.updateAmount(c1,bitcoin,2.3);
        binance.updateAmount(c2,elrond,4.55);
        binance.updatePrice(bitcoin,5023.10);
        binance.updatePrice(elrond, 104.00);

    }
}
