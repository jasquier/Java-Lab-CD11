package squier.john.javalabcd11;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by johnsquier on 1/12/17.
 */
public class AliceBobCheckerTest {

    AliceBobChecker checker;

    @Before
    public void setup() { checker = new AliceBobChecker(); }

    @Test
    public void AliceBobCheckerAliceTest() {
        boolean actual = checker.isStringAliceOrBob("Alice");
        Assert.assertTrue("I expect actual to be true", actual);
    }

    @Test
    public void AliceBobCheckerBobTest() {
        boolean actual = checker.isStringAliceOrBob("Bob");
        Assert.assertTrue("I expect actual to be true", actual);
    }

    @Test
    public void AliceBobCheckerNoMatchTest() {
        boolean actual = checker.isStringAliceOrBob("Charlie");
        Assert.assertFalse("I expect actual to be false", actual);
    }
}
