package AbbTech_Ev_Tapsirigi;

public class AbbTech_Task16 {
    public static void main (String[] args) {

        //String Metodları Məşqi - Task 16

        String metn = " Salam, ABB Bank! ";

        System.out.println(metn.length());
        System.out.println(metn.trim());
        System.out.println(metn.toUpperCase());
        System.out.println(metn.toLowerCase());
        System.out.println(metn.contains("ABB"));
        System.out.println(metn.contains("bank"));
        System.out.println(metn.replace("Bank", "Kredit"));
        System.out.println(metn.trim().startsWith("Salam"));

    }
}
