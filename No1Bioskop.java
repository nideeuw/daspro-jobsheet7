import java.util.Scanner;

public class No1Bioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hargaTiket = 50000, total_tiket_terjual = 0, total_penjualan = 0, jumlahTiket, pelanggan, i = 1;
        double diskon, totalHarga;

        System.out.print("Masukkan banyak pelanggan dalam sehari: ");
        pelanggan = input.nextInt();
        while (i <= pelanggan) {
            System.out.println("Pelanggan ke- " + i);
            System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
            jumlahTiket = input.nextInt();
            if (jumlahTiket < 0 ) {
                    System.out.println("Angka tidak boleh negatif");
                    continue;
            }

            if (jumlahTiket > 0) {
                if (jumlahTiket > 10) {
                    diskon = 0.15; //diskon 15%
                    System.out.printf("Mendapat diskon sebesar 15%%: Rp %.2f%n", jumlahTiket * hargaTiket * diskon);
                }else if (jumlahTiket > 4) {
                    diskon = 0.10; //diskon 10%
                    System.out.printf("Mendapat diskon sebesar 10%%: Rp %.2f%n", jumlahTiket * hargaTiket * diskon);
                }else{
                    diskon = 0; //tidak dapat diskon
                }
                i++;
    
                totalHarga = jumlahTiket * hargaTiket * (1 - diskon);
    
                total_tiket_terjual += jumlahTiket;
                total_penjualan += totalHarga;
    
                System.out.printf("Total harga untuk %d tiket: Rp %.2f%n", jumlahTiket, totalHarga);
            }else{
                System.out.println("Input tidak valid. Mohon masukkan jumlah tiket yang benar.");
            }
        }
        System.out.printf("Total tiket terjual: %d%n", total_tiket_terjual);
        System.out.printf("Total penjualan tiket: Rp %.2f%n", total_penjualan);
    }
}
