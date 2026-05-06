class User extends Minimarket {

    public User(String nama) {
        super(nama);
    }

    int hitungTotal(int harga, int jumlah) {
        return harga * jumlah;
    }
}