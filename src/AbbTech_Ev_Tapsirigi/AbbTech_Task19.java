package AbbTech_Ev_Tapsirigi;

public class AbbTech_Task19 {
    public static void main (String[] args) {

        // Müştəri Kredit Hesabatı - Bonus

        String musteriAdi = "Filankes Behmenkesov";
        int yasi = 44;
        double ayliqGeliri = 3800.50;
        double kreditMeblegi = 12450.50;
        int muddetAy = 12;
        double illikFaiz = 12.8;
        boolean kreditTarixi = true;

        double umumiFaiz = kreditMeblegi * illikFaiz/100;
        double ayliqOdenis = (kreditMeblegi + umumiFaiz) / muddetAy;
        double gelireNisbet = ayliqOdenis / ayliqGeliri * 100;

        boolean yasSerti = yasi > 21 && yasi <65;
        boolean gelirSerti = ayliqGeliri > 800;
        boolean meblegSerti = kreditMeblegi > 300 && kreditMeblegi < 50000;
        boolean gelireNisbet40danAzdirmi = gelireNisbet < 40;
        boolean kreditTestiqlenirmi = yasSerti && meblegSerti && gelireNisbet40danAzdirmi && kreditTarixi;

        System.out.println("Müştəri adı: " + musteriAdi);
        System.out.println("Yaşı: " + yasi);
        System.out.println("Aylıq Gəliri: " + ayliqGeliri);
        System.out.println("Kredit Məbləği: " + kreditMeblegi);
        System.out.println("Kredit Müddəti: " + muddetAy);
        System.out.println("İllik Faiz: " + illikFaiz);
        System.out.println("Kredit tarixiI: " + kreditTarixi);
        System.out.println();
        System.out.println("Ümumi faiz: " + umumiFaiz);
        System.out.println("Aylıq ödəniş: " + ayliqOdenis);
        System.out.println("Gəlirə Nisbət: " + gelireNisbet);
        System.out.println();
        System.out.println("Yaş şərti: " + yasSerti);
        System.out.println("Gəlir şərti: " + gelirSerti);
        System.out.println("Məbləğ şərti: " + meblegSerti);
        System.out.println("Gəlirə nisbət 40%-dən az mı?: " + gelireNisbet40danAzdirmi);
        System.out.println("Kredit təstiqlənir mi?: " + kreditTestiqlenirmi );

        }

    }
