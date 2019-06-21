package com.example.perpustakaan.recycle;

public class HomeItem {
    private String id_buku;
    private String judul_buku;
    private String penulis_buku;
    private String penerbit;
    private String tahun_terbit;
    private String cover_buku;
    private String jumlah_buku;

    public HomeItem(String id_buku, String judul_buku, String penulis_buku, String penerbit, String tahun_terbit, String cover_buku, String jumlah_buku) {
        this.id_buku = id_buku;
        this.judul_buku = judul_buku;
        this.penulis_buku = penulis_buku;
        this.penerbit = penerbit;
        this.tahun_terbit = tahun_terbit;
        this.cover_buku = cover_buku;
        this.jumlah_buku = jumlah_buku;
    }

    public String getId_buku() {
        return id_buku;
    }

    public String getJudul_buku() {
        return judul_buku;
    }

    public String getPenulis_buku() {
        return penulis_buku;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public String getTahun_terbit() {
        return tahun_terbit;
    }

    public String getCover_buku() {
        return cover_buku;
    }

    public String getJumlah_buku() {
        return jumlah_buku;
    }
}
