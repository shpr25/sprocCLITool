import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TextProcessorTest {


    @Test
    public void searchShouldReturnSecondLineWith4And9AsRangeWhenGivenSearchTextIsneedle() {
        ArrayList<String> input = new ArrayList(Arrays.asList(
                "This is a haystack where you find",
                "No needles at all. It’s on you if you ")
        );

//        Arrays.asList("Find one - a needle, that is.".split(" ")))
        TextProcessor textProcessor = new TextProcessor(input);
        ArrayList<String> textRange = textProcessor.search("needle");


        assertEquals("2,4:2,9", textRange.get(0));
    }

    @Test
    public void searchShouldReturnSecondLineWith4And9AndThirdLineWith14And19AsRangeWhenGivenSearchTextIsneedle() {

        ArrayList<String> input = new ArrayList(Arrays.asList(
                "This is a haystack where you find",
                "No needles at all. It’s on you if you ",
                "Find one - a needle, that is."
                ));


        TextProcessor textProcessor = new TextProcessor(input);
        ArrayList<String> textRange = textProcessor.search("needle");


        assertEquals("2,4:2,9", textRange.get(0));
        assertEquals("3,14:3,19", textRange.get(1));
    }

}