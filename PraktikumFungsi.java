public class PraktikumFungsi {
     static int[][] stok = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
};

    static String[] namaCabang = {
            "RoyalGarden 1",
            "RoyalGarden 2",
            "RoyalGarden 3",
            "RoyalGarden 4"
    };

    static int[] harga = {75000, 50000, 60000, 10000};

    public static void main(String[] args) {

        System.out.println("===== DATA STOK ROYALGARDEN =====");
        System.out.printf("%-15s%-10s%-10s%-10s%-10s\n",
                "Cabang", "Aglonema", "Keladi", "Alocasia", "Mawar");

        for (int i = 0; i < stok.length; i++) {
            System.out.printf("%-15s", namaCabang[i]);
            for (int j = 0; j < stok[i].length; j++) {
                System.out.printf("%-10d", stok[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n===== PENDAPATAN & STATUS =====");

        for (int i = 0; i < stok.length; i++) {
            int pendapatan = hitungPendapatan(i);
            System.out.println(namaCabang[i]);
            System.out.println("Pendapatan : Rp " + pendapatan);
            System.out.println("Status     : " + cekStatus(pendapatan));
            System.out.println("-------------------------------");
        }
    }

    public static int hitungPendapatan(int cabang) {
        int total = 0;
        for (int i = 0; i < stok[cabang].length; i++) {
            total += stok[cabang][i] * harga[i];
        }
        return total;
    }

    public static String cekStatus(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }
}