import java.util.Scanner;
public class Player {
    Scanner in = new Scanner(System.in);
    public String gameName="rim";//in.nextLine();
    public String games[]=new String[5];
    private String nickname="Fin";
    private int age=10;
    public int cash=100;
    public void Buy(){
        System.out.println("before buy cash: "+cash+", age: "+age);
        new Steam().sell(age,cash,gameName);
    }
}

