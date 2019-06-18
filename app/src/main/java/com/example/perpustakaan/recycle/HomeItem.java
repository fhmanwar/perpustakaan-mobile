package com.example.perpustakaan.recycle;

public class HomeItem {
//    private String id;
//    private String judul_buku;
//    private String penulis_buku;
//    private String cover_buku;
    private String id_buku;
    private String id_user;
    private String id_jenis;
    private String id_bahasa;
    private String judul_buku;
    private String penulis_buku;
    private String subjek_buku;
    private String kode_buku;
    private String kolasi;
    private String penerbit;
    private String tahun_terbit;
    private String no_seri;
    private String status_buku;
    private String ringkasan;
    private String cover_buku;
    private String jumlah_buku;
    private String tanggal_entri;
    private String tanggal;
    private String nama_jenis;
    private String kode_jenis;
    private String nama_bahasa;
    private String kode_bahasa;
    private String nama;

    public HomeItem(String id_buku, String id_user, String id_jenis, String id_bahasa, String judul_buku, String penulis_buku, String subjek_buku, String kode_buku, String kolasi, String penerbit, String tahun_terbit, String no_seri, String status_buku, String ringkasan, String cover_buku, String jumlah_buku, String tanggal_entri, String tanggal, String nama_jenis, String kode_jenis, String nama_bahasa, String kode_bahasa, String nama) {
        this.id_buku = id_buku;
        this.id_user = id_user;
        this.id_jenis = id_jenis;
        this.id_bahasa = id_bahasa;
        this.judul_buku = judul_buku;
        this.penulis_buku = penulis_buku;
        this.subjek_buku = subjek_buku;
        this.kode_buku = kode_buku;
        this.kolasi = kolasi;
        this.penerbit = penerbit;
        this.tahun_terbit = tahun_terbit;
        this.no_seri = no_seri;
        this.status_buku = status_buku;
        this.ringkasan = ringkasan;
        this.cover_buku = cover_buku;
        this.jumlah_buku = jumlah_buku;
        this.tanggal_entri = tanggal_entri;
        this.tanggal = tanggal;
        this.nama_jenis = nama_jenis;
        this.kode_jenis = kode_jenis;
        this.nama_bahasa = nama_bahasa;
        this.kode_bahasa = kode_bahasa;
        this.nama = nama;
    }

    public String getId_buku() {
        return id_buku;
    }

    public String getId_user() {
        return id_user;
    }

    public String getId_jenis() {
        return id_jenis;
    }

    public String getId_bahasa() {
        return id_bahasa;
    }

    public String getJudul_buku() {
        return judul_buku;
    }

    public String getPenulis_buku() {
        return penulis_buku;
    }

    public String getSubjek_buku() {
        return subjek_buku;
    }

    public String getKode_buku() {
        return kode_buku;
    }

    public String getKolasi() {
        return kolasi;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public String getTahun_terbit() {
        return tahun_terbit;
    }

    public String getNo_seri() {
        return no_seri;
    }

    public String getStatus_buku() {
        return status_buku;
    }

    public String getRingkasan() {
        return ringkasan;
    }

    public String getCover_buku() {
        return cover_buku;
    }

    public String getJumlah_buku() {
        return jumlah_buku;
    }

    public String getTanggal_entri() {
        return tanggal_entri;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getNama_jenis() {
        return nama_jenis;
    }

    public String getKode_jenis() {
        return kode_jenis;
    }

    public String getNama_bahasa() {
        return nama_bahasa;
    }

    public String getKode_bahasa() {
        return kode_bahasa;
    }

    public String getNama() {
        return nama;
    }
}
