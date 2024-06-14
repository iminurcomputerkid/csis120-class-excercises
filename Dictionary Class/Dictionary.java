import java.util.ArrayList;

/**
 * This class represents a dictionary.
 * 
 * @author Prof. White, adapated by Prof. Flatland
 * @version Spring 2024
 */
public class Dictionary {
    // Declare an instance variable called words below that is an
    // ArrayList for storing Word objects.

    /**
     * Constructs a new dictionary with no entries.
     */

    private ArrayList<Word> words;

    public Dictionary() {
        words = new ArrayList<Word>();
    }

    /**
     * This one has been done for you! Just uncomment the method
     * body after you implement the constructor for the Dictionary
     * class.
     * 
     * Adds a word to the dictionary, maintaining alphabetical order.
     * 
     */
    public void addWord(Word newWord) {
        int i = 0;

        while (i < words.size() && words.get(i).getWord().compareTo(newWord.getWord()) < 0) {
            i++;
        }

        words.add(i, newWord);
    }

    /**
     * Returns the number of words in the Dictionary.
     * 
     * @return number of words in the dictionary.
     */
    public int getNumWords() {
        int amt = 0;
        for (int i = 0; i < words.size(); i++) {
            amt++;
        }
        return amt;
    }

    /**
     * Returns a list of words that are found in the dictionary.
     * It is only a list of words (Strings) - no part of speech or
     * definitions are included.
     * 
     * @return A list of words that are found in the dictionary.
     */
    public ArrayList<String> getWordList() {
        ArrayList<String> wordList = new ArrayList<String>();
        for (int i = 0; i < words.size(); i++) {
            wordList.add(words.get(i).getWord());
        }
        return wordList;
    }

    /**
     * Returns a string containing the numbered definitions for
     * the input word. If the word cannot be found in the
     * dictionary, returns an error message.
     * 
     * @param myWord The word whose definitions should be returned.
     * @return A string containing the numbered definitions for
     *         the input word or an error message if the word cannot be
     *         found in the dictionary.
     */
    public String getDefinitions(String myWord) {
        String defs = "";
        for (int i = 0; i < words.size(); i++) {
            if(myWord.equals(words.get(i).getWord())){
            defs += ((i + 1) + ". " + words.get(i).getDefinitions() + "\n");
            return defs;
            }
        }
        return "Error:  " + myWord + " was not found in the dictionary.";
    }

    

    /**
     * Returns the index of the input word in the dictionary or -1 if the
     * word does not exist in the dicationary.
     * 
     * @param myWord The word whose index should be returned.
     * @return The index of the word in the dictionary or -1 if the
     *         word does not exist in the dictionary.
     */
    public int getIndexOfWord(String myWord) {
        for (int i = 0; i < words.size(); i++) {
            if (myWord.equals(words.get(i).getWord())) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Removes and returns the input word entry from the dictionary as a formatted
     * string containing the word, part of speech, and all its definitions.
     * If the input word cannot be found in the dictionary, returns
     * an error message.
     * 
     * @param myWord The word to be removed from the dictionary.
     * @return A formatted string representing the word entry in the dictionary
     *         or an error message if the word cannot be found in the dictionary.
     */
    public String removeWord(String myWord) {
        for (int i = 0; i < words.size(); i++) {
            if (myWord.equals(words.get(i).getWord())) {
                words.remove(i);
                return myWord;
            }
        }
        String result = "Error:  " + myWord + " was not found in the dictionary.";
        return result;
        // Use getIndexOfWord(myWord) to find the location of myWord in ArrayList words
    }

    /**
     * Removed the specified numbered definition of the input word and
     * returns the removed definition. If word cannot be found in the
     * dicationary, an error message is returned.
     * 
     * Note: If you find the specified Word in the Dictionary, use the
     * Word removeDefinition( int defNumber ) method to remove
     * the indicated definition. If the definition doesn't exist,
     * the Word.removeDefinition( int defNumber ) method will
     * return an error message, which this method will return to
     * its caller.
     * 
     * @param myWord    The word whose definition should be removed.
     * @param defNumber The number of the definition to be removed.
     * @return The definition that was removed or an error message.
     */
    public String removeDefinition(String myWord, int defNumber) {
        Word word;
        for (int i = 0; i < words.size(); i++) {
            if (myWord.equals(words.get(i).getWord())) {
                word = words.get(i);
                String removed = word.removeDefinition(defNumber);
                return removed;
            }
        }
        String result = "Error:  " + myWord + " was not found in the dictionary.";
        return result;
        // Your code goes here
        // Use getIndexOfWord(myWord) to find the location of myWord in ArrayList words
    }

    /**
     * Returns a string representation of the entire dictionary.
     * 
     * @return A string representation of the entire dictionary.
     */
    public String toString() {
        String result = "";
        for (int i = 0; i < words.size(); i++) {
            result += words.get(i) + "\n";
        }
        return result;
    }

}
