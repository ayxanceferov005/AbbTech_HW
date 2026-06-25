package AbbTech_HW_PART_2;

public class AbbTech_Task_14 {
    public static void main (String[] args) {

        //İstifadəçi Qeydiyyat Validasiyası - Bonus Task


        //Yoxlamalar — hər birini ayrı boolean dəyişənə yazın:
        //
        //Ad boş deyil (uzunluğu > 0)
        //Yaş minimum yaşdan böyük və ya bərabərdir
        //Gəlir minimum gəlirdən çoxdur
        //Parol minimum uzunluğu ödəyir
        //Elektron poçtda "@" işarəsi var
        //Qeydiyyat uğurludur? (bütün yoxlamalar true olmalı)

        final int MINIMUM_YAS=18;
        final int PAROL_UZUNLUGU=8;
        final double MINIMUM_GELIR= 500.0;

        String ad = "Oleg";
        int yas = 48;
        double gelir = 8500.0;
        String parol= "OlegTinkov123";
        String ePoct= "oleg.tinkov@gmail.com";

        boolean adBosDeyil = ad.length() > 0;
        boolean yasUygun = yas >= MINIMUM_YAS;
        boolean gelirUygun = gelir > MINIMUM_GELIR;
        boolean uygunParol = parol.length() > PAROL_UZUNLUGU;
        boolean ePoctUygun = ePoct.contains("@");
        boolean qeydiyyatUgurludur = adBosDeyil && yasUygun && gelirUygun && uygunParol && ePoctUygun;

        System.out.println("Ad boş deyil (uzunluğu > 0):               " + adBosDeyil);
        System.out.println("Yaş minimum yaşdan böyük və ya bərabərdir: " + yasUygun);
        System.out.println("Gəlir minimum gəlirdən çoxdur:             " + gelirUygun);
        System.out.println("Parol minimum uzunluğu ödəyir:             " + uygunParol);
        System.out.println("Elektron poçtda \"@\" işarəsi var:           " + ePoctUygun);
        System.out.println("Qeydiyyat uğurludur?:                      " + qeydiyyatUgurludur);


    }
}
