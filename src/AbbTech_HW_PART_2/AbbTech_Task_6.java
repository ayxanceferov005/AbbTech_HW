package AbbTech_HW_PART_2;

public class AbbTech_Task_6 {
    public static void main (String[] args){

        //final ilə Sabitlər — Niyə Vacibdir?  - Task 6

        final double PI = 3.14159;
        final int MAX_DENEME = 3;
        final String BANK_KODU = "ABB01";

        /* BANK_KODU = "ABB02";
           MAX_DENEME = 5;
           PI = 3.19;

           java: cannot assign a value to final variable BANK_KODU
           java: cannot assign a value to final variable MAX_DENEME
           java: cannot assign a value to final variable PI

           xətaları verir, səbəb Final dəyişəni varsa, ona yeni dəyər vermək mümkün deyil.   */

        System.out.println("PI = "+ PI);
        System.out.println("Maksimum cəhd: " + MAX_DENEME);
        System.out.println("Bank kodu: " + BANK_KODU);


    }
}
