package Word_Counter;
import java.util.Scanner;

public class class1 {

    public static void main(String[] args) {
	class2 ClassString = new class2();

	Scanner input = new Scanner(System.in);
	System.out.println("\nThis program counts the number of words in a given sentence...");
	System.out.print("\nPlease Enter a  Sentence: ");
	String sentence = input.nextLine();
	int numberofWords = ClassString.count_words(sentence);

	System.out.print("\nYour sentence has " + numberofWords + " words");
	input.close();
    }
}
//Class2 contains a constructor for the program...
    class class2{
    //Constructor
    public int count_words(String str) {
        String[] words = str.split(" ");
        return words.length;
    }
}


