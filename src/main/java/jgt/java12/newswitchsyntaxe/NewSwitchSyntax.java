package jgt.java12.newswitchsyntaxe;

import jgt.java12.newswitchsyntaxe.animal.Animal;
import jgt.java12.newswitchsyntaxe.animal.Cat;

import java.util.Scanner;

public class NewSwitchSyntax {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var day = Day.valueOf(scanner.next());
        switch (day) {
            case MONDAY, TUESDAY -> System.out.println("Back to work.");
            case WEDNESDAY -> System.out.println("Wait for the end of week...");
            case THURSDAY, FRIDAY -> System.out.println("Plan for the weekend?");
            case SATURDAY, SUNDAY -> System.out.println("Enjoy the holiday!");
        }

        var size = Size.valueOf(scanner.next());

        switch (size) {
            case S -> System.out.println("Slim!");
            case M -> System.out.println("Medium!");
            case L, XL -> System.out.println("Big!");
        }

        Animal animal = new Cat("kokino");

       /* pattern matching for java 13*/
        /*switch (animal){
            case Cat c -> c.miaou();
            case Cat(String name) -> System.out.println("hello" + name); // with Deconstruction 
            case Dog d -> d.wouf();
        }
         */
    }


}


