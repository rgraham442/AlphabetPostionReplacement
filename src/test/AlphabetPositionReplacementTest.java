package test;

import apr.AlphabetPositionReplacement;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlphabetPositionReplacementTest {

    @Test
    public void replacerShouldReturnNumber() {
        assertEquals("word should return as 1 ", AlphabetPositionReplacement.replacer("a"),"1 ");
        assertEquals("word should return as 2 1 4 ", AlphabetPositionReplacement.replacer("Bad"),"2 1 4 ");
        assertEquals("a should return an empty string", AlphabetPositionReplacement.replacer("1"),"");
    }

}
