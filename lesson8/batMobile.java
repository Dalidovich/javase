class BatMobile extends Car{
    private String name;
    int patrons=10;
    int quantityOfShots=13;
    public BatMobile(String name) {
        super(name);
    }
    @Override
    public void drive(int howLong) {
        System.out.println("BatMobile drive: " + (howLong*2) + "km");
    }
    public void shoot(int patrons){
        for (int i=0;i<quantityOfShots;i++) {
            if (patrons > 0) {
                System.out.print("fire! ");
                patrons--;
            } else {
                System.out.println("\n ammo ran out");
            }
        }
    }
}
