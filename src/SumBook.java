import java.util.Scanner;

public class SumBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuffer stringBuffer = new StringBuffer(" "+ n);
        System.out.println(stringBuffer.reverse());
        int a = 0;
        int number = 0;

        while (n>0){
            int q = n%10;
            n=n/10;
            number=number*10+q;
        }
        System.out.println(number);
    }
}

