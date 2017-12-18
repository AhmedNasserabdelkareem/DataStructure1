package eg.edu.alexu.csd.datastructure.hangman.cs09;

import eg.edu.alexu.csd.datastructure.hangman.IHangman;
import java.util.Random;

/**
 * @author Ahmednasser
 *
 */
public class HangMan implements IHangman {
	/**
	 * @author Ahmednasser
	 *
	 */
	private String[] word;
	/**
	 * @author Ahmednasser
	 *
	 */
	private String secretone;
	/**
	 * @author Ahmednasser
	 *
	 */
	private String lower;
	/**
	 * @author Ahmednasser
	 *
	 */
	private char[] printingword;
	/**
	 * @author Ahmednasser
	 *
	 */
	private int MaxnoOfwrongguess;
	/**
	 * @author Ahmednasser
	 *
	 */
	private int counter = 0;
	/**
	 * @author Ahmednasser
	 *
	 */
	private int noOfguess = 0;
	/**
	 * @author Ahmednasser
	 *
	 */
	private int flag = 0;

	@Override
	public final void setDictionary(final String[] words) {
		this.word = words;
	}

	@Override
	public final String selectRandomSecretWord() {
		if (word == null) {
			return null;
		}
		Random no = new Random();
		int l = no.nextInt(word.length);
		secretone = word[l];
		printingword = secretone.toCharArray();
		for (int z = 0; z < secretone.length(); z++) {
			printingword[z] = '-';
		}
		this.lower = secretone.toLowerCase();
		return secretone;
	}

	@Override
	public final String guess(final Character c) {
		if (flag == 1) {
			return null;
		}
		char x = Character.toLowerCase(c);
		int maxi = 0;
		for (int i = 0; i < secretone.length(); i++) {

			if (x == lower.charAt(i)) {
				maxi++;
				if (printingword[i] == '-') {
					printingword[i] = secretone.charAt(i);

					noOfguess++;
				}

			}
		}
		if (maxi == 0) {
			counter++;
		}
		if (noOfguess == secretone.length()) {
			flag = 1;
			return secretone;

		}
		String display = String.valueOf(printingword);
		if (counter >= MaxnoOfwrongguess) {
			return null;
		} else {
			return display;
		}
	}

	@Override
	public final void setMaxWrongGuesses(final Integer max) {
		this.MaxnoOfwrongguess = max;
	}
}
