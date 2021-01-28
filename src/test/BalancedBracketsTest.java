package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    /**
     * That is, whether it consists entirely of pairs of opening/closing
     *      * brackets (in that order), none of which mis-nest. We consider a bracket
     *      * to be square-brackets: [ or ].
     *      *
     *      * The string may contain non-bracket characters as well.
     *      *
     *      * These strings have balanced brackets:
     *      *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *      *
     *      * While these do not:
     *      *   "[LaunchCode", "Launch]Code[", "[", "]["
     *      *
     */


    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsEncloseAString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void  testingBracketMidStream() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void testingBracketsBeforeString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void hasInvertedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void startsWithClosingBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][]"));
    }

    @Test
    public void testsMissingClosingBracketsAfterString() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void testsMissingClosingBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void testsMissingOpeningBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void testsInvertedBracketWithinText() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void testsNonBracketCharactersEntry() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

}
