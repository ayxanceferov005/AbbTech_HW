package AbbTech_Ev_Tapsirigi;

public class AbbTech_Task17 {
    public static void main (String[] args) {

        // String Müqayisəsi — == ilə .equals() fərqi - Task 17

        String s1 = "test";
        String s2 = "test";
        String s3 = "TEST";

        System.out.println("s1=s2: " +  s1.equals(s2)); // s1-dəki sözlə s2-dəki eyni qaydada yazılıb
        System.out.println("s1=s3: " + s1.equals(s3)); // s1-dəki sözlə s3-dəki fərqli yazılıb, böyük hərflərlə
        System.out.println("s1= IgnoreCare s3: " + s1.equalsIgnoreCase(s3));
        // s3-də İgnoreCase olduğundan hərflər balaca yazılıb bu səbəbdən bərabər sayılır
        System.out.println("s1= trim \"test\":  " + s1.equals(" test ".trim()));
        // trim olduğundan stringin içindəki sözün önündə və sonundaki boşluqlar silinib, bu səbəbdən equal sayılır.


    }
}
