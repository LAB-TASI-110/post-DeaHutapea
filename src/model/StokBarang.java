package model;

public class StokBarang {

    private int[] stok;
    private int kategori;

    // Constructor
    public StokBarang(int[] stok, int kategori) {
        this.stok = stok;
        this.kategori = kategori;
    }

    // Method untuk menghitung total stok sesuai kategori
    public int hitungTotalKategori() {

        int total = 0;

        // index dimulai dari 1 (sesuai logika soal)
        for (int i = 0; i < stok.length; i++) {

            int posisi = i + 1;

            if (posisi % kategori == 0) {
                total += stok[i];
            }
        }

        return total;
    }

}