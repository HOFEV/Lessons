

package exceptions;

import java.util.Scanner;

public class TestDrive {
    public static void main(String[] args) {
        int x = getX();
        System.out.println(x);
    }

    private static int getX() {
        int x = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите число из диапазона 0-15: ");
            try {
                x = scanner.nextInt();
                if (x < 0 || x > 15) throw new ScannerException("Число вне диапазона"); // Вызываем ошибку
            } catch (ScannerException es) {
                es.printStackTrace();
                return x;
            } catch (Exception ex) {
                ex.printStackTrace();
                return 0;
            }
        }
    }
}
