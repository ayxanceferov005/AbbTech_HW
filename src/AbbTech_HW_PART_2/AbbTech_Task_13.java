package AbbTech_HW_PART_2;

public class AbbTech_Task_13 {
    public static void main (String[] args) {

        // Cümlə Analizi - Task 13

        String metn = " Java proqramlaşdırma dili çox güclüdür! ";


        System.out.println("Trimdən əvvəl uzunluq: " + metn.length() +  "\nTrimdən sonra uzunluq: " +  metn.trim().length());
        System.out.println("\"Java\" sözü varmı?: " + metn.contains("Java"));
        System.out.println("\"proqramlaşdırma\" -> \"programming\" : " + metn.replace("proqramlaşdırma","programming"));
        System.out.println("İlk 4 hərf nədir?: " + metn.trim().substring(0,4));
        System.out.println("\"!\" işarəsi varmı?: " + metn.contains("!"));
        System.out.println("mətn kiçik hərflə, trim edilmiş: " + metn.toLowerCase().trim());
    }
}
