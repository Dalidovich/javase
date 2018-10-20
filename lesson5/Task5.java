public class Task5 {
    public static void main(String[] args) {
        int month  =  0 + (int) (Math.random() * 12);;
        int i=1;
        String monthtitle;
        switch (month) {
            case 1:  monthtitle = "Январь";
                break;
            case 2:  monthtitle = "Февраль";
                break;
            case 3:  monthtitle = "Март";
                break;
            case 4:  monthtitle = "Апрель";
                break;
            case 5:  monthtitle = "Май";
                break;
            case 6:  monthtitle = "Июнь";
                break;
            case 7:  monthtitle = "Июль";
                break;
            case 8:  monthtitle = "Август";
                break;
            case 9:  monthtitle = "Сентябрь";
                break;
            case 10: monthtitle = "Октябрь";
                break;
            case 11: monthtitle = "Ноябрь";
                break;
            case 12: monthtitle = "Декабрь";
                break;
            default: monthtitle = " ";

        }
        System.out.println("namberMonth: "+month);
        System.out.println(monthtitle);
    }
}
