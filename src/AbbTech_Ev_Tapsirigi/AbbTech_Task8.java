package AbbTech_Ev_Tapsirigi;

public class AbbTech_Task8 {

    public static void main (String[] args){

        // Celsius → Fahrenheit - Task 8

        int celsiusA =0, celsiusB=100, celsiusC=37;

        System.out.println("0°C → Fahrenheit= " + (celsiusA*9/5 + 32));
        System.out.println("100°C → Fahrenheit= " + (celsiusB*9/5 + 32));
        System.out.println("32°C → Fahrenheit= " + ((double) celsiusC*9/5 + 32));
        /* (double) əlavəsi edilmədikdə cavab yanlış olaraq 98 kimi təqdim olunur.
        Yanlış cavab alınmasını təsdiq etmək üçün yanlış qayda aşağıda yazılın */
        System.out.println("32°C → Fahrenheit (tam ədədlə cavab)= " + (celsiusC*9/5 + 32));




    }
}
