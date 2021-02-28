package Facade;

public abstract class Crypto {
    public int hashrate;
    public int number_of_blocks;

    public abstract int getNumber_of_blocks();

    public abstract void setNumber_of_blocks(int number_of_blocks);
    public abstract int getHashrate();

    public abstract void setHashrate(int hashrate) ;


}
