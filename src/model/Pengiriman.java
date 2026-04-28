package model;

public class Pengiriman {

    private String kota;
    private int berat;

    public Pengiriman(String kota, int berat) {

        this.kota = kota;
        this.berat = berat;
    }

    private int getTarif() {

        switch (kota) {

            case "MDN":
                return 8000;

            case "JKT":
                return 10000;

            case "BLG":
                return 7000;

            default:
                return 0;
        }
    }

    public int getOngkir() {

        return berat * getTarif();
    }

    public String getPromo() {

        if (berat >= 8) {
            return "Gratis 1 kg";
        }
        else if (berat >= 5) {
            return "Diskon 10%";
        }
        else {
            return "Tidak ada promo";
        }
    }

    public String getKota() {
        return kota;
    }

    public int getBerat() {
        return berat;
    }
}