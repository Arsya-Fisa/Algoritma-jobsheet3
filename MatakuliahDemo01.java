import java.util.Scanner;
public class MatakuliahDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah01 [] arrayofMatakuliah01 = new Matakuliah01[3];
        String kode,nama,dummy;
        int sks, jumlahJam;
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukan Data kuliah ke-" + (i+1));
            System.out.print("Kode: ");
            kode = sc.nextLine();
            System.out.print("Nama: ");
            nama = sc.nextLine();
            System.out.print("SKS: ");
            dummy  = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah jam: ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-----------------------------");

            arrayofMatakuliah01[i] = new Matakuliah01(kode, nama, sks, jumlahJam);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            System.out.println("Kode: " + arrayofMatakuliah01[i].kode);
            System.out.println("Nama: " + arrayofMatakuliah01[i].nama);
            System.out.println("SKS: " + arrayofMatakuliah01[i].sks);
            System.out.println("Jumlah jam: " + arrayofMatakuliah01[i].jumlahJam);
            System.out.println("---------------------------------------------");
        }
    }
}
