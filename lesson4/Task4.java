public class Task4 {
    public static void main(String[] args) {
        String Complements[]={"good friend","interesting","fun","beautiful","clever"};
        int i = i = 0 + (int) (Math.random() * 5);
        Student[] group = new Student[5];
        group[0] = new Student();
        group[0].name= "Ivan";
        group[0].age = 42;
        System.out.println(group[0]+" this Student: "+ Complements[i]);
        i = i = 0 + (int) (Math.random() * 5);
        group[1] = new Student();
        group[1].name= "Lizz";
        group[1].age = 15;
        System.out.println(group[1]+" this Student: "+ Complements[i]);
        i = i = 0 + (int) (Math.random() * 5);
        group[2] = new Student();
        group[2].name= "Vova";
        group[2].age = 23;
        System.out.println(group[2]+" this Student: "+ Complements[i]);
        i = i = 0 + (int) (Math.random() * 5);
        group[3] = new Student();
        group[3].name= "Pit";
        group[3].age = 68;
        System.out.println(group[3]+" this Student: "+ Complements[i]);
        i = i = 0 + (int) (Math.random() * 5);
        group[4] = new Student();
        group[4].name= "Alex";
        group[4].age = 39;
        System.out.println(group[4]+" this Student: "+ Complements[i]);
    }
}
