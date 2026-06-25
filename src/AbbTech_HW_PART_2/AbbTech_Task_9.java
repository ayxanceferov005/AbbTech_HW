package AbbTech_HW_PART_2;

public class AbbTech_Task_9 {
    public static void  main (String[] args) {

        //String Metodlarında Xəta - Task 9


        String kod = "  abb-2024  ";

        System.out.println("Simvol sayı:                           " + kod.trim().length());
        // Gözlənilən cavabın 8 gəlməsi üçün ilk öncə "trim" əlavə etməliyik ki, boşluqlar silinsin.
        System.out.println("\"abb\" sözü mövcuddur:                  " + kod.contains("abb"));
        // Gözlənilən nəticənin "true" gəlməsi üçün string içindəki "abb" kiçik yazılmalıdır case sensitive-dir.
        System.out.println("kod.trim equals \"abb-2024:\"            " +  kod.trim().equals("abb-2024"));
        // Gözlənilən nəticənin "true" gəlməsi üçün "=" istifadə etmək düzgün deyil, .equals istifadə edilməlidir
        // "=" məzmunu deyil obyekti bərabər edir.
        System.out.println("Böyük hərflər olduqda \"ABB\" mövcuddur: " + kod.toUpperCase().contains("ABB"));
        // Burada hər hansısa çətinlik mövcud deyil, cavab true olaraq əks olunur.

    }
}
