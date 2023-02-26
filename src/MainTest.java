import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;


public class MainTest {

    @Test
    public void testMirrorWord() throws Exception {
        /*QUAND on saisit une chaîne ALORS celle-ci est renvoyée en miroir*/
        //Arrange
        String testWord = "test";
        //Act
        String reverseWord = Main.reverse(testWord);
        //Assert
        Assert.assertEquals("tset", reverseWord);
    }
    
    // QUAND on saisit un palindrome ALORS celui-ci est renvoyé ET « Bien dit » est envoyé ensuite
    // QUAND on saisit une chaîne ALORS « Bonjour » est envoyé avant toute réponse
    // QUAND on saisit une chaîne ALORS « Au revoir » est envoyé en dernier

    
}
