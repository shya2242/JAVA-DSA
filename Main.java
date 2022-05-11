package com.Shyam;

// Calculating the Area of circle

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter radius of Circle");
        Scanner sn = new Scanner(System.in);
        Double radius = sn.nextDouble();
        Double area = Math.PI * radius * radius;
        System.out.println("Area ="+area);

        }
}