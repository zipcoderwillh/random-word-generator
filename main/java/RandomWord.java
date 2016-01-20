import java.util.Random;

/**
 * Created by michaelgraham on 1/19/16.
 */
public class RandomWord {

    private String fullWord;

    public String getFullWord() {
        return fullWord;
    }

    public RandomWord(String firstLetter) {

        this.fullWord = firstLetter;

        Random rand = new Random(47);

        for(int i = 0; i < 5; i++) {
            int c = rand.nextInt(26) + 'a';
            this.fullWord += (char)c;
        }

    }

}
