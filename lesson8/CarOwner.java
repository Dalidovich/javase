public class CarOwner {
    public static void main(String[] args) {
            int howLong=120;
            Car bmv = new Car("bmv");
            bmv.display();
            bmv.start();
            bmv.drive(howLong);
            bmv.stop();
            /*BatMobile bat= new BatMobile("batMobile");
            bat.display();
            bat.start();
            bat.drive(howLong);
            bat.stop();*/
    }
}
