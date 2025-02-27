import java.util.Scanner;
public class MatakuliahDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan jumlah Mata kuliah: ");
        int jumlahMatkul = sc.nextInt();
        Matakuliah01 [] arrayofMatakuliah01 = new Matakuliah01[jumlahMatkul];
        
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Masukan Data kuliah ke-" + (i+1));
           arrayofMatakuliah01[i] = new Matakuliah01("", "", 0, 0);
           arrayofMatakuliah01[i].tambahdata();
        }
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            arrayofMatakuliah01[i].cetakinfo();
        }
    }
}
