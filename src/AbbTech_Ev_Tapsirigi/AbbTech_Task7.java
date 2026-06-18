public class AbbTech_Task7 {
    public static void main (String[] args){

        // Kredit Hesabı - Task 7

        double mebleg = 8000.0;
        double illikFaiz = 15.0;
        int muddet = 12;

        System.out.println("Ümumi faiz: " + (mebleg * (illikFaiz/100)));
        System.out.println("Ümumi ödəniş: " + (mebleg + (mebleg * (illikFaiz/100))));
        System.out.println("Aylıq ödəniş: " + (mebleg + (mebleg * (illikFaiz/100))) / muddet);

    }
}
