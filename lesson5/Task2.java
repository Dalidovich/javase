public class Task2 {
    public static void main(String[] args) {
        int col_vo__death_tanks_pl1 = 2;
        int col_vo__death_tanks_pl2 = 1;
        int ballspl1 = 0;
        int ballspl2 = 0;
        int ballsplwin = 0;
        for (int i = 1; i <= col_vo__death_tanks_pl1; i++) {
            ballspl1 += 100;
        }
        for (int i = 1; i <= col_vo__death_tanks_pl2; i++) {
            ballspl2 += 100;
        }
        if (ballspl1 > ballspl2) {
            ballsplwin = ballspl1;
            ballspl1 += 1000;
        } else {
            ballspl2 += 1000;
            ballsplwin = ballspl2;
        }


        if (ballspl1 > ballspl2) {
            System.out.println("player1  Bals before: " + ballspl1 + "player1  Bals after: " + ballsplwin);
            System.out.println("player1  Bals: " + ballspl2);
        } else {
            System.out.println("player1  Bals before: " + ballspl2 + "player1  Bals after: " + ballsplwin);
            System.out.println("player1  Bals: " + ballspl1);
        }
    }
}