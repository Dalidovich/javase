public class Task4 {
    public static void main(String[] args) {
        double NPCx=0 + (int) (Math.random() * 100);
        double NPCy=0 + (int) (Math.random() * 100);
        double PLx=0 + (int) (Math.random() * 100);
        double PLy=0 + (int) (Math.random() * 100);
        double way=Math.floor(Math.sqrt(Math.pow((PLx-NPCx),2)+Math.pow((PLy-NPCy),2)));
        System.out.println("before NPS: ~"+way+" m");
    }
}
