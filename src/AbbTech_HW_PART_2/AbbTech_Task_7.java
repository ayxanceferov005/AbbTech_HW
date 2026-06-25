package AbbTech_HW_PART_2;

public class AbbTech_Task_7 {
    public static void main (String[] args){

        //Məntiqi Şərt Quruluşu - Task 7

        double temp = 36.8;
        int suret =95, yanacaq=0;
        double balans = (-50.0);
        boolean hesabAktiv= false;
        String ad= "Anar";
        int yas = 22;

        boolean temperatur = temp > 36 && temp < 37.5;
        boolean suretYanacaq = suret > 0 && suret < 120 || yanacaq > 0 ;
        boolean hesabBalans = hesabAktiv =false || balans <0;
        boolean adYas = ad.length()>0 && yas>18;

        System.out.println("Temperatur 36-dan çox, 37.5-dən azdır:                       " + temperatur);
        System.out.println("Sürət 0-dan çox, 120-dən az VƏ YA yanacaq 0-dan çoxdur:      " + suretYanacaq);
        System.out.println("Hesab aktiv deyil VƏ ya balans mənfidir:                     " + hesabBalans);
        System.out.println("Ad boş deyil (uzunluğu 0-dan çoxdur) VƏ yaş 18-dən böyükdür: " + adYas);


    }
}
