package Observer;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<User> prieteni;
    private List<Postare> postari;
    private List<Postare> postariPrieteni;

    public User(String name){
        this.name = name;
        prieteni = new ArrayList<>();
        postari = new ArrayList<>();
        postariPrieteni =  new ArrayList<>();
    }

    public List<Postare> getPostari() {
        return postari;
    }

    public List<Postare> getPostariPrieteni() {
        return postariPrieteni;
    }

    public String getName() {
        return name;
    }

    public List<User> getPrieteni() {
        return prieteni;
    }

    public int addFriend(User friend){
        if (!prieteni.contains(friend)){
            prieteni.add(friend);
            friend.addFriend(this);
            this.updatePostari(friend);
            this.notify(1);
            return 1;
        }

        return 0;

    }

    public void updatePostari(User friend){
        adaugaPostarilePrietenului(friend.getPostari());
        friend.adaugaPostarilePrietenului(this.getPostari());
    }

    private void adaugaPostarilePrietenului(List<Postare> posts){
        if(posts.size() != 0 ) {
            for (Postare p : posts) {
                postariPrieteni.add(p);
            }
            this.notify(2);
        }
    }

    public void creeazaPostare(String text){
        Postare post = new Postare(text,this);
        postari.add(post);
        for (User prieten : prieteni) {
            prieten.notify(2);
            prieten.updatePostarilePrietenului(this);
        }
    }

    private void updatePostarilePrietenului(User prieten) {
        Postare p = prieten.getPostari().get(prieten.getPostari().size() - 1);
        this.postariPrieteni.add(p);
    }

    private void notify(int message){
        switch (message){
            case 1:
                System.out.println("S-a adaugat un nou prieten pt user-ul " + this.name);
                break;
            case 2:
                System.out.println("Noi postari pentru " + this.name + " !");
                break;

        }
    }
}
