// Christiana Michelle Savita_235150401111014

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta user untuk memasukkan nama mahasiswa
        System.out.print("Masukkan nama mahasiswa: ");
        String namaMahasiswa = scanner.nextLine();

        // Meminta user untuk memasukkan jumlah mata kuliah
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        String[] mataKuliah = new String[jumlahMataKuliah];
        int[] nilaiAngka = new int[jumlahMataKuliah];

        // Menginput data mata kuliah dan nilai dari user
        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
            mataKuliah[i] = scanner.nextLine();
            System.out.print("Masukkan nilai mata kuliah ke-" + (i + 1) + ": ");
            nilaiAngka[i] = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer
        }

        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa(namaMahasiswa);

        // Membuat objek KHS
        KHS khs = new KHS(mahasiswa, mataKuliah, nilaiAngka);

        // Mencetak KHS
        khs.cetakKHS();

        scanner.close();
    }
}