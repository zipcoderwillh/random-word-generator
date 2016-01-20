import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by michaelgraham on 1/19/16.
 */

public class RandomWordGenerator {


    private String[] inputArray;
    private int numWords;
    String[] sortedWords;
    String[] unsortedWords;

    public RandomWordGenerator(String letters, int numWords) {
        this.inputArray = letters.split("");
        this.numWords = numWords;
        this.sortedWords = new String[numWords];
        this.unsortedWords= new String[numWords];
    }


    public String randomArrayGenerator() {

        int counter = 0;

        for(int i = 0; i < numWords; i++) {
            unsortedWords[i] = new RandomWord(inputArray[counter]).getFullWord();
            if(counter == inputArray.length - 1) {
                counter = 0;
            } else {
                counter++;
            }
        }

        SortedArray sa = new SortedArray(unsortedWords);

        sortedWords = sa.sortWords();

        return "Unsorted array: " + Arrays.toString(unsortedWords) + "\n" + "Sorted array: " + Arrays.toString(sortedWords);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter some letters:");
        String str = sc.nextLine();
        System.out.println("Please enter the number of random words you would like:");
        int num = sc.nextInt();

        RandomWordGenerator rwg = new RandomWordGenerator(str, num);
        System.out.println(rwg.randomArrayGenerator());

    }

}