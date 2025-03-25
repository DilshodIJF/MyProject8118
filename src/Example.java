import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Example problem9 = new Example();
        System.out.println(problem9.isPalindrome(-121));
    }

        public boolean isPalindrome(int x){
            int temp =x;
            int reserveNumber =0;
            while (x>0){
                int d =x%10;
                x=x/10;
                reserveNumber = reserveNumber*10+d;
            }
            return reserveNumber == temp;
        }

    }
