
package uas;
public class SiswaSD extends Siswa {
    private String namaWaliKelas;

    public SiswaSD(String nama, int umur, String kelas, String namaWaliKelas) {
        super(nama, umur, kelas);  // Panggil konstruktor kelas induk
        this.namaWaliKelas = namaWaliKelas;
    }

    public String getNamaWaliKelas() {
        return namaWaliKelas;
    }

    public void setNamaWaliKelas(String namaWaliKelas) {
        this.namaWaliKelas = namaWaliKelas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Nama Wali Kelas: " + namaWaliKelas;
    }
}

       
    

