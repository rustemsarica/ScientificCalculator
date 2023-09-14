import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bilimsel Hesap Makinesi");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");
        System.out.println("5. Üs Alma");
        System.out.println("6. Karekök Alma");
        System.out.println("7. Türev Alma");
        System.out.println("8. Integral Alma");
        System.out.println("9. Faktöriyel Hesaplama");
        System.out.println("10. Mod Alma");
        System.out.println("11. Mutlak Değer Hesaplama");
        System.out.print("İşlem seçin (1-11): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Toplanacak sayıları girin: ");
                double num1 = scanner.nextDouble();
                double num2 = scanner.nextDouble();
                System.out.println("Sonuç: " + add(num1, num2));
                break;
            case 2:
                System.out.print("Çıkarılacak sayıları girin: ");
                double num3 = scanner.nextDouble();
                double num4 = scanner.nextDouble();
                System.out.println("Sonuç: " + subtract(num3, num4));
                break;
            case 3:
                System.out.print("Çarpılacak sayıları girin: ");
                double num5 = scanner.nextDouble();
                double num6 = scanner.nextDouble();
                System.out.println("Sonuç: " + multiply(num5, num6));
                break;
            case 4:
                System.out.print("Bölünen ve böleni girin: ");
                double num7 = scanner.nextDouble();
                double num8 = scanner.nextDouble();
                System.out.println("Sonuç: " + divide(num7, num8));
                break;
            case 5:
                System.out.print("Taban ve üssü girin: ");
                double base = scanner.nextDouble();
                double exponent = scanner.nextDouble();
                System.out.println("Sonuç: " + power(base, exponent));
                break;
            case 6:
                System.out.print("Karekök alınacak sayıyı girin: ");
                double num9 = scanner.nextDouble();
                System.out.println("Sonuç: " + squareRoot(num9));
                break;
            case 7:
                // Türev alma işlemi
                break;
            case 8:
                // Integral alma işlemi
                break;
            case 9:
                System.out.print("Faktöriyel hesaplanacak sayıyı girin: ");
                int num10 = scanner.nextInt();
                System.out.println("Sonuç: " + factorial(num10));
                break;
            case 10:
                System.out.print("Mod alınacak sayıları girin: ");
                int num11 = scanner.nextInt();
                int num12 = scanner.nextInt();
                System.out.println("Sonuç: " + modulus(num11, num12));
                break;
            case 11:
                System.out.print("Mutlak değer alınacak sayıyı girin: ");
                double num13 = scanner.nextDouble();
                System.out.println("Sonuç: " + absoluteValue(num13));
                break;
            default:
                System.out.println("Geçersiz işlem seçimi.");
        }
        scanner.close();
    }

    // Toplama
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Çıkarma
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Çarpma
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Bölme
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Sıfıra bölme hatası.");
            return Double.NaN;
        }
        return num1 / num2;
    }

    // Üs Alma
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Karekök Alma
    public static double squareRoot(double num) {
        return Math.sqrt(num);
    }

    // Faktöriyel Hesaplama
    public static int factorial(int num) {
        if (num < 0) {
            System.out.println("Negatif sayıların faktöriyeli hesaplanamaz.");
            return -1;
        }
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // Mod Alma
    public static int modulus(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Sıfıra mod alma hatası.");
            return -1;
        }
        return num1 % num2;
    }

    // Mutlak Değer Hesaplama
    public static double absoluteValue(double num) {
        return Math.abs(num);
    }
}