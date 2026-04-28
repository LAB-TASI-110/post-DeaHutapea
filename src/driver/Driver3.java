package driver;

import java.util.Scanner;
import model.Menu;
import model.Pesanan;

public class Driver3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Daftar menu
        Menu m1 = new Menu("Nasi Goreng", 15000);
        Menu m2 = new Menu("Mie Goreng", 12000);
        Menu m3 = new Menu("Ayam Geprek", 18000);
        Menu m4 = new Menu("Es Teh", 5000);

        System.out.println("================================");
        System.out.println("   SISTEM KAFETARIA IT DEL");
        System.out.println("================================");

        // INPUT JENIS PELANGGAN
        System.out.println("\nPilih Jenis Pelanggan:");
        System.out.println("1. Mahasiswa");
        System.out.println("2. Dosen");
        System.out.println("3. Staff");
        System.out.print("Masukkan pilihan (1-3): ");

        int pilihPelanggan = input.nextInt();
        input.nextLine();

        String jenisPelanggan = "";

        switch (pilihPelanggan) {

            case 1:
                jenisPelanggan = "Mahasiswa";
                break;

            case 2:
                jenisPelanggan = "Dosen";
                break;

            case 3:
                jenisPelanggan = "Staff";
                break;

            default:
                jenisPelanggan = "Tidak diketahui";
        }

        // TAMPILKAN MENU
        System.out.println("\n========== MENU ==========");

        System.out.println("1. Nasi Goreng  - Rp15000");
        System.out.println("2. Mie Goreng   - Rp12000");
        System.out.println("3. Ayam Geprek  - Rp18000");
        System.out.println("4. Es Teh       - Rp5000");

        System.out.print("Pilih menu (1-4): ");
        int pilihMenu = input.nextInt();

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlah = input.nextInt();
        input.nextLine();

        Menu menuDipilih = null;

        switch (pilihMenu) {

            case 1:
                menuDipilih = m1;
                break;

            case 2:
                menuDipilih = m2;
                break;

            case 3:
                menuDipilih = m3;
                break;

            case 4:
                menuDipilih = m4;
                break;

            default:
                menuDipilih = m1;
        }

        // PILIH PEMBAYARAN
        System.out.println("\nPilih Metode Pembayaran:");
        System.out.println("1. Cash");
        System.out.println("2. QRIS");
        System.out.println("3. Transfer Bank");

        System.out.print("Masukkan pilihan pembayaran (1-3): ");

        int pilihBayar = input.nextInt();
        input.nextLine();

        String metodeBayar = "";

        switch (pilihBayar) {

            case 1:
                metodeBayar = "Cash";
                break;

            case 2:
                metodeBayar = "QRIS";
                break;

            case 3:
                metodeBayar = "Transfer Bank";
                break;

            default:
                metodeBayar = "Cash";
        }

        // BUAT PESANAN
        Pesanan pesanan =
                new Pesanan(
                        jenisPelanggan,
                        menuDipilih,
                        jumlah,
                        metodeBayar
                );

        // PROSES PESANAN
        System.out.println("\nPesanan dikirim ke penjual...");
        pesanan.konfirmasiPesanan();

        // STRUK
        pesanan.tampilkanStruk();

        input.close();
    }
}