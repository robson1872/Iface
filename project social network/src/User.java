import java.util.ArrayList;
public class User {
    public String name;
    public String login;
    public String password;

    public int age;
    public String address;

    public ArrayList<String> msgs = new ArrayList<String>();
    public ArrayList<String> friends = new ArrayList<String>();
    public ArrayList<String> invites = new ArrayList<String>();

    public User(String name, String login, String password){
        this.name = name;
        this.login = login;
        this.password = password;
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

    public void getMessage(String msg){
        this.msgs.add(msg);
    }
    public void addUser(String name){
        this.friends.add(name);
    }
    public void inviteFriend(String name){
        this.invites.add(name);
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

}
