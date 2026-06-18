public class AbbTech_Task4 {
    public static void  main (String[] args) {

        // Xətalı Kodu Düzəldin - TASK 4

        int yas = 25; // Xəta 1: int tipi kiçik hərflə yazılmalıdır.
        String sehir = "baku"; // Xəta 2: Tip String seçilikdə dəyər String formatında yazılmalıdır.
        int kreditMeblegi = 5000; // Xəta 3: Tam ədədlərdən istifadə etdikdə "double" yox, "int" istifadə olunmalıdır.
        boolean aktiv = true; // Xəta 4: Boolean dəyərlər yalnız kiçik hərflə yazıla bilər (true/false).
        final int LIMIT = 100;
        //LIMIT = 200;   Xəta 5: Dəyəri dəyişməyə çalışdıqda aşağıda qeyd olunan xəta qeyd olunur
        // java: cannot assign a value to final variable LIMIT
        System.out.println(yas); // Xəta 6: Hər bir əməliyyatın sonra yalnız ";" işarəsi əlavə olunmalıdır.

    }
}
