package Observer;

public class Main {
    public static void main(String[] args) {
        User Aurel = new User("Aurel");
        User Georgel = new User("Georgel");
        User Mihai = new User("Mihai");
        Aurel.addFriend(Georgel);
        Aurel.addFriend(Mihai);
        Aurel.creeazaPostare("Bitcoin va creste !");

        User Alexandru = new User("Alexandru");
        Alexandru.creeazaPostare("Nimic nu e ceea ce pare!");
        Mihai.addFriend(Alexandru);

    }
}
