import java.util.ArrayList;
public class User {
    public String name;
    public String login;
    public String password;
    public boolean justFriends;

    public int age;
    public String address;

    public ArrayList<String> msgs = new ArrayList<String>();
    public ArrayList<String> friends = new ArrayList<String>();
    public ArrayList<String> invites = new ArrayList<String>();
    public ArrayList<String> comunitys = new ArrayList<String>();
    public ArrayList<String> news = new ArrayList<String>();

    public User(String name, String login, String password){
        this.name = name;
        this.login = login;
        this.password = password;
        this.justFriends = false;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setLogin(String login){
        this.login = login;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setJustFriends(boolean x){
        this.justFriends = x;
    }


    public void getMessage(String msg){
        this.msgs.add(msg);
    }
    public void addUser(String name){
        this.friends.add(name);
    }
    public void inviteFriend(String name){
        this.invites.add(name);
    }
    public void getNews(String a){
        this.news.add(a);
    }
    public void addCommunity(String a){
        this.comunitys.add(a);
    }

    public boolean searchInvite(String name){
        for(int i = 0; i < invites.size() ; i++){
            String curr = invites.get(i);
            if(name.equals(curr)){
                return true;
            }
        }
        return false;
    }
    public boolean searchFriend(String name){
        for(int i = 0; i < friends.size() ; i++){
            String curr = friends.get(i);
            if(name.equals(curr)){
                return true;
            }
        }
        return false;
    }
    public void showFriends(){
        System.out.println("Lista de amigos de " + this.name);
        for(int i = 0; i < friends.size() ; i++){
            System.out.println(friends.get(i));
        }
        System.out.println("Fim da lista");
    }
    public void showMessages(){
        System.out.println("Lista de mensagens de " + this.name);
        for(int i = 0; i < msgs.size() ; i++){
            System.out.println(msgs.get(i));
        }
        System.out.println("Fim da lista");
    }
    public void showInvites(){
        System.out.println("Lista de convites de " + this.name);
        for(int i = 0; i < invites.size() ; i++){
            System.out.println(invites.get(i));
        }
        System.out.println("Fim da lista");
    }
    public void showCommunities(){
        System.out.println("Lista de comunidades de " + this.name);
        for(int i = 0; i < comunitys.size() ; i++){
            System.out.println(i+ " - " + comunitys.get(i));
        }
    }

    public void showNews(){
        System.out.println("Feed de noticias de " + this.name);
        for(int i = 0; i < news.size() ; i++){
            System.out.println(news.get(i));
        }
        System.out.println("Fim da lista");
    }
}
