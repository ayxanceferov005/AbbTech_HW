package AbbTech_HW_PART_2;

public class AbbTech_Task_5 {
    public static void  main (String[] args){

        //Həqiqi Bölmə — Orta Hesab - Task 5


        int bal1=78, bal2=91, bal3=84;


        double orta= ((double) bal1 + bal2 + bal3) / 3;

        System.out.println(orta);


        /* (bal1 + bal2 + bal3) / 3 — Yanlışdır, çünki 84.0 cavabı verir, qalıq bölməni əks etdirmir.
            Bu səbəbdən iki tərəfdən biri double olmalı idi, ya yuxarıdaki kimi
            və yaxud 3 əvəzinə 3.0 yazılaraq. */


    }
}
