import java.util.Dictionary;

public class WordDriver {
    
    public static void testOne()
    {
        int score = 0;
        int maxScore = 0;
        Word w;
        String str;
        Word word;

        word = new Word("eat", "VERB", "to take in through the mouth as food :  ingest, chew, and swallow in turn");

        // test accessor methods
        str = word.getWord();
        if (str.equals("eat"))
        {
            score++;
        }
        maxScore++;

        str = word.getPartOfSpeech();
        if (str.equals("VERB"))
        {
            score++;
        }
        maxScore++;

        str = word.getDefinitions();
        if (str.contains("1. to take in through the mouth as food"))
        {
            score++;
        }
        maxScore++;

        // test addDefinition
        word.addDefinition("to destroy, consume, or waste by or as if by eating : gadgets that eat up too much space");
        word.addDefinition("to bear the expense of : the team was forced to eat the rest of his contract");
        word.addDefinition("to consume gradually : cars eaten away by rust");
        
        str = word.getDefinitions();
        if (str.contains("1. to take in through the mouth as food"))
        {
            score++;
        }
        maxScore++;

        str = word.getDefinitions();
        if (str.contains("2. to destroy, consume, or waste"))
        {
            score++;
        }
        maxScore++;

        str = word.getDefinitions();
        if (str.contains("3. to bear the expense of"))
        {
            score++;
        }
        maxScore++;

        str = word.getDefinitions();
        if (str.contains("4. to consume gradually"))
        {
            score++;
        }
        maxScore++;

        // test removeDefinition
        str = word.removeDefinition(2);
        if (str.contains("2. to destroy, consume, or waste"))
        {
            score++;
        }
        maxScore++;

        str = word.getDefinitions();
        if (str.contains("1. to take in through the mouth as food"))
        {
            score++;
        }
        maxScore++;

        str = word.getDefinitions();
        if (str.contains("2. to bear the expense of"))
        {
            score++;
        }
        maxScore++;

        str = word.getDefinitions();
        if (str.contains("3. to consume gradually"))
        {
            score++;
        }
        maxScore++;

        // test error condition with removeDefinition
        str = word.removeDefinition(8);
        if (str.contains("Error"))
        {
            score++;
        }
        maxScore++;        
         
        System.out.println(word); //word.toString()
        
        System.out.println("You scored " + score + " points out of " + maxScore + " on WordDriver.testOne()");
        
        
        
    }
}
