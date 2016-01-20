import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by willhorton on 1/19/16.
 */
public class RandomWordGeneratorSpec {

    @Test
    public void testRandomArrayGenerator() {

        // Test with random seed 47
        RandomWordGenerator rw = new RandomWordGenerator("lexf", 5);
        assertEquals("Unsorted array: [lynzbr, eynzbr, xynzbr, fynzbr, lynzbr]" + "\n" +
                "Sorted array: [eynzbr, fynzbr, lynzbr, lynzbr, xynzbr]", rw.randomArrayGenerator());
    }

}
