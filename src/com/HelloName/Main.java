package com.HelloName;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String myName = scanner.nextLine();
        String myGreeting = "Hello " + myName;

        System.out.println(myGreeting);
    }
}
