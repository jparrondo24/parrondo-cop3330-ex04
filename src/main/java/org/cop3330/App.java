/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Justin Parrondo
 */

package org.cop3330;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun = in.nextLine();
        System.out.print("Enter a verb: ");
        String verb = in.nextLine();
        System.out.print("Enter an adjective: ");
        String adjective = in.nextLine();
        System.out.print("Enter an adverb: ");
        String adverb = in.nextLine();

        String adlib = String.format("Do you %s your %s %s %s? That's hilarious!",
                                     verb, adjective, noun, adverb);

        System.out.println(adlib);
    }
}
