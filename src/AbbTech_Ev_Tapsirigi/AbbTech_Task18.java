package AbbTech_Ev_Tapsirigi;

public class AbbTech_Task18 {
    public static void main (String[] args) {

        // Ad-Soyad Analizi - Task 18

        String tamAd = "leyla hüseynova";

        System.out.println("Baş hərflər böyük: " + tamAd.substring(0,1).toUpperCase() + tamAd.substring(1,6) +
                tamAd.substring(6,7).toUpperCase() + tamAd.substring(7));
        System.out.println("Ümumi uzunluğu: " + tamAd.length());
        System.out.println("Adın ilk 5 hərfi: " + tamAd.substring(0,5));
        System.out.println("Boşluq varmı?: " + tamAd.contains(" "));
        System.out.println("Ad \"leyla\" ilə başlayırmı?: " + tamAd.startsWith("leyla"));
        System.out.println("Böyük hərflə tam ad: " + tamAd.substring(0,5).toUpperCase());
        System.out.println("Böyük hərflə tam ad, soyad: a" + tamAd.toUpperCase());



    }
}
