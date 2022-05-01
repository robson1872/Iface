import java.util.ArrayList;
public class Comunity{
    private String name;
    private String creator_user;
    private String description;
    private ArrayList<Member> members = new ArrayList<Member>();
    private ArrayList<String> news = new ArrayList<String>();

    public Comunity(String name, User creator_user, String description){
        this.name = name;
        this.creator_user = creator_user.getName();
        this.description = description;
        Member creator = new Moderator(creator_user.getName(),creator_user.getLogin());
        this.addUser(creator);
    }
    public String getName(){
        return this.name;
    }

    public void addUser(Member member){
        this.members.add(member);
    }
//    public void deleteUser(String login){
//        this.members.add(name);
//    }
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
