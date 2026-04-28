package driver;

import java.util.Scanner;
import model.Pengiriman;

public class Driver1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            // BACA KOTA
            String kota = input.nextLine();

            // CEK END
            if (kota.equals("END")) {
                break;
            }

            // BACA BERAT
            int berat = input.nextInt();
            input.nextLine();

            // BUAT OBJEK
            Pengiriman kirim =
                    new Pengiriman(kota, berat);

            // OUTPUT
            System.out.println("===== STRUK =====");

            System.out.println("Kota Tujuan : "
                    + kirim.getKota());

            System.out.println("Berat Paket : "
                    + kirim.getBerat() + " kg");

            System.out.println("Total Ongkir : Rp "
                    + kirim.getOngkir());

            System.out.println("Promo : "
                    + kirim.getPromo());

            System.out.println("=================");
        }

        input.close();
    }
}