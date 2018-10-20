public class Task3 {
    public static void main(String[] args) {
        double HP = 23;
        if (HP < (100 / 100) * 25) {
            System.out.println("RED");
        } else if (HP < (100 / 100) * 50) {
            System.out.println("ORANGE");
        } else if (HP < (100 / 100) * 75) {
            System.out.println("YELLOW");
        } else
            System.out.println("GREEN");
    }
}
