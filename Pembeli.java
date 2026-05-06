import java.util.Scanner;
class Pembeli extends User {
    Scanner input = new Scanner(System.in); 
    String namaPembeli;
    int total;
    String barang;

    public Pembeli(String nama, String namaPembeli) {
        super(nama);
        this.namaPembeli = namaPembeli;
    }

    void tambahBarang() {
        
        System.out.println("tambahkan barang: ");
        barang = input.nextLine();
        System.out.println(namaPembeli + " menambahkan barang: " + barang);
    }

    void bayar() {
    
        System.out.println("masukan harga barang:..");
        total= input.nextInt();
        
        
    }

    void struk() {
        System.out.println("===================Struk pembelian=====================");
        System.out.println("Nama pembeli: " + namaPembeli);
        System.out.println("Nama barang: " + barang);
        System.out.println("Total pembayaran: " + total);
        System.out.println("=====================================================");    
    }
}