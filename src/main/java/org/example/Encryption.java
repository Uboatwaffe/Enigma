package org.example;

public class Encryption {

    private int i;
    private int k;
    private int l;
    private int m;
    private int j = 0;
    Encryption(Character set){
        switch (set) {
            case 'A' -> i = 1;
            case 'B' -> i = 2;
            case 'C' -> i = 3;
            case 'D' -> i = 4;
            case 'E' -> i = 5;
            case 'F' -> i = 6;
            case 'G' -> i = 7;
            case 'H' -> i = 8;
            case 'I' -> i = 9;
            case 'J' -> i = 10;
            case 'K' -> i = 11;
            case 'L' -> i = 12;
            case 'M' -> i = 13;
            case 'N' -> i = 14;
            case 'O' -> i = 15;
            case 'P' -> i = 16;
            case 'R' -> i = 17;
            case 'S' -> i = 18;
            case 'T' -> i = 19;
            case 'U' -> i = 20;
            case 'W' -> i = 21;
            case 'X' -> i = 22;
            case 'Y' -> i = 23;
            case 'Z' -> i = 24;
        }
        k = 0;
        l = 0;
    }
    Character EncryptOne(Character letter){
        char encryptedLetter = 0;

        switch (letter) {
            case 'A' -> j = 1;
            case 'B' -> j = 2;
            case 'C' -> j = 3;
            case 'D' -> j = 4;
            case 'E' -> j = 5;
            case 'F' -> j = 6;
            case 'G' -> j = 7;
            case 'H' -> j = 8;
            case 'I' -> j = 9;
            case 'J' -> j = 10;
            case 'K' -> j = 11;
            case 'L' -> j = 12;
            case 'M' -> j = 13;
            case 'N' -> j = 14;
            case 'O' -> j = 15;
            case 'P' -> j = 16;
            case 'R' -> j = 17;
            case 'S' -> j = 18;
            case 'T' -> j = 19;
            case 'U' -> j = 20;
            case 'W' -> j = 21;
            case 'X' -> j = 22;
            case 'Y' -> j = 23;
            case 'Z' -> j = 24;
        }

        j += i;

        while (j > 24) {
            j -= 24;
            k++;
        }

        switch (j) {
            case 1 -> encryptedLetter = 'A';
            case 2 -> encryptedLetter ='B';
            case 3 -> encryptedLetter = 'C';
            case 4 -> encryptedLetter = 'D';
            case 5 -> encryptedLetter = 'E';
            case 6 -> encryptedLetter = 'F';
            case 7 -> encryptedLetter = 'G';
            case 8 -> encryptedLetter = 'H';
            case 9 -> encryptedLetter = 'I';
            case 10 -> encryptedLetter = 'J';
            case 11 -> encryptedLetter = 'K';
            case 12 -> encryptedLetter = 'L';
            case 13 -> encryptedLetter = 'M';
            case 14 -> encryptedLetter = 'N';
            case 15 -> encryptedLetter = 'O';
            case 16 -> encryptedLetter = 'P';
            case 17 -> encryptedLetter = 'R';
            case 18 -> encryptedLetter = 'S';
            case 19 -> encryptedLetter = 'T';
            case 20 -> encryptedLetter = 'U';
            case 21 -> encryptedLetter = 'W';
            case 22 -> encryptedLetter = 'X';
            case 23 -> encryptedLetter = 'Y';
            case 24 -> encryptedLetter = 'Z';
        }
        i++;
        return encryptedLetter;
    }
    Character EncryptTwo(Character letter){
        char encryptedLetter = 0;

        switch (letter) {
            case 'A' -> j = 1;
            case 'B' -> j = 2;
            case 'C' -> j = 3;
            case 'D' -> j = 4;
            case 'E' -> j = 5;
            case 'F' -> j = 6;
            case 'G' -> j = 7;
            case 'H' -> j = 8;
            case 'I' -> j = 9;
            case 'J' -> j = 10;
            case 'K' -> j = 11;
            case 'L' -> j = 12;
            case 'M' -> j = 13;
            case 'N' -> j = 14;
            case 'O' -> j = 15;
            case 'P' -> j = 16;
            case 'R' -> j = 17;
            case 'S' -> j = 18;
            case 'T' -> j = 19;
            case 'U' -> j = 20;
            case 'W' -> j = 21;
            case 'X' -> j = 22;
            case 'Y' -> j = 23;
            case 'Z' -> j = 24;
        }

        j += k;

        while (j > 24) {
            j -= 24;
            l++;
        }

        switch (j) {
            case 1 -> encryptedLetter = 'A';
            case 2 -> encryptedLetter ='B';
            case 3 -> encryptedLetter = 'C';
            case 4 -> encryptedLetter = 'D';
            case 5 -> encryptedLetter = 'E';
            case 6 -> encryptedLetter = 'F';
            case 7 -> encryptedLetter = 'G';
            case 8 -> encryptedLetter = 'H';
            case 9 -> encryptedLetter = 'I';
            case 10 -> encryptedLetter = 'J';
            case 11 -> encryptedLetter = 'K';
            case 12 -> encryptedLetter = 'L';
            case 13 -> encryptedLetter = 'M';
            case 14 -> encryptedLetter = 'N';
            case 15 -> encryptedLetter = 'O';
            case 16 -> encryptedLetter = 'P';
            case 17 -> encryptedLetter = 'R';
            case 18 -> encryptedLetter = 'S';
            case 19 -> encryptedLetter = 'T';
            case 20 -> encryptedLetter = 'U';
            case 21 -> encryptedLetter = 'W';
            case 22 -> encryptedLetter = 'X';
            case 23 -> encryptedLetter = 'Y';
            case 24 -> encryptedLetter = 'Z';
        }
        return encryptedLetter;
    }
    Character EncryptThree(Character letter) {
        char encryptedLetter = 0;

        switch (letter) {
            case 'A' -> j = 1;
            case 'B' -> j = 2;
            case 'C' -> j = 3;
            case 'D' -> j = 4;
            case 'E' -> j = 5;
            case 'F' -> j = 6;
            case 'G' -> j = 7;
            case 'H' -> j = 8;
            case 'I' -> j = 9;
            case 'J' -> j = 10;
            case 'K' -> j = 11;
            case 'L' -> j = 12;
            case 'M' -> j = 13;
            case 'N' -> j = 14;
            case 'O' -> j = 15;
            case 'P' -> j = 16;
            case 'R' -> j = 17;
            case 'S' -> j = 18;
            case 'T' -> j = 19;
            case 'U' -> j = 20;
            case 'W' -> j = 21;
            case 'X' -> j = 22;
            case 'Y' -> j = 23;
            case 'Z' -> j = 24;
        }

        j += l;

        while (j > 24) {
            j -= 24;
            l = 0;
            k = 0;
            m = 0;
        }

        switch (j) {
            case 1 -> encryptedLetter = 'A';
            case 2 -> encryptedLetter = 'B';
            case 3 -> encryptedLetter = 'C';
            case 4 -> encryptedLetter = 'D';
            case 5 -> encryptedLetter = 'E';
            case 6 -> encryptedLetter = 'F';
            case 7 -> encryptedLetter = 'G';
            case 8 -> encryptedLetter = 'H';
            case 9 -> encryptedLetter = 'I';
            case 10 -> encryptedLetter = 'J';
            case 11 -> encryptedLetter = 'K';
            case 12 -> encryptedLetter = 'L';
            case 13 -> encryptedLetter = 'M';
            case 14 -> encryptedLetter = 'N';
            case 15 -> encryptedLetter = 'O';
            case 16 -> encryptedLetter = 'P';
            case 17 -> encryptedLetter = 'R';
            case 18 -> encryptedLetter = 'S';
            case 19 -> encryptedLetter = 'T';
            case 20 -> encryptedLetter = 'U';
            case 21 -> encryptedLetter = 'W';
            case 22 -> encryptedLetter = 'X';
            case 23 -> encryptedLetter = 'Y';
            case 24 -> encryptedLetter = 'Z';
        }
        return encryptedLetter;
    }
}
