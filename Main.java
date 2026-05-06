public class Main {
    public static void main(String[] args) {

        Kasir kasir = new Kasir("Indomaret", "dede");
        kasir.info();
        kasir.tampilkanBarang();
        

        Pembeli pembeli = new Pembeli("Indomaret", "Bintara");
        pembeli.tambahBarang();
        pembeli.bayar();
        pembeli.struk();
        kasir.tampilkanTransaksi();

        Keluar keluar = new Keluar("Indomaret");
        keluar.logout();
    }
}