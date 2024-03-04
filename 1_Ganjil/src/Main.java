import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukan nilai n:");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Nilai n harus lebih dari 0");
        } else {
            for(int i = 1; i <= n; i++){
                System.out.print(i + " ");
            }
        }
    }
}