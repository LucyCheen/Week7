import java.util.Scanner;

public class BloodPressure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input height :");
        int h = scanner.nextInt();
        System.out.println("Input num :");
        int n = scanner.nextInt();
        double result = h;
        for (int i= 2; i <= n; i++ ){
            result += 2*(h / Math.pow(2,(i-1)));
        }
        System.out.println("Distance is " + result);
    }
}
