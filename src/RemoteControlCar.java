import java.util.Scanner;

public class RemoteControlCar {
  // deklarasi variabel untuk kecepatan dan arah
  private int kecepatan = 0;
  private String arah = "diam";

  // method untuk mengubah kecepatan
  public void setKecepatan(int kecepatan) {
    this.kecepatan = kecepatan;
  }

  // method untuk mengubah arah
  public void setArah(String arah) {
    this.arah = arah;
  }

  // method untuk menggerakkan mobil
  public void gerak() {
    System.out.println("Mobil bergerak dengan kecepatan " + kecepatan + " km/jam dan arah " + arah);
  }

  // method untuk menghentikan mobil
  public void stop() {
    kecepatan = 0;
    arah = "diam";
    System.out.println("Mobil dihentikan");
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    RemoteControlCar mobil = new RemoteControlCar();

    int pilihan;
    do {
      System.out.println("===== Remote Control Car =====");
      System.out.println("1. Hidupkan Mesin");
      System.out.println("2. Atur Kecepatan");
      System.out.println("3. Atur Arah Mobil");
      System.out.println("4. Matikan Mesin");
      System.out.println("0. Keluar");
      System.out.print("Masukkan pilihan : ");
      pilihan = input.nextInt();

      switch (pilihan) {
        case 1:
          System.out.print("Hidupkan Mesin : ");
          mobil.gerak();
          break;
        case 2:
          System.out.print("Masukkan kecepatan (km/jam): ");
          int kecepatan = input.nextInt();
          mobil.setKecepatan(kecepatan);
          break;
        case 3:
          System.out.print("Masukkan arah (maju/mundur/kiri/kanan): ");
          String arah = input.next();
          mobil.setArah(arah);
          break;
        case 4:
          mobil.stop();
          break;
        case 0:
          System.out.println("Terima kasih telah menggunakan Remote Control Car");
          break;
        default:
          System.out.println("Pilihan tidak valid");
          break;
      }
    } while (pilihan != 0);
  }
}
