package Facade;

public interface CryptoCoin {
    public boolean updatePrice(double amount);
    public void notifyExchange(Crypto crypto, double value);
}
