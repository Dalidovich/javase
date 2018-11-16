public class BruceWeyne {
    public static void main(String[] args) {
        int howLong=120;
            BatMobile bat= new BatMobile("batMobile");
            bat.display();
            bat.start();
            bat.drive(howLong);
            bat.shoot(bat.patrons);
            bat.stop();
    }
}
