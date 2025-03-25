import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int a = 0;
        int palidrome=0;
        while (number>0){
            int b = number%10;
            number=number/10;
            palidrome= palidrome *10+b;
        }
        System.out.println(palidrome);
    }
}
