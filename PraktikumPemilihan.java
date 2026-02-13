import java.util.Scanner;
public class PraktikumPemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tugas, kuis, uts, uas;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");

        System.out.print("Masukkan nilai tugas: ");
        tugas = sc.nextDouble();

        System.out.print("Masukkan nilai kuis: ");
        kuis = sc.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        uts = sc.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        uas = sc.nextDouble();
        System.out.println("======================");
        System.out.println("======================");

        if (tugas < 0 || tugas > 100 ||
            kuis < 0 || kuis > 100 ||
            uts < 0 || uts > 100 ||
            uas < 0 || uas > 100) {

            System.out.println("nilai tidak valid");
        System.out.println("======================");
        System.out.println("======================");
            return;
        }
        

        double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);
        String nilaiHuruf;
        String keterangan;

        if (nilaiAkhir >= 81) nilaiHuruf = "A";
        else if (nilaiAkhir >= 74) nilaiHuruf = "B+";
        else if (nilaiAkhir >= 66) nilaiHuruf = "B";
        else if (nilaiAkhir >= 61) nilaiHuruf = "C+";
        else if (nilaiAkhir >= 51) nilaiHuruf = "C";
        else if (nilaiAkhir >= 40) nilaiHuruf = "D";
        else nilaiHuruf = "E";

        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") ||
            nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") ||
            nilaiHuruf.equals("C")) {
            keterangan = "LULUS";
        } else {
            keterangan = "TIDAK LULUS";
        }

        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
        System.out.println("Keterangan  : " + keterangan);
    }
}