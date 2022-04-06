import java.util.ArrayList;
public class Comunity {
    public String name;
    public String creator_user;
    public String description;
    public ArrayList<String> members = new ArrayList<String>();
    public ArrayList<String> news = new ArrayList<String>();

    public Comunity(String name, String creator_user, String description){
        this.name = name;
        this.creator_user = creator_user;
        this.description = description;
        this.members.add(creator_user);
    }
    public void addUser(String name){
        this.members.add(name);
    }
    public void addNews(String x){
        this.news.add(x);
    }

    public void showNews(){
        System.out.println("News of " + this.name);
        for(int i = 0; i < news.size(); i++){
            System.out.println(i + "- " + this.news.get(i));
        }
        System.out.println("End of the list");
    }

}
