public class Task4 {
    public static void main(String[] args) {
        int hp = 10000;
        int teamDamage = 1753;
        int regen = 156;
        int x_reg = 10;
        for (int m = 0; m < 60; m++) {
            hp = hp - teamDamage;
            hp += regen;
            if (hp == hp - (hp / 100) * 10) {
                regen += (regen / 100) * x_reg;
            }

        }
        if (hp <= 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}