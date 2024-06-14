import java.util.ArrayList;

/**
 * This class represents one word in a dictionary.
 * 
 * @author Prof. White, adapted by Prof. Flatland
 * @version Spring 2024
 */    
public class Word
{    
    private String word;
    private String partOfSpeech;
    private ArrayList<String> definitions;
    
    /**
     * Construct a new word.
     * 
     * @param word The word.
     * @param pOfSp The part of speech for the word.  (E.g., noun, verb, etc.)
     * @param firstDefinition The first definition for the word.
     */
    public Word(String word, String pOfSp, String firstDefinition)
    {
        this.word = word;
        this.partOfSpeech = pOfSp;
        this.definitions = new ArrayList<String>();
        this.definitions.add(firstDefinition);
    }
    
    /**
     * Returns the word.
     * 
     * @return The word.
     */
    public String getWord()
    {
        return word;
    }
    
    /**
     * Returns the definitions of the words numbered starting from 1
     * and separated by new lines.  For example, if the word is "stand" 
     * the method might return the String:
     * 
     * "1. an upright position\n2. a base\n3. an attitude toward an issue"
     * 
     * @return The definitions of the words numbered starting from 1.
     */
    public String getDefinitions()
    {
        String defs = "";
        for(int i = 0; i < definitions.size(); i++){
             defs += (i+1) + ". " + definitions.get(i) + "\n";
        }
        return defs;
    }
    
    /**
     * Returns the word's part of speech.
     * 
     * @return The word's part of speech.
     */
    public String getPartOfSpeech()
    {
        return partOfSpeech;
    }

    /**
     * Adds a definition for the word.  (In this implementation,
     * the same definition can be added more than once!)
     * 
     * @param definition The definition to be added to the word.
     */
    public void addDefinition(String definition)
    {
        definitions.add(definition);
    }
    
    /**
     * Removes and returns the specified definition.  Definitions are numbered
     * from one.  If no such definition exists, returns an error message.
     * 
     * @param defNumber The number of the definition to be removed.
     * @return The definition that is removed or the error message
     *         "Error - no such definition." if none exists.
     */
    public String removeDefinition(int defNumber)
    {   
        if(defNumber > definitions.size() || defNumber < 0){
        return "Error - no such definition";
        }
    String def = definitions.get(defNumber-1);  
        definitions.remove(defNumber-1);
        return defNumber + ". " + def;
}
    
    /**
     * Returns a formatted string with the word, its part of speech,
     * and its definitions numbered starting from 1.
     * 
     * @returns A formatted string with the word, its part of speech,
     * and its definitions numbered starting from 1.
     */
    public String toString()
    {
        String answer = word + "" + "(" + partOfSpeech + ")" + "\n";
        answer += getDefinitions();
        return answer;
    }
}
