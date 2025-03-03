import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input data pegawai dari user
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan jabatan: ");
        String jabatan = scanner.nextLine();
        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = scanner.nextDouble();
        System.out.print("Masukkan tunjangan: ");
        double tunjangan = scanner.nextDouble();
        System.out.print("Masukkan potongan: ");
        double potongan = scanner.nextDouble();
        System.out.print("Masukkan bonus: ");
        double bonus = scanner.nextDouble();

        Pegawai pegawai = new Pegawai(nama, jabatan, gajiPokok, tunjangan, potongan, bonus);
        System.out.println("\nInformasi Pegawai:");
        System.out.println(pegawai);

        System.out.print("Masukkan tambahan bonus: ");
        double tambahanBonus = scanner.nextDouble();
        pegawai.tambahBonus(tambahanBonus);
        
        System.out.println("\nSetelah bonus ditambahkan:");
        System.out.println(pegawai);

        scanner.close();
    }
}
