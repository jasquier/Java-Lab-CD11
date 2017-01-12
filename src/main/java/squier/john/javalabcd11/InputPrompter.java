package squier.john.javalabcd11;

import java.util.Scanner;
/**
 * Created by johnsquier on 1/12/17.
 */
public class InputPrompter {

    private Scanner scanner = new Scanner(System.in);
    private String input = null;


    public String getInput(String message) {
        System.out.print(message);
        input = scanner.nextLine();
        return input;
    }

    public void displayResult(boolean result) {
        if ( result ) {
            System.out.printf("Hi!, %s\n", input);
        }
    }

}
