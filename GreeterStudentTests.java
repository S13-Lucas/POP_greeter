
/**
 * GreeterStudentTest
 * - Greeting task
 * This file is for you, the student, to run to test your code,which you have written in the file Greeter.java.
 * Everything starts with the main method.
 * Once you have written your code remove the // at the start of the line that calls the method, and run
 * using the green arrow next to the line public static void main(String[] args).
 *
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */

public class GreeterStudentTests {

    public static void main(String[] args) {
        // Create an object to call the methods
        Greeter greeter = new Greeter();

        System.out.println(greeter.sayHelloWorld()); //example
        System.out.println(greeter.sayHello("Lucas")); //Task 1
        System.out.println(greeter.sayAnything("How are you")); //Task 2
        System.out.println(greeter.welcomeToUni("Ada Lovelace", "Bournemouth Uni", "First programming tasks")); //Task 3
        System.out.println(greeter.aboutMe("Ada Lovelace", "Piccadilly Terrace", "London", "Trained in Mathematics", "Countess of Lovelace")); //Task 4

    }
}

