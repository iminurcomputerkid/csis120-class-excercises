import java.util.ArrayList;

/**
 * This class represents a dictionary.
 * 
 * @author Prof. White, adapated by Prof. Flatland
 * @version Spring 2024
 */

 public class DictionaryDriver 
 {

    /**
     * Tests the following Dictionary methods: getNumWords and getWordList
     */
    public static void testOne()
    {
        System.out.println("Running testOne to test Dictionary methods getNumWords and getWordList...");
        int score = 0;
        int maxScore = 0;

        // create Dictionary object and add 4 words to it
        Dictionary dict = new Dictionary();
        
        Word word = new Word("yummy", "ADJECTIVE", "highly attractive or pleasing:  especially delicious, delectable");
        dict.addWord(word);
        
        word = new Word("banana", "NOUN", "an elongated usually tapering tropical fruit with soft pulpy flesh enclosed in a soft usually yellow rind");
        dict.addWord(word);
        
        word = new Word("apple", "NOUN", "the fleshy, usually rounded red, yellow, or green edible pome fruit of a usually cultivated tree (genus Malus) of the rose family");
        dict.addWord(word);

        word = new Word("eat", "VERB", "to take in through the mouth as food :  ingest, chew, and swallow in turn");
        dict.addWord(word);

        // test getNumWords
        int n = dict.getNumWords();
        if ( n == 4 )
        {
            score++;
        }
        maxScore++;

        // test getWordList
        ArrayList<String> wordList = dict.getWordList();

        if (wordList.size() == 4)
        {
            score++;
        }
        maxScore++;

        if (wordList.size() == 4) 
        {
            String str = wordList.get(0);
            if (str.equals("apple") )
            {
                score++;
            }
        }
        maxScore++;

        if (wordList.size() == 4) 
        {
            String str = wordList.get(1);
            if (str.equals("banana") )
            {
                score++;
            }
        }
        maxScore++;
        
        if (wordList.size() == 4) 
        {
            String str = wordList.get(2);
            if (str.equals("eat") )
            {
                score++;
            }
        }
        maxScore++;

        if (wordList.size() == 4) 
        {
            String str = wordList.get(3);
            if (str.equals("yummy") )
            {
                score++;
            }
        }
        maxScore++;  

        System.out.println("Words in the dictionary are:" );
        for(int i = 0; i < wordList.size(); i++ )
        {
            String w = wordList.get(i);
            System.out.println(w);
        }
        System.out.println();

        System.out.println("You scored " + score + " points out of " + maxScore + " on DictionaryDriver.testOne().");
    }
  
    /**
     * Tests the following Dictionary methods: getDefinitions and getIndex
     */
    public static void testTwo()
    {
        System.out.println("Running testTwo to test Dictionary methods getDefinitions and getIndex...");
  
        int score = 0;
        int maxScore = 0;

        // create Dictionary object and add 4 words to it
        Dictionary dict = new Dictionary();
        
        Word word = new Word("yummy", "ADJECTIVE", "highly attractive or pleasing:  especially delicious, delectable");
        dict.addWord(word);
        
        word = new Word("banana", "NOUN", "an elongated usually tapering tropical fruit with soft pulpy flesh enclosed in a soft usually yellow rind");
        dict.addWord(word);
        
        word = new Word("apple", "NOUN", "the fleshy, usually rounded red, yellow, or green edible pome fruit of a usually cultivated tree (genus Malus) of the rose family");
        word.addDefinition("a fruit (such as a star apple) or other vegetative growth (such as an oak apple) suggestive of an apple");
        dict.addWord(word);

        word = new Word("eat", "VERB", "to take in through the mouth as food :  ingest, chew, and swallow in turn");
        word.addDefinition("to destroy, consume, or waste by or as if by eating : gadgets that eat up too much space");
        word.addDefinition("to bear the expense of : the team was forced to eat the rest of his contract");
        dict.addWord(word);
        
        // test getDefinitions
        String str = dict.getDefinitions("apple");
        if (str.contains("1. the fleshy, usually") 
           && str.contains("2. a fruit (such as"))
        {
            score++;
        }
        maxScore++;

        str = dict.getDefinitions("eat");
        if (str.contains("1. to take in through") 
           && str.contains("2. to destroy, consume, or")
           && str.contains("3. to bear the expense of"))
        {
            score++;
        }
        maxScore++;

        int n = dict.getIndexOfWord("orange");
        if (n == -1)
        {
            score++;
        }
        maxScore++;

        n = dict.getIndexOfWord("apple");
        if (n == 0)
        {
            score++;
        }
        maxScore++;

        n = dict.getIndexOfWord("yummy");
        if (n == 3)
        {
            score++;
        }
        maxScore++;

        n = dict.getIndexOfWord("eat");
        if (n == 2)
        {
            score++;
        }
        maxScore++;


        System.out.println("You scored " + score + " points out of " + maxScore + " on DictionaryDriver.testTwo().");
    }

    /**
     * Tests the following Dictionary methods: removeWord and removeDefinition
     */
    public static void testThree()
    {
        System.out.println("Running testThree to test Dictionary methods removeWord and removeDefinition...");
         
        int score = 0;
        int maxScore = 0;

        // create Dictionary object and add 4 words to it
        Dictionary dict = new Dictionary();
        
        Word word = new Word("yummy", "ADJECTIVE", "highly attractive or pleasing:  especially delicious, delectable");
        dict.addWord(word);
        
        word = new Word("banana", "NOUN", "an elongated usually tapering tropical fruit with soft pulpy flesh enclosed in a soft usually yellow rind");
        dict.addWord(word);
        
        word = new Word("apple", "NOUN", "the fleshy, usually rounded red, yellow, or green edible pome fruit of a usually cultivated tree (genus Malus) of the rose family");
        word.addDefinition("a fruit (such as a star apple) or other vegetative growth (such as an oak apple) suggestive of an apple");
        dict.addWord(word);

        word = new Word("eat", "VERB", "to take in through the mouth as food :  ingest, chew, and swallow in turn");
        word.addDefinition("to destroy, consume, or waste by or as if by eating : gadgets that eat up too much space");
        word.addDefinition("to bear the expense of : the team was forced to eat the rest of his contract");
        dict.addWord(word);
        
        // test removeWord
        String str = dict.removeWord( "orange" );
        if (str.contains("Error"))
        {
            score++;
        }
        maxScore++;

        str = dict.removeWord( "yummy" );
        if (dict.getNumWords() == 3)
        {
            score++;
        }
        maxScore++;

        ArrayList<String> wordList = dict.getWordList();

        if (wordList.size() == 3)
        {
            str = wordList.get(2);
            if ( str.equals("eat") )
            {
                score++;
            }
        }
        maxScore++;    

        str = dict.removeWord( "banana" );
        if (dict.getNumWords() == 2)
        {
            score++;
        }
        maxScore++;

        wordList = dict.getWordList();
        if (dict.getNumWords() == 2)
        {
            str = wordList.get(1);
            if ( str.equals("eat") )
            {
                score++;
            }
        }
        maxScore++;    

        // test removeDefinition
        str = dict.removeDefinition("eat", 2);
        if (str.contains("to destroy, consume"))
        {
            score++;
        }
        maxScore++;

        // test removeDefinition
        str = dict.removeDefinition("orange", 2);
        if (str.contains("Error:  orange"))
        {
            score++;
        }
        maxScore++;

        System.out.println("You scored " + score + " points out of " + maxScore + " on DictionaryDriver.testThree().");
    }

    /**
     * Tests the following Dictionary methods: toString
     */
    public static void testFour()
    {
        System.out.println("Running testFour to test Dictionary method toString...");
       
        int score = 0;
        int maxScore = 0;

        // create Dictionary object and add 4 words to it
        Dictionary dict = new Dictionary();
        
        Word word = new Word("yummy", "ADJECTIVE", "highly attractive or pleasing:  especially delicious, delectable");
        dict.addWord(word);
        
        word = new Word("banana", "NOUN", "an elongated usually tapering tropical fruit with soft pulpy flesh enclosed in a soft usually yellow rind");
        dict.addWord(word);
        
        word = new Word("apple", "NOUN", "the fleshy, usually rounded red, yellow, or green edible pome fruit of a usually cultivated tree (genus Malus) of the rose family");
        word.addDefinition("a fruit (such as a star apple) or other vegetative growth (such as an oak apple) suggestive of an apple");
        dict.addWord(word);

        word = new Word("eat", "VERB", "to take in through the mouth as food :  ingest, chew, and swallow in turn");
        word.addDefinition("to destroy, consume, or waste by or as if by eating : gadgets that eat up too much space");
        word.addDefinition("to bear the expense of : the team was forced to eat the rest of his contract");
        dict.addWord(word);
        
        // test toString
        System.out.println("Below should be a complete listing of all word entries in the Dictionary:");
        System.out.println( dict );
    }

}
