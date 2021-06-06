package exercises.ex04;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erik Dokken
 */
public class ex04 {
    static Scanner in = new Scanner(System.in);

    private String inputNoun(){
        System.out.print("Enter a noun: ");
        String noun = in.nextLine();
        return noun;
    }

    public static void main(String[] args){
        ex04 example04 = new ex04();

        String inputNoun = example04.inputNoun();
        String inputVerb = example04.inputVerb();
        String inputAdjective = example04.inputAdjective();
        String inputAdverb = example04.inputAdverb();
        String outputString = example04.generateOutputString(inputNoun, inputVerb, inputAdjective, inputAdverb);
        example04.printOutput(outputString);
    }

    private void printOutput(String generateOutputString) {
        System.out.println(generateOutputString);
    }

    private String generateOutputString(String noun, String verb, String adjective, String adverb) {
        return ("Do you "  + verb + " walk your "+ adjective+ " " +  noun + " " + adverb + "? That's hilarious!");
    }

    private String inputAdverb() {
        System.out.print("Enter a adverb: ");
        String adverb = in.nextLine();
        return adverb;
    }

    private String inputAdjective() {
        System.out.print("Enter a adjective: ");
        String adjective = in.nextLine();
        return adjective;
    }

    private String inputVerb() {
        System.out.print("Enter a verb: ");
        String verb = in.nextLine();
        return verb;
    }
}
