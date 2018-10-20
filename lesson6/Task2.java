public class Task2 {
    public static void main(String[] args)
    {
        String player[]={"Mike","lizz","Rik"};
        int gemWithPl[]=new int[player.length];
        int vseGem=0;
        for(int i=0;i<player.length;i++)
        {
            gemWithPl[i]= 0 + (int) (Math.random() * 3900);
        }


        for (int i=0;i<gemWithPl.length;i++)
        {
            if (gemWithPl[i]>=1337)
            {
                vseGem+=322;
            }

        }
        System.out.println(vseGem);
    }
}
