import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;


public class MainTest {

    @Test
    public void testMirrorWord() {
        /*QUAND on saisit une chaîne ALORS celle-ci est renvoyée en miroir*/
        //Arrange
        String testWord = "test";
        //Act
        String reverseWord = Main.reverse(testWord);
        //Assert
        Assert.assertEquals("tset", reverseWord);
    }

    @Test
    public void testPalindrome() {
        // QUAND on saisit un palindrome ALORS celui-ci est renvoyé ET « Bien dit » est envoyé ensuite
        //Arrange
        String testPalindrome = "radar";
        //Act
        String response = Main.palindromeCheck(testPalindrome);
        //Assert
        Assert.assertEquals("Bien dit !", response);
    }

    // QUAND on saisit une chaîne ALORS « Bonjour » est envoyé avant toute réponse
    // QUAND on saisit une chaîne ALORS « Au revoir » est envoyé en dernier

    
}
