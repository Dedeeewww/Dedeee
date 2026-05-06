

class Kasir extends User {
    String namaKasir;
    public Kasir(String nama, String namaKasir) {
        super(nama);
        this.namaKasir = namaKasir;
        
    }

    void tampilkanBarang() {
        System.out.println("Menampilkan daftar barang...");
        System.out.println("1. susu");
        System.out.println("2. roti");
        System.out.println("3. telur");
        System.out.println("4. sayur");
        System.out.println("5. buah");
        
    }

    void tampilkanTransaksi() {
        
        System.out.println("Menampilkan transaksi...");
        
        


    }
}