import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static int getId(ArrayList<User> users){
        Scanner input22 = new Scanner(System.in);
        System.out.print("Digite o nome do usuario: ");
        String name = input22.next();
        int id = - 1;
        for(int i = 0; i < users.size(); i++) {
            String curr = users.get(i).name;
            if (name.equals(curr)) {
                id = i;
            }
        }
        return id;
    }

    public static void main(String[] args) {
        // 1 opção de criação de usuario
        // 2 opção de edição de usuario
        // 3 opção de adição de amigos
        // 4 opção de msg

        Scanner input = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<User>();
        while(true){
            System.out.print("Digite 1 para criar uma conta / ");
            System.out.print("Digite 2 para edição de usuario / ");
            System.out.print("Digite 3 para adição de amigos / " );
            System.out.print("Digite 4 para mandar uma mensagem / ");
            System.out.println("Digite 5 para mostrar tudo e sair");
            System.out.print("Escolha:");
            int op = input.nextInt();
            if(op == 1){
                System.out.println("  Criando conta  ");
                Scanner input2 = new Scanner(System.in);
                Scanner input3 = new Scanner(System.in);
                Scanner input4 = new Scanner(System.in);
                String name, login,password;
                System.out.print("Digite seu nome: ");
                name = input2.next();
                System.out.print("Digite seu login: ");
                login = input3.next();
                System.out.print("Digite seu password: ");
                password = input4.next();
                //System.out.println(name + " " + login + " " + password);
                User aux = new User(name,login, password);
                users.add(aux);
                System.out.println("Usuario cadastrado");
            }else if(op == 2){
                System.out.println("  Edição de usuaŕio  ");
                Scanner input3 = new Scanner(System.in);
                Scanner input4 = new Scanner(System.in);
                String name;
                int id = getId(users);
                if(id == -1){
                    System.out.println("  usuario não existe  ");
                    continue;
                }
                System.out.print("Digite 1 para editar o nome / ");
                System.out.print("Digite 2 para editar o login / ");
                System.out.print("Digite 3 para editar a senha / " );
                System.out.print("Digite 4 para editar a idade / ");
                System.out.println("Digite 5 para editar o endereço / ");
                System.out.print("Escolha:");
                int choice = input3.nextInt();
                if(choice == 1){
                    System.out.print("Digite o novo nome: ");
                    String newName = input4.next();
                    users.get(id).setName(newName);
                }else if(choice == 2){
                    System.out.print("Digite o novo login: ");
                    String newName = input4.next();
                    users.get(id).setLogin(newName);
                }else if(choice == 3){
                    System.out.print("Digite a nova senha: ");
                    String newName = input4.next();
                    users.get(id).setPassword(newName);
                }else if(choice == 4){
                    System.out.print("Digite a nova idade: ");
                    int age = input4.nextInt();
                    users.get(id).setAge(age);
                }else if(choice == 5){
                    System.out.print("Digite o novo endereço: ");
                    String newName = input4.next();
                    users.get(id).setName(newName);
                }else{
                    System.out.println("Escolha n existe");
                    continue;
                }
            }else if(op == 3){
                System.out.println("  Adição de usuaŕio  ");
                int id1 = getId(users);
                int id2 = getId(users);
                String name1 = users.get(id1).name;
                String name2 = users.get(id2).name;
                if(users.get(id1).searchInvite(name2)){
                    users.get(id1).addUser(name2);
                    users.get(id2).addUser(name1);
                    System.out.println(name2 + " agora é amigo de " + name1);
                }else{
                    users.get(id2).inviteFriend(name1);
                    System.out.println("Convite enviado para " + name2);
                }
            }else if(op == 4){
                System.out.println("  Envio de mensagem  ");
                Scanner input3 = new Scanner(System.in);
                String msg;
                int id = getId(users);
                if(id == -1){
                    System.out.println("  usuario não existe  ");
                    continue;
                }
                System.out.print("Digite a mensagem ao usuario: ");
                msg = input3.next();
                users.get(id).getMessage(msg);
                System.out.println(" Mensagem enviada ");
                //users
            }else{
                System.out.println("  Mostrando usuarios  ");
                for(int i = 0; i < users.size(); i++){
                    System.out.println("Nome: " + users.get(i).name +"| Login: "+users.get(i).login);
                    users.get(i).showFriends();
                    users.get(i).showInvites();
                    users.get(i).showMessages();
                }
                break;
            }
        }
    }
}
