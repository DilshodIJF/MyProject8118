import java.util.Scanner;

public class whileClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i =0;
      do{

          System.out.println(i);
          i++;

      }while (n>=i);
    }
}
