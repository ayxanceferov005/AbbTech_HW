package AbbTech_Ev_Tapsirigi;

public class AbbTech_Task9 {
    public static void main (String[] args){

        //3 Rəqəmli Ədədi Parçala - Task 9

        int say = 583;

        int netice1 = say/100;
        int netice2 = (say%100)/10;
        int netice3 = say % 10;

        System.out.println("Yüzlər: " + say/100);
        System.out.println("Onlar: " + (say%100)/10);
        System.out.println("Birlər: " + say % 10);
        System.out.println("Cəm: " + (netice1 + netice2 + netice3));

        int say2 = 904;

        int netice_1 = say2/100;
        int netice_2 = (say2%100)/10;
        int netice_3 = say2 % 10;

        System.out.println();
        System.out.println("Yüzlər: " + say2 / 100);
        System.out.println("Onlar: " + (say2 % 100)/10);
        System.out.println("Birlər: " + say2 % 10);
        System.out.println("Cəm2: " + (netice_1 + netice_2 + netice_3));


    }
}
