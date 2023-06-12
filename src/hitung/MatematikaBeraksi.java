package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika rafli = new Matematika(5,0);
        
        System.out.println("Hasil penjumlahan: "+rafli.setPenjumlahan());
        System.out.println("Hasil pengurangan: "+rafli.setPengurangan());
        System.out.println("Hasil perkalian: "+rafli.setPerkalian());
        System.out.println("Hasil pembagian: "+rafli.setPembagian());
    }
}
