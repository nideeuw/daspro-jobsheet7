import java.util.Scanner;

public class No2Parkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jenis, durasi, total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar): ");
            jenis = input.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (dalam jam): ");
                durasi = input.nextInt();

                if (durasi > 5) {
                    total += 12500;
                } else {
                    // Jika jenis mobil, tarif Rp 3000 per jam
                    if (jenis == 1) {
                        total += durasi * 3000;
                    }
                    // Jika jenis motor, tarif Rp 2000 per jam
                    else if (jenis == 2) {
                        total += durasi * 2000;
                    }
                }
            }
        } while (jenis != 0);

        System.out.println("Total pembayaran parkir: Rp " + total);
    }
}
