package AbbTech_HW_PART_2;

public class AbbTech_Task_4 {
    public static void  main (String[] args) {

        // Swap — İki Dəyişənin Yerini Dəyiş -  Task 4

         int a = 15, b = 40;

        System.out.println("Əvvəl a= " + a + " b= " + b );


         int temp = a;    // a-nın dəyərini müvəqqəti saxlayırıq
         a=b;            // b-nin dəyərini a-ya veririk
         b=temp;        // köhnə a dəyərini b-yə qaytarırıq

        System.out.println("Sonra a= " + a + " b= " + b );


    }
}
