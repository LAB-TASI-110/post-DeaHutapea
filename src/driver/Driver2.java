package driver;

import java.util.Scanner;
import model.StokBarang;

public class Driver2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input jumlah data
        int N = input.nextInt();

        // Input deret stok
        int[] stok = new int[N];

        for (int i = 0; i < N; i++) {
            stok[i] = input.nextInt();
        }

        // Input kode kategori
        int kategori = input.nextInt();

        // Buat objek
        StokBarang data =
                new StokBarang(stok, kategori);

        // Hitung total
        int total =
                data.hitungTotalKategori();

        // Output
        System.out.println("Total stok kategori "
                + kategori + " = "
                + total);

        input.close();
    }
}