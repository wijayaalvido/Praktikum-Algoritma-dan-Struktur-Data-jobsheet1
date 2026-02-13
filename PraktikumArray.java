import java.util.Scanner;

public class PraktikumArray {

    public static double konversiNilaiSetara(double nilaiAngka) {
        if (nilaiAngka > 80 && nilaiAngka <= 100) return 4.0;
        else if (nilaiAngka > 73 && nilaiAngka <= 80) return 3.5;
        else if (nilaiAngka > 65 && nilaiAngka <= 73) return 3.0;
        else if (nilaiAngka > 60 && nilaiAngka <= 65) return 2.5;
        else if (nilaiAngka > 50 && nilaiAngka <= 60) return 2.0;
        else if (nilaiAngka > 39 && nilaiAngka <= 50) return 1.0;
        else return 0.0;
    }

    public static String konversiNilaiHuruf(double nilaiAngka) {
        if (nilaiAngka > 80 && nilaiAngka <= 100) return "A";
        else if (nilaiAngka > 73 && nilaiAngka <= 80) return "B+";
        else if (nilaiAngka > 65 && nilaiAngka <= 73) return "B";
        else if (nilaiAngka > 60 && nilaiAngka <= 65) return "C+";
        else if (nilaiAngka > 50 && nilaiAngka <= 60) return "C";
        else if (nilaiAngka > 39 && nilaiAngka <= 50) return "D";
        else return "E";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] namaMK = {
                "Agama",
                "Konsep Teknologi Informasi",
                "Critical Thinking dan Problem Solving",
                "Matematika Dasar",
                "Bahasa Inggris",
                "Dasar Pemrograman",
                "Praktikum Dasar Pemrograman",
                "Bahasa Indonesia",
                "Pengantar Akuntansi, Manajemen, dan Bisnis"
        };

        double[] nilaiAngka = new double[namaMK.length];
        double[] nilaiSetara = new double[namaMK.length];
        String[] nilaiHuruf = new String[namaMK.length];

        double totalNilaiSetara = 0;

        System.out.println("=======================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=======================================");

        for (int i = 0; i < namaMK.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + namaMK[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();

            nilaiHuruf[i] = konversiNilaiHuruf(nilaiAngka[i]);
            nilaiSetara[i] = konversiNilaiSetara(nilaiAngka[i]);

            totalNilaiSetara += nilaiSetara[i];
        }

        double ip = totalNilaiSetara / namaMK.length;

        System.out.println("\n=======================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=======================================");

        System.out.printf("%-45s %-12s %-12s %-10s\n",
                "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < namaMK.length; i++) {
            System.out.printf("%-45s %-12.2f %-12s %-10.2f\n",
                    namaMK[i],
                    nilaiAngka[i],
                    nilaiHuruf[i],
                    nilaiSetara[i]);
        }

        System.out.println("=======================================");
        System.out.printf("IP : %.2f\n", ip);
    }
}