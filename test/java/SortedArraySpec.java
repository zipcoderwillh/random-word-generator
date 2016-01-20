import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by willhorton on 1/19/16.
 */
public class SortedArraySpec {

    public void testSortWords() {

        String[] testArray = new String[]{"ljklb", "cresf", "tusre", "bisre", "plsfr"};
        SortedArray sa = new SortedArray(testArray);

        assertArrayEquals(new String[]{"bisre", "cresf", "ljklb", "plsfr", "tusre"}, sa.sortWords());

    }

}
