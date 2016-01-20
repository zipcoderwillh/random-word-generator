/**
 * Created by michaelgraham on 1/19/16.
 */


import java.util.Arrays;

public class SortedArray {

    public String[] unsortedArray;

    public SortedArray(String[] unsortedArray) {
        this.unsortedArray = unsortedArray;
    }

    public String[] sortWords() {

        String[] sortedArray = new String[unsortedArray.length];

        for(int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = unsortedArray[i];
        }

        Arrays.sort(sortedArray);

        return sortedArray;

    }

}
