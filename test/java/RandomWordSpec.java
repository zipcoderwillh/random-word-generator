/**
 * Created by willhorton on 1/19/16.
 */


import org.junit.Test;
import static org.junit.Assert.*;

public class RandomWordSpec {

    @Test
    public void testGetFullWord() {

        // Test with random seed of 47 (line 18 in RandomWord.java)
        RandomWord rw = new RandomWord("r");
        assertEquals("rynzbr", rw.getFullWord());

    }

}

