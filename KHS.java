// Christiana Michelle Savita_235150401111014

public class KHS {
    private Mahasiswa mahasiswa;
    private String[] mataKuliah;
    private int[] nilaiAngka;

    // Konstruktor untuk inisialisasi objek KHS
    public KHS(Mahasiswa mahasiswa, String[] mataKuliah, int[] nilaiAngka) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilaiAngka = nilaiAngka;
    }

     // Method untuk mencetak KHS
    public void cetakKHS() {
        System.out.println("=======================================");
        System.out.println("Kartu Hasil Studi (KHS) " + mahasiswa.getNama());
        System.out.println("=======================================");
        System.out.println("Mata Kuliah\tNilai");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-15s%-10s%n", mataKuliah[i], konversiNilai(nilaiAngka[i]));
        }

        double ip = hitungIP();
        System.out.println("=======================================");
        System.out.println("IP: " + ip);
    }

    // Method untuk mengonversi nilai angka menjadi nilai huruf
    private String konversiNilai(int nilai) {
        if (nilai >= 80 && nilai <= 100) {
            return "A";
        } else if (nilai >= 60 && nilai < 80) {
            return "B";
        } else if (nilai >= 50 && nilai < 60) {
            return "C";
        } else if (nilai >= 40 && nilai < 50) {
            return "D";
        } else {
            return "E";
        }
    }

    // Method untuk menghitung IP berdasarkan nilai mata kuliah
    private double hitungIP() {
        double totalNilai = 0;
        for (int nilai : nilaiAngka) {
            totalNilai += nilai;
        }
        return totalNilai / nilaiAngka.length;
    }
}