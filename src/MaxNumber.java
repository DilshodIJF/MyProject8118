import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i]=scanner.nextInt();
        }
        int min =a[0];
        for (int i = 0; i < n; i++) {
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println(min);
//        int b  = scanner.nextInt();
//        int c  = scanner.nextInt();
//    if(a>b && a>c){
//        System.out.println(a);
//    }else if (b>a && b>c){
//        System.out.println(b);
//        }else{
//        System.out.println(c);
//        }

    }
}
