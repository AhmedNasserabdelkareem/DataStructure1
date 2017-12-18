package eg.edu.alexu.csd.datastructure.hangman.cs09;

import org.junit.Assert;
import org.junit.Test;

import eg.edu.alexu.csd.datastructure.hangman.IHangman;

/**
 * @author Ahmednasser
 *
 */
public class Tester {
	/**
	 * @author Ahmednasser
	 *
	 */
	private final int var5 = 5;
	/**
	 * @author Ahmednasser
	 *
	 */
	HangMan TestRunner = new HangMan();
	/**
	 * @author Ahmednasser
	 *
	 */
@Test
	public void testRandomWord() {
		IHangman hangman = (IHangman) TestRunner;
		String secret = hangman.selectRandomSecretWord();
		Assert.assertNull("Random word returned", secret);
		String[] dictionary = new String[] {"XXX", "YYYY" };
		hangman.setDictionary(dictionary);
		secret = hangman.selectRandomSecretWord();
		Assert.assertNotNull("Null random word", secret);
		boolean found = false;
		for (int i = 0; i < dictionary.length; i++) {
			if (dictionary[i].equals(secret)) {
				found = true;
			}
		}
		Assert.assertTrue("Message not found", found);
	}
/**
 * @author Ahmednasser
 *
 */
@Test
	public void testWrongGuess() {
		IHangman hangman = (IHangman) TestRunner;
		String[] dictionary = new String[] {"EGYPT" };
		hangman.setDictionary(dictionary);
		hangman.selectRandomSecretWord();
		hangman.setMaxWrongGuesses(2);
		Assert.assertEquals("-----", hangman.guess('X'));
	}
/**
 * @author Ahmednasser
 *
 */
@Test
	public void testCorrectGuess() {
		IHangman hangman = (IHangman) TestRunner;
		String[] dictionary = new String[] {"EGYPT" };
		hangman.setDictionary(dictionary);
		hangman.selectRandomSecretWord();
		hangman.setMaxWrongGuesses(2);
		Assert.assertEquals("--Y--", hangman.guess('Y'));
	}
/**
 * @author Ahmednasser
 *
 */
@Test
	public void testCorrectGuessFirstChar() {
		IHangman hangman = (IHangman) TestRunner;
		String[] dictionary = new String[] {"EGYPT" };
		hangman.setDictionary(dictionary);
		hangman.selectRandomSecretWord();
		hangman.setMaxWrongGuesses(2);
		Assert.assertEquals("E----", hangman.guess('E'));
	}
/**
 * @author Ahmednasser
 *
 */
@Test
	public void testCorrectGuessLastChar() {
		IHangman hangman = (IHangman) TestRunner;
		String[] dictionary = new String[] {"EGYPT" };
		hangman.setDictionary(dictionary);
		hangman.selectRandomSecretWord();
		hangman.setMaxWrongGuesses(2);
		Assert.assertEquals("----T", hangman.guess('T'));
	}
/**
 * @author Ahmednasser
 *
 */

@Test
	public void testCaseSensitiveLower() {
		IHangman hangman = (IHangman) TestRunner;
		String[] dictionary = new String[] {"EGYPT" };
		hangman.setDictionary(dictionary);
		hangman.selectRandomSecretWord();
		hangman.setMaxWrongGuesses(2);
		Assert.assertTrue("E----".equalsIgnoreCase(hangman.guess('e')));
	}
/**
 * @author Ahmednasser
 *
 */
@Test
	public void testCaseSensitiveUpper() {
		IHangman hangman = (IHangman) TestRunner;
		String[] dictionary = new String[] {"egypt" };
		hangman.setDictionary(dictionary);
		hangman.selectRandomSecretWord();
		hangman.setMaxWrongGuesses(2);
		Assert.assertTrue("E----".equalsIgnoreCase(hangman.guess('E')));
	}
/**
 * @author Ahmednasser
 *
 */
@Test
	public void testFailCount() {
		IHangman hangman = (IHangman) TestRunner;
		String[] dictionary = new String[] {"EGYPT" };
		hangman.setDictionary(dictionary);
		hangman.selectRandomSecretWord();
		int max = var5;
		hangman.setMaxWrongGuesses(max);
		for (int i = 0; i < max; i++) {
			String result = hangman.guess('X');
			if (i < max - 1) {
Assert.assertEquals("Invalid Showing of Characters", "-----", result);
			 } else {
				Assert.assertNull("Game must end!", result);
			}
		}
	}

}
