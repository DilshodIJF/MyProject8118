import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.io.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner scaner = new Scanner(System.in);
int a = scaner.nextInt();
int sum = 0;
        for (int i = 1; i < a; i++) {
            if (i != 1095){
                sum += i ;
            }
        }
        System.out.println(sum);
    }
}