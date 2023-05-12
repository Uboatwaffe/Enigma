package org.example;

public class Encryption {


    Character EncryptOne(Character letter){
        char encryptedLetter = 0;

        switch (letter) {
            case 'A' -> encryptedLetter = 'H';
            case 'B' -> encryptedLetter = 'Z';
            case 'C' -> encryptedLetter = 'S';
            case 'D' -> encryptedLetter = 'N';
            case 'E' -> encryptedLetter = 'X';
            case 'F' -> encryptedLetter = 'P';
            case 'G' -> encryptedLetter = 'K';
            case 'H' -> encryptedLetter = 'A';
            case 'I' -> encryptedLetter = 'U';
            case 'J' -> encryptedLetter = 'R';
            case 'K' -> encryptedLetter = 'G';
            case 'L' -> encryptedLetter = 'M';
            case 'M' -> encryptedLetter = 'L';
            case 'N' -> encryptedLetter = 'D';
            case 'O' -> encryptedLetter = 'T';
            case 'P' -> encryptedLetter = 'F';
            case 'R' -> encryptedLetter = 'J';
            case 'S' -> encryptedLetter = 'C';
            case 'T' -> encryptedLetter = 'O';
            case 'U' -> encryptedLetter = 'I';
            case 'W' -> encryptedLetter = 'Y';
            case 'X' -> encryptedLetter = 'E';
            case 'Y' -> encryptedLetter = 'W';
            case 'Z' -> encryptedLetter ='B';
        }
        return encryptedLetter;
    }

}
