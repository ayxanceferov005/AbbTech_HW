package AbbTech_Ev_Tapsirigi;

public class AbbTech_Task14 {
    public static void main (String[] args) {

        // Ədədin Xüsusiyyətlərini Tapın - Task 14

        int n = 84;

        boolean cutdur = n % 2 == 0;
        boolean musbetdir = n > 0;
        boolean uceBolunur = n % 3 ==0;
        boolean yeddiyeBolunur = n % 7 ==0;
        boolean uceVeYeddiyeBolunur = n % 3==0 && n % 7 ==0;
        boolean ondanBoyukdurYuzdenKicikdir = n > 10 && n < 100;

        System.out.println("Cütdür? " + cutdur);
        System.out.println("Müsbətdir? " + musbetdir);
        System.out.println("3-ə bölünür? " + uceBolunur);
        System.out.println("7-yə bölünür? " + yeddiyeBolunur);
        System.out.println("Həm 3-ə, həm 7-yə bölünür? " + uceVeYeddiyeBolunur);
        System.out.println("10-dan böyük, 100-dən kiçik? " + ondanBoyukdurYuzdenKicikdir);


    }
}
