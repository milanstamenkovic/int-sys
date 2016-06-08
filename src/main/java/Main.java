import edu.stanford.nlp.simple.*;

import java.util.List;

/**
 * Created by Milan on 6/8/2016.
 */
public class Main {
    public static void main(String[] args)
    {
        Sentence sent = new Sentence("Lucy is in the sky with diamonds.");
        List<String> nerTags = sent.nerTags();  // [PERSON, O, O, O, O, O, O, O]
        String firstPOSTag = sent.posTag(0);    // NNP

        System.out.print(nerTags);
    }
}
