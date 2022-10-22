/**
 * Greeter
 * - Greeting task
 *
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */

public class Greeter {

    // Example - NO TEST
    public String sayHelloWorld() {
        return "Hello World!";
    }

    // Task 1
    public String sayHello(String name) {
        return ("Hello " + name);
    }

    // Task 2
    public String sayAnything(String sayAnything) {
        return (sayAnything + "!");
    }

    // Task 3
    public String welcomeToUni(String name, String uni, String task) {
        return (name + ",\n" + uni + ",\n" + task + ".");
    }

    // Task 4
    public String aboutMe(String name, String place, String town, String subject, String title) {
        return ("Name:\t" + name + "\nAdd:\t" + place + "\nTown:\t" + town  + "\nQuals:\t" + subject + "\nJob:\t" + title);
    }
}