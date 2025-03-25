import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int i = 0;
    String string = "";
            while (a>0){
                int q =a%10;
                a = a/10;
                string += q;
            }
        System.out.println(Integer.parseInt(string));
        }

    }

