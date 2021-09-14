/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 barhom alko
 */


package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int people, pizza, slices, total, div, rem;
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people? ");

        people = sc.nextInt();
        System.out.print("How many pizzas do you have? ");

        pizza = sc.nextInt();
        System.out.print("How many slices per pizza? ");

        slices = sc.nextInt();
        total = pizza * slices;
        System.out.println(""+people+ " people with " +pizza+ " pizzas ("+total+" slices) ");

        div = total / people;
        System.out.println("Each person gets " +div+ " pieces of pizza.");
        rem = total % people;
        System.out.println("There are " +rem+ " leftover pieces.");
    }
}


