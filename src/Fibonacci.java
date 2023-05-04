import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan dalam deret Fibonacci : ");
        int n = scanner.nextInt();

        BilanganFibonacci fibonacci = new BilanganFibonacci(n);
        fibonacci.tampilkanDeretFibonacci();
    }
}

class BilanganFibonacci {
    private int jumlahBilangan;

    public BilanganFibonacci(int jumlahBilangan) {
        this.jumlahBilangan = jumlahBilangan;
    }

    public int hitungBilanganFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return hitungBilanganFibonacci(n-1) + hitungBilanganFibonacci(n-2);
        }
    }

    public void tampilkanDeretFibonacci() {
        System.out.print("Deret bilangan Fibonacci : ");
        for (int i = 0; i < jumlahBilangan; i++) {
            System.out.print(hitungBilanganFibonacci(i) + " ");
        }
    }
}
