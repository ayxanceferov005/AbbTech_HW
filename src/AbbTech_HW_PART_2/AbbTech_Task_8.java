package AbbTech_HW_PART_2;

public class AbbTech_Task_8 {
    public static void main (String[] args){

        // Məntiqi Xətalar — Compiler Tutmaz - Task 8

        int yas = 25;
        double gelir = 1200.0;
        boolean tarix = true;

       // Kredit şərti: yaş 21-65, gəlir 800-dən çox, tarix true olmalı

        boolean yasUygun  = yas >= 21 && yas <= 65;   // >=,<= olmalıdır >,< əvəzinə.
        boolean gelirUygun = gelir >= 800;              // >= olmalıdır > əvəzinə.
        boolean uygun      = yasUygun && gelirUygun && tarix; // kreditin verilib-verilmədiyini ||-la hesablamaq
        // yanlışdır, &&-la bütün şərtlər ödənməlidir.

        System.out.println("Yaş uyğun:   " + yasUygun);
        System.out.println("Gəlir uyğun: " + gelirUygun);
        System.out.println("Kredit:      " + uygun);

    }
}
