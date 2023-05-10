package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner
        Scanner sc = new Scanner(System.in);

        //Variables
        String key;
        String word;
        char changing;
        char setKey;



            //Asks user for key
            System.out.print("Insert key: ");
            key = sc.nextLine();

            setKey = key.charAt(0);

        while(true) {
            Encryption one = new Encryption(setKey);
            System.out.print("Insert text to be encrypted (or type 'STOP' to exit): ");
            word = sc.nextLine();
            if (!Objects.equals(word, "STOP")) {
                for (int i = 0; i < word.length(); i++) {
                    System.out.print(
                            one.EncryptThree(
                                    one.EncryptTwo(
                                            one.EncryptOne(
                                                    word.charAt(i)
                                            )
                                    )
                            )
                    );
                }
                System.out.println();
            }else
                break;
        }
    }
}