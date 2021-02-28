package Facade;

public class Elrond extends Crypto implements CryptoCoin {

    private double price;
    public Binance binance;

    public Elrond(double price, Binance binance){
        this.price = price;
        this.binance = binance;
    }
    @Override
    public boolean updatePrice(double amount) {
        if(amount >= 0){
            price = amount;
            notifyExchange(this,amount);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void notifyExchange(Crypto crypto, double value) {
        binance.notifyCustomers(crypto, value);
    }

    @Override
    public int getNumber_of_blocks() {
        return number_of_blocks;
    }

    @Override
    public void setNumber_of_blocks(int number_of_blocks) {
        number_of_blocks = number_of_blocks;
    }

    @Override
    public int getHashrate() {
        return hashrate;
    }

    @Override
    public void setHashrate(int hashrate) {
        hashrate = hashrate;
    }
}
