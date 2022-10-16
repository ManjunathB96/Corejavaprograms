package com.Birdgelabz;

import java.util.Scanner;

public class VowelorCons {
    public static void main(String[] args) {
        System.out.println("Enter a Alphabet");
        Scanner sc = new Scanner(System.in);
        String  str= sc.next();
        char alpha = str.charAt(0);
        System.out.println("Enterd Alphabet is :"+alpha);
        char a= 'a';   char e= 'e';        char i= 'i';        char o= 'o';       char u= 'u';

        if (alpha == a || alpha == e|| alpha ==i || alpha == o || alpha == u ){
            System.out.println("The Given Alphabet:"+"    "+alpha+"  "+" is Vowel");
        }
        else
        {
            System.out.println("The Given Alphabet :"+"    "+alpha+"  "+" is consonant");
        }

    }

}
