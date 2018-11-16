public class Car {
    private String name;
    public Car(String name) {
        this.name = name;
    }
    public void display() {
        System.out.println("car name: " + name);
    }
    public void start() {
        System.out.println(name+" Starting");
    }
    public void stop() {
        System.out.println(name+" Stoping");
    }
    public void drive(int howLong) {
        System.out.println("Car drive: " + howLong + "km");
    }
}
