package AbbTech_HW_PART_2;

public class AbbTech_Task_12 {
    public static void main (String[] args) {

        // Ad Formatla -  Task 12

        String tamAd = "nigar əliyeva";

        int bosluq = tamAd.indexOf(" ");



        System.out.println("Ad Soyad: " + tamAd.substring(0,1).toUpperCase()+tamAd.substring(1,bosluq)
                + tamAd.substring(bosluq,7).toUpperCase()+tamAd.substring(7));
        System.out.println("Ad: " + tamAd.substring(0,1).toUpperCase()+tamAd.substring(1,bosluq));
        System.out.println("Soyad: " + tamAd.substring(bosluq
                ,7).toUpperCase()+tamAd.substring(7));
        System.out.println("Baş hərflər: " +tamAd.substring(0,1).toUpperCase() + "." + tamAd.substring(6,7).toUpperCase() + ".");
        System.out.println("Böyük hərflərlə: " + tamAd.toUpperCase());

    }
}
