package com.leo;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" What do you want to do?\n 1. Encrypt \n 2. Decrypt");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if(choice == 1)
        {
            System.out.println("Enter a text");
            String inputText = scanner.nextLine().toUpperCase();
            System.out.println("Enter a key ");
            int key = scanner.nextInt();
            Encoding encoding = new Encoding(inputText,key);
            System.out.println(String.format("Your encrypted text is:  %s",encoding.encode()));

        }
        else if(choice == 2)
        {
            System.out.println("Enter a key ");
            int key = scanner.nextInt();
            Decoding decoding = new Decoding(key);
            System.out.println(String.format("Your decrypted text is:  %s",decoding.decode()));
        }
        else
        {
            System.out.println("Input not known");
        }
    }
}
