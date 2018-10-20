public class Task1_2 {
    public static void main(String[] args) {
        players[] group = new players[5];
        Date_Last_Game[] group1 = new Date_Last_Game[5];
        group[0] = new players();
        group[0].nickname= "Ivan";
        group[0].email= "yufyje0@tyt";
        group[0].winrate= 42;
        group[0].rating = 12354235;
        group1[0] = new Date_Last_Game();
        group1[0].day =1;
        group1[0].month =1;
        group1[0].year =2017;
        group1[0].hour =10;
        group1[0].minute =15;
        System.out.println(group[0]+". Date_Last_Game "+group1[0]+"\n");

        group[1] = new players();
        group[1].nickname= "Lizz";
        group[1].email= "yusgve1@tyt";
        group[1].winrate= 15;
        group[1].rating = 2456734;
        group1[1] = new Date_Last_Game();
        group1[1].day =2;
        group1[1].month =2;
        group1[1].year =2017;
        group1[1].hour =11;
        group1[1].minute =13;
        System.out.println(group[1]+". Date_Last_Game "+group1[1]+"\n");

        group[2] = new players();
        group[2].nickname= "Vova";
        group[2].email= "lkftm2@tyt";
        group[2].winrate = 23;
        group[2].rating = 36969;
        group1[2] = new Date_Last_Game();
        group1[2].day =3;
        group1[2].month =3;
        group1[2].year =2017;
        group1[2].hour =45;
        group1[2].minute =27;
        System.out.println(group[2]+". Date_Last_Game "+group1[2]+"\n");

        group[3] = new players();
        group[3].nickname= "Pit";
        group[3].email= "pofryjgm3@tyt";
        group[3].winrate = 68;
        group[3].rating = 46768;
        group1[3] = new Date_Last_Game();
        group1[3].day =4;
        group1[3].month =4;
        group1[3].year =2017;
        group1[3].hour =23;
        group1[3].minute =59;
        System.out.println(group[3]+". Date_Last_Game "+group1[3]+"\n");

        group[4] = new players();
        group[4].nickname= "Alex";
        group[4].email= "ihgiu4@tyt";
        group[4].winrate = 39;
        group[4].rating = 54;
        group1[4] = new Date_Last_Game();
        group1[4].day =5;
        group1[4].month =5;
        group1[4].year =2017;
        group1[4].hour =43;
        group1[4].minute =43;
        System.out.println(group[4]+". Date_Last_Game "+group1[4]+"\n");
    }
}
