import java.util.Scanner;

public class Kuis25Zaky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int porsi;  
        int total = 0;
        int porsiTerbanyak 0;
        int porsiLebihDariDua 0 ;
        int jumlahTransaksi = 0;

        System.out.print("Masukkan NIM anda :");
        int nim2 = sc.nextInt();
        int k = (nim2 % 3) + 3; 

        System.out.print("Jumlah porsi (0 = selesai): ");
        porsi = sc.nextInt();

        while (porsi != 0) {
            if (porsi < 1 || porsi > 10){
                System.out.println("Porsi tidak valid, tolong masukkan ulang");
            }

            System.out.print("Jumlah porsi (0 = selesai): ");
            porsi = sc.nextInt();
            // Harga: porsi pertama Rp 15000, porsi berikutnya Rp 12000 per porsi
            int biaya = 15000 + (porsi - 1) * 12000;
            total += biaya;
            System.out.println("Biaya: Rp " + biaya);
            jumlahTransaksi++;

            if (porsi > porsiLebihDariDua){
            System.out.println("Porsi Lebih dari dua " + porsiLebihDariDua);
            }
            if (porsi > porsiTerbanyak){
                System.out.println("Porsi Terbanyak adalah " + porsiTerbanyak);
            }
            }


        System.out.println("=== RINGKASAN ===");
        System.out.println("Jumlah transaksi : " + jumlahTransaksi);
        System.out.println("Total pemasukan  : Rp " + total);
    }
}