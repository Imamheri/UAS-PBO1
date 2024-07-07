
package uas;

public class Siswa {
    // Atribut
    private String nama;
    private int umur;
    private String kelas;

    // Konstruktor
    public Siswa(String nama, int umur, String kelas) {
        this.nama = nama;
        this.umur = umur;
        this.kelas = kelas;
    }

    // Getter dan Setter (Accessor dan Mutator)
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Umur: " + umur + ", Kelas: " + kelas;
    }
    
}
