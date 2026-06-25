package AbbTech_HW_PART_2;

public class AbbTech_Task_3 {
    public static void  main (String[] args){

        // Nəticəni Söylə - Task 3

        int     a = 8,  b = 3;
        boolean p = true, q = false;
        String  s = "QA";

        System.out.println("a + b = " + (a+b));
        System.out.println("a - b * 2 = " + (a - b * 2));
        System.out.println("a / b = " + ((double) a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("p && q = "+  (p && q));
        System.out.println("p || q = " + (p || q));
        System.out.println("!p && !q = "  + (!p && !q));
        System.out.println("a > 5 || b > 5 = " + (a > 5 || b > 5));
        System.out.println("s + a + b = " + (s + a + b));
        System.out.println("a + b + s = " + (a + b + s));

        /* Java ifadələri soldan sağa qiymətləndirir. Əgər əməliyyatda ilk olaraq
           String iştirak edirsə, sonrakı dəyərlər String-ə çevrilərək birləşdirilir.
           Əgər String-dən əvvəl yalnız rəqəmlər varsa, onlar əvvəlcə riyazi olaraq
           hesablanır, sonra nəticə String ilə birləşdirilir. */


    }
}
