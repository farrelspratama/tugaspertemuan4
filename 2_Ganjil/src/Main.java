import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukan batas awal");
        int Min = scanner.nextInt();
        
        System.out.println("Masukan batas akhir");
        int Max = scanner.nextInt();
        
        int count = 0;
        for (int i = Min; i <= Max; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        
        System.out.println("\nJumlah bilangan ganjil dari " + Min + " hingga " + Max + " adalah: " + count);
    }
}