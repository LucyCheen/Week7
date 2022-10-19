import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a: ");
        int a = scanner.nextInt();
        System.out.println("input n: ");
        int n = scanner.nextInt();


        int result = 0;
        for (int i = 0; i < n; i++){
            for (int j=0; j <= i; j++){
                result += (a * Math.pow(10,j));
            }
        }
        System.out.println("Result is " + result);
    }
}
