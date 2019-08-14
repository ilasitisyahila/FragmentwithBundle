package com.example.fragmentwithbundle;

import java.io.Serializable;

class Pegawai implements Serializable {
    private String nama;
    private String alamat;
    private String noHP;
    private String pekerjaan;
    private String lamaKerja;
    private String asalSekolah;
    private String kompetensi;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoHP() {
        return noHP;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(String lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    public String getAsalSekolah() {
        return asalSekolah;
    }

    public void setAsalSekolah(String asalSekolah) {
        this.asalSekolah = asalSekolah;
    }

    public String getKompetensi() {
        return kompetensi;
    }

    public void setKompetensi(String kompetensi) {
        this.kompetensi = kompetensi;
    }

    public Pegawai(String nama, String alamat, String noHP, String pekerjaan, String lamaKerja, String asalSekolah, String kompetensi) {
        this.nama = nama;
        this.alamat = alamat;
        this.noHP = noHP;
        this.pekerjaan = pekerjaan;
        this.lamaKerja = lamaKerja;
        this.asalSekolah = asalSekolah;
        this.kompetensi = kompetensi;
    }
}

