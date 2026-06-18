public class AbbTech_Task6 {
    public static void main (String[] args) {

        // Dörd Əməliyyat + Qalıq - TASK 6

        int a = 17, b = 5;  //+ - * / %

        System.out.println("Cəmi: " + (a+b));
        System.out.println("Fərqi: " + (a-b));
        System.out.println("Vurma: " + (a*b));
        System.out.println("Faiz: " + (a%b));
        System.out.println("Bölmə: " + (a/b));

        //Nəticəni tam ədədlə deyil, düzgün, kəsrlə əldə olunması üçün aşağıda qeyd olunan qayda ilə yazılmalıdır
        System.out.println("Bölmə kəsrlə: " + ((double) a/b));

    }
}
