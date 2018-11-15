import java.util.Scanner;
public class Steam {
    Scanner in = new Scanner(System.in);
    public int steamCash=0;
    public void sell(int age,int cash,String gamename){
        System.out.println("Steam cash before buy: "+steamCash);
        new Steam().checkAge(age,cash,gamename);
    }
    public void checkAge(int age,int cash,String gamename){
        int ageL=new Game().ageLimites;
        if (age>=ageL){
            new Steam().checkLiberyGame(cash,gamename);
        }
        }
    public void checkLiberyGame(int cash,String gamename){
        int chislo=0;
            for (int j = 0; j<new Player().games.length; j++) {

                if (new Player().games[j] == gamename) {
                    chislo+=1;
                }
                else{
                    chislo-=1;
                }
                if (chislo<0){
                    new Steam().checkCash(cash,gamename);
                }
            }
            new Steam().checkCash(cash,gamename);
        }
    public void checkCash(int cash,String gamename){
        int coutGame=new Game().cost;
        if (cash>steamCash){
            cash-=coutGame;
            steamCash+=coutGame;
            new Steam().library_entry(gamename);

        }


    }
    public void library_entry(String gamename){
        System.out.println("Steam cash after bay: "+steamCash);
        for (int i =0;i<new Player().games.length;i++){
            if (new Player().games[i]==null){
                new Player().games[i]=gamename;
            }
        }

    }
    }


