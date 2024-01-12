package com.coderscampus;

public class Main {
    public static void main(String [] args){
        System.out.println("you are in main");

            /* Valid email address:  fake.email@gmail.com
                Invalid email address:  trevorcraftycodr.com
                Invalid email address:  trevor@craftycodr.thisisntarealcomain
                Valid email address:  trevor@craftycodr.com
                Valid email address:  trevor-page.2@gmail.com
                */

        String input = "fake.email@gmail.com";
        boolean matchFound = input.matches("");
        System.out.println(matchFound);


    }
}
