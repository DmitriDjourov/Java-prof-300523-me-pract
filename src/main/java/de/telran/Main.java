package de.telran;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        String str = UUID.randomUUID().toString();
        System.out.println(str.replace("-",""));

    }
}