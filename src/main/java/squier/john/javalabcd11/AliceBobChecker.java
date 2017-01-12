package squier.john.javalabcd11;

/**
 * Created by johnsquier on 1/12/17.
 */
public class AliceBobChecker {

    public boolean isStringAliceOrBob(String name) {

        if ( name.equalsIgnoreCase("alice")
                || name.equalsIgnoreCase("bob") ) {
            return true;
        }
        else {
            return false;
        }
    }

}
