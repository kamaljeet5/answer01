package com.problemsolve;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int l = 0;
	int b = 0;
	int area = 0;
	int para = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of lenght = ");
        l = scan.nextInt();
        System.out.println("Enter value of Breath = ");
        b = scan.nextInt();

        System.out.println("Area is = " + l * b);
        System.out.println("Parameter of Rectangle = " + (2 +(l*b)));
    }
}
