package model;

public class Menu {

    private String namaMenu;
    private int harga;

    // Constructor
    public Menu(String namaMenu, int harga) {
        this.namaMenu = namaMenu;
        this.harga = harga;
    }

    // Getter
    public String getNamaMenu() {
        return namaMenu;
    }

    public int getHarga() {
        return harga;
    }

}