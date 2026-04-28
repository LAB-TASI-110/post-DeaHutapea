package model;

public class Pesanan {

    private String jenisPelanggan;
    private Menu menuDipilih;
    private int jumlah;
    private String metodePembayaran;

    // Constructor
    public Pesanan(
            String jenisPelanggan,
            Menu menuDipilih,
            int jumlah,
            String metodePembayaran) {

        this.jenisPelanggan = jenisPelanggan;
        this.menuDipilih = menuDipilih;
        this.jumlah = jumlah;
        this.metodePembayaran = metodePembayaran;
    }

    // Hitung total harga
    public int hitungTotal() {

        return menuDipilih.getHarga() * jumlah;
    }

    // Simulasi konfirmasi penjual
    public void konfirmasiPesanan() {

        System.out.println("Penjual: Pesanan sedang diproses...");
        System.out.println("Penjual: Pesanan sudah selesai!");
    }

    // Cetak struk
    public void tampilkanStruk() {

        System.out.println("\n===== STRUK KAFETARIA =====");

        System.out.println("Jenis Pelanggan : "
                + jenisPelanggan);

        System.out.println("Menu Dipilih    : "
                + menuDipilih.getNamaMenu());

        System.out.println("Jumlah          : "
                + jumlah);

        System.out.println("Total Harga     : Rp "
                + hitungTotal());

        System.out.println("Metode Bayar    : "
                + metodePembayaran);

        System.out.println("============================");
    }

}