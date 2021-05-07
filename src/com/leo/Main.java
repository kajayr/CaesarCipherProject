package com.leo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//You will encrypt a message and save it to a file. You will read from the file and decrypt the message, printing it to the console.

//        File file2 = new File("resource");
//        file2.mkdir();
//        file2 = new File("resource/file.txt");
//        file2.createNewFile();
//        FileWriter fw = new FileWriter("resource/file.txt");
//        fw.write("This is a test");
//        fw.close();

        //encrypt or decrypt
        //if encrypt. User writes a sentence. the algo will transfer that sentence into a new one:
        // each letter will shifted by given number
        // for example: if the number is 2. a -> c
        //Starts from capital letters and moves to small lowercase letters which is a total of 52 letters.
        //user input: a sentence
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you wish to encrypt or decrypt a message? ");
        String input = scanner.nextLine();

        if(input.equals("encrypt")){
            System.out.println("Enter your message: ");
            String message = scanner.nextLine();
            System.out.println("Enter the key number (1-52)");
            int num = scanner.nextInt();
            System.out.println("Your translated text is: ");
            System.out.println(message);

        }else if(input.equals("decrypt")){
            System.out.println("Enter your message: ");
            String message = scanner.nextLine();
            System.out.println("Enter the key number (1-52)");
            int num = scanner.nextInt();
            System.out.println("Your translated text is: ");
            System.out.println(message);
        }

    }
}
