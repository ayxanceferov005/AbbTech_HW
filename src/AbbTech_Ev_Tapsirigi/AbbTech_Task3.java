package AbbTech_Ev_Tapsirigi;

public class AbbTech_Task3 {
    public static void main(String[] args) {

        // Sabitlər — Bank Limiti - TASK 3

        final int MIN_KREDIT = 300;
        final int MAX_KREDIT = 50000;
        final double ILLIK_STANDART_FAIZ = 10.9;
        final String BANKIN_STANDART_ADI = "ABB";
        final int MAX_KREDIT_MUDDETI_AY = 60;

        /* MIN_KREDIT = 400; Dəyəri dəyişməyə çalışdıqda aşağıda qeyd olunan xəta qeyd olunur
         java: cannot assign a value to final variable MIN_KREDIT */


        System.out.println("Minimal Kredit Məbləği: " + MIN_KREDIT);
        System.out.println("Maksimal Kredit Məbləği: " + MAX_KREDIT);
        System.out.println("İllik standart faiz: " + ILLIK_STANDART_FAIZ);
        System.out.println("Bankın qısa adı: " + BANKIN_STANDART_ADI);
        System.out.println("Maksimal kredit müddəti (ay): " + MAX_KREDIT_MUDDETI_AY);


    }
}





