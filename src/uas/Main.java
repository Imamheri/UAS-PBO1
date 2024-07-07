
package uas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<SiswaSD> siswaList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            tampilkanMenu();
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer
            switch (pilihan) {
                case 1:
                    tambahSiswa();
                    break;
                case 2:
                    tampilkanSiswa();
                    break;
                case 3:
                    perbaruiSiswa();
                    break;
                case 4:
                    hapusSiswa();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }

    private static void tampilkanMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Tambah Siswa");
        System.out.println("2. Tampilkan Daftar Siswa");
        System.out.println("3. Perbarui Informasi Siswa");
        System.out.println("4. Hapus Siswa");
        System.out.println("5. Keluar");
        System.out.print("Pilih: ");
    }

    private static void tambahSiswa() {
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Umur: ");
        int umur = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer
        System.out.print("Masukkan Kelas: ");
        String kelas = scanner.nextLine();
        System.out.print("Masukkan Nama Wali Kelas: ");
        String namaWaliKelas = scanner.nextLine();

        SiswaSD siswa = new SiswaSD(nama, umur, kelas, namaWaliKelas);
        siswaList.add(siswa);
        System.out.println("Siswa berhasil ditambahkan.");
    }

    private static void tampilkanSiswa() {
        if (siswaList.isEmpty()) {
            System.out.println("Tidak ada siswa.");
        } else {
            for (SiswaSD siswa : siswaList) {
                System.out.println(siswa);
            }
        }
    }

    private static void perbaruiSiswa() {
        System.out.print("Masukkan Nama Siswa yang akan diperbarui: ");
        String nama = scanner.nextLine();
        for (SiswaSD siswa : siswaList) {
            if (siswa.getNama().equalsIgnoreCase(nama)) {
                System.out.print("Masukkan Nama Baru: ");
                siswa.setNama(scanner.nextLine());
                System.out.print("Masukkan Umur Baru: ");
                siswa.setUmur(scanner.nextInt());
                scanner.nextLine(); // Membersihkan buffer
                System.out.print("Masukkan Kelas Baru: ");
                siswa.setKelas(scanner.nextLine());
                System.out.print("Masukkan Nama Wali Kelas Baru: ");
                siswa.setNamaWaliKelas(scanner.nextLine());
                System.out.println("Informasi siswa berhasil diperbarui.");
                return;
            }
        }
        System.out.println("Siswa tidak ditemukan.");
    }

    private static void hapusSiswa() {
        System.out.print("Masukkan Nama Siswa yang akan dihapus: ");
        String nama = scanner.nextLine();
        for (int i = 0; i < siswaList.size(); i++) {
            if (siswaList.get(i).getNama().equalsIgnoreCase(nama)) {
                siswaList.remove(i);
                System.out.println("Siswa berhasil dihapus.");
                return;
            }
        }
        System.out.println("Siswa tidak ditemukan.");
    }
}