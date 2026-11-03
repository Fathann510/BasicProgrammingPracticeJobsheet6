import java.util.Scanner;

public class CaseStudy212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String name = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String eventType = sc.nextLine();

        if (eventType.equalsIgnoreCase("BELMAWA") || eventType.equalsIgnoreCase("BAKORMA") || eventType.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Jumlah dokumen : ");
            int documentAmount = sc.nextInt();
            System.out.print("Peringkat juara : ");
            int peringkat = sc.nextInt();

            if (documentAmount < 4) {
                int kurang = 4 - documentAmount;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            } else {
                if (peringkat >= 1 && peringkat <= 3) {
                System.out.println("Status : Berhak menerima dana penghargaan (juara " + peringkat + ").");
                } else {
                System.out.println("Status : Tidak berhak menerima dana penghargaan " + "(hanya untuk juara 1, 2, atau 3).");
                }
            }
        } else if (eventType.equalsIgnoreCase("PKM")) {
            System.out.print("Jumlah dokumen : ");
            int documentAmount = sc.nextInt();
            System.out.print("Status pendanaan PKM (1 = disetujui, 0 = tidak) : ");
            int statusPkm = sc.nextInt();

            if (documentAmount < 4) {
                int kurang = 4 - documentAmount;
                System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            } else {
                if (statusPkm == 1) {
                    System.out.println("Status : Berhak menerima dana penghargaan " + "(proposal PKM disetujui didanai).");
                } else {
                    System.out.println("Status : Tidak berhak menerima dana penghargaan " + "(proposal PKM tidak disetujui didanai).");
                }
            }
        } else {
            System.out.println("Status : Tidak berhak menerima dana penghargaan " + "(jenis kegiatan tidak termasuk dalam ketentuan).");
        }
        sc.close();
    }
}