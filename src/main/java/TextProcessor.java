import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TextProcessor {
    private ArrayList<String> input;

    public TextProcessor(ArrayList<String> input) {
        this.input = input;
    }

    public ArrayList<String> search(String text){
        ArrayList<String> textWithRange = new ArrayList<>();
        for (int index = 0; index < input.size(); index++) {
            int textIndex = input.get(index).indexOf(text);
            if(textIndex != -1){
                int startIndex = textIndex+1;
                int endIndex = text.length() + startIndex - 1;
                int line = index+1;
                textWithRange.add(line + ","+ startIndex + ":"+ line+ ","+ endIndex);

            }
        }

        return textWithRange;
    }
}
