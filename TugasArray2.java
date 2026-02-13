import java.util.Scanner;
public class TugasArray2 {
     static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal);
        tampilSemua(jadwal);
        cariBerdasarkanHari(jadwal);
        cariBerdasarkanMK(jadwal);
    }

    public static void inputJadwal(String[][] jadwal) {
        for (int i = 0; i < jadwal.length; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();

            System.out.print("Ruang            : ");
            jadwal[i][1] = sc.nextLine();

            System.out.print("Hari             : ");
            jadwal[i][2] = sc.nextLine();

            System.out.print("Jam              : ");
            jadwal[i][3] = sc.nextLine();
        }
    }

    public static void tampilSemua(String[][] jadwal) {
        System.out.println("\n===============================");
        System.out.println("      SEMUA JADWAL KULIAH      ");
        System.out.println("===============================");

        System.out.printf("%-30s %-20s %-15s %-15s\n",
                "Nama MK", "Ruang", "Hari", "Jam");

        for (int i = 0; i < jadwal.length; i++) {
            System.out.printf("%-30s %-20s %-15s %-15s\n",
                    jadwal[i][0],
                    jadwal[i][1],
                    jadwal[i][2],
                    jadwal[i][3]);
        }
    }

    public static void cariBerdasarkanHari(String[][] jadwal) {
        System.out.print("\nMasukkan hari yang ingin dicari: ");
        String hari = sc.nextLine();

        System.out.println("\nJadwal pada hari " + hari + ":");

        boolean ditemukan = false;

        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.printf("%-30s %-20s %-15s\n",
                        jadwal[i][0],
                        jadwal[i][1],
                        jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal pada hari tersebut.");
        }
    }

    public static void cariBerdasarkanMK(String[][] jadwal) {
        System.out.print("\nMasukkan nama mata kuliah yang ingin dicari: ");
        String mk = sc.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mk)) {
                System.out.println("\nDetail Jadwal:");
                System.out.println("Nama MK : " + jadwal[i][0]);
                System.out.println("Ruang   : " + jadwal[i][1]);
                System.out.println("Hari    : " + jadwal[i][2]);
                System.out.println("Jam     : " + jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
}