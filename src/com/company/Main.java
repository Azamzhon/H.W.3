package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] names = new String[3];
        names[0] = "Aza";
        names[1] = "Nurik";
        names[2] = "Altynbek";
        names = Arrays.copyOf(names, names.length + 1);
        names[3] = "Aleksey";

        for (int i = 0; i < names.length; i++) {
            switch (i) {
                case 0:
                    System.out.println(names[i] + " Доброе утро");
                    break;
                case 1:
                    System.out.println(names[i] + " Доброе день");
                    break;
                case 2:
                    System.out.println(names[i] + " Доброе вечер");
                    break;
                case 3:
                    System.out.println(names[i] + " Добрый ночи");
                    break;
                default:
                    System.out.println(" Здраствуйте" + names[i]);
            }
        }

    }

}