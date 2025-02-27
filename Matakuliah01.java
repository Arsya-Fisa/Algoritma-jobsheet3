import java.util.Scanner;

public class Matakuliah01 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah01 (String kode, String nama, int sks, int jumlahJam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    public void tambahdata(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Kode: ");
        this.kode = sc.nextLine();
        System.out.print("Nama: ");
        this.nama = sc.nextLine();
        System.out.print("SKS: ");
        this.sks = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah jam: ");
        this.jumlahJam = Integer.parseInt(sc.nextLine());
        System.out.println("-----------------------------");
    }
    public void cetakinfo(){
        System.out.println("Kode         : " + kode);
        System.out.println("Nama         : " + nama);
        System.out.println("SKS          : " + sks);
        System.out.println("Jumlah jam   : " + jumlahJam);
        System.out.println("-----------------------------------");
    }
}
