package squier.john.javalabcd11;

/**
 * Created by johnsquier on 1/12/17.
 */
public class Main {

    public static void main(String[] args) {
        InputPrompter prompter = new InputPrompter();
        AliceBobChecker checker = new AliceBobChecker();

        String input = prompter.getInput("Enter a name to check if it's Alice or Bob: ");

        boolean isAliceOrBob = checker.isStringAliceOrBob(input);

        prompter.displayResult(isAliceOrBob);
    }
}
