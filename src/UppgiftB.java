/*
Skapat 2019-11-21
Av Simon Vestman
*/

import java.util.Scanner;

public class UppgiftB {
    public static void main(String[] args){

        double[] a = new double[5];
        Scanner sc = new Scanner(System.in);

            System.out.println("vilka tal?");
                for (int i = 0; i<5;i++)
                    a[i]= sc.nextDouble();

        System.out.println("Hur många tal skulle du vilja beräkna medelvärdet av?");
        int num = sc.nextInt();


    }
}
