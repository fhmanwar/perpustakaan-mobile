package com.example.perpustakaan.recycle;

public class HomeItem {
    private String id;
    private String judul_buku;
    private String penulis_buku;
    private String cover_buku;

    public HomeItem(String id, String judul_buku, String penulis_buku, String cover_buku) {
        this.id = id;
        this.judul_buku = judul_buku;
        this.penulis_buku = penulis_buku;
        this.cover_buku = cover_buku;
    }

    public String getId() {
        return id;
    }

    public String getJudul_buku() {
        return judul_buku;
    }

    public String getPenulis_buku() {
        return penulis_buku;
    }

    public String getCover_buku() {
        return cover_buku;
    }
}
