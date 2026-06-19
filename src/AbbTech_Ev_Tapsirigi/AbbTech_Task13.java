package AbbTech_Ev_Tapsirigi;

public class AbbTech_Task13 {
    public static void main (String[] args) {


        // Kredit Uyğunluğu — 3 Müştəri - Task 13

        int yas_1 = 34;
        int gelir_1 = 1500;
        int mebleg_1 = 10000;
        boolean tarix_1 = true;

        int yas_2 = 19;
        int gelir_2 = 950;
        int mebleg_2 = 3000;
        boolean tarix_2 = true;

        int yas_3 = 45;
        int gelir_3 = 750;
        int mebleg_3 = 7000;
        boolean tarix_3 = false;


        boolean yasAraligi_1 = yas_1>21 && yas_1<65;
        boolean ayliqGelir_1 = gelir_1>800;
        boolean kreditMeblegi_1 =  mebleg_1>300 && mebleg_1<50000;
        boolean kreditTarixi_1 = true;
        boolean kreditTesdiq_1 = yasAraligi_1 && ayliqGelir_1 && kreditTarixi_1 && kreditMeblegi_1;


        boolean yasAraligi_2 = yas_2>21 && yas_2<65;
        boolean ayliqGelir_2 = gelir_2>800;
        boolean kreditMeblegi_2 =  mebleg_2>300 && mebleg_2<50000;
        boolean kreditTarixi_2 = true;
        boolean kreditTesdiq_2 = yasAraligi_2 && ayliqGelir_2 && kreditTarixi_2 && kreditMeblegi_2;

        boolean yasAraligi_3 = yas_3>21 && yas_3<65;
        boolean ayliqGelir_3 = gelir_3>800;
        boolean kreditMeblegi_3 =  mebleg_3>300 && mebleg_3<50000;
        boolean kreditTarixi_3 = true;
        boolean kreditTesdiq_3 = yasAraligi_3 && ayliqGelir_3 && kreditTarixi_3 && kreditMeblegi_3;


        System.out.println("Birinci müştəri üçün kredit təsdiqlənir mi?: " + kreditTesdiq_1);
        System.out.println("ikinci müştəri üçün kredit təsdiqlənir mi?: " + kreditTesdiq_2);
        System.out.println("Müştəri müştəri üçün kredit təsdiqlənir mi?: " + kreditTesdiq_3);


    }
}
