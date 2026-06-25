package AbbTech_HW_PART_2;

public class AbbTech_Task_11 {
    public static void main (String[] args){

        //Parol Yoxlaması - Task 11

        String parol = "Abb@2024";

        boolean uzunluq = parol.length() >= 8;
        boolean simvolVar = parol.contains("@");
        boolean abbIleBaslayir = parol.toUpperCase().startsWith("ABB");
        boolean reqemVar = parol.contains("2024");
        boolean gucluParol = uzunluq && simvolVar && abbIleBaslayir && reqemVar;

        System.out.println("Uzunluğu 8-dən çoxdur?:                       " +uzunluq);
        System.out.println("\"@\" simvolu var mı?:                          " + simvolVar);
        System.out.println("Böyük hərfə çevirdikdə \"ABB\" ilə başlayırmı?: " + abbIleBaslayir);
        System.out.println("Rəqəm var mı — \"2024\" hissəsi mövcuddur?:     " + reqemVar);
        System.out.println("Parol güclüdür mi?:                           " + gucluParol);

    }
}
