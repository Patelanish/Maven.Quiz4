package rocks.zipcode.quiz4.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    ArrayList<String> words;

    public WordCounter(String... strings) {
        words = new ArrayList<>();
        words.addAll(Arrays.asList(strings));

    }

    public Map<String, Integer> getWordCountMap() {
        Map<String, Integer> result = new HashMap<>();
        for (String word:words){
            result.put(word, getCountoftotalWords(words, word));
        }
        return result;
    }

    private Integer getCountoftotalWords(ArrayList<String> words, String totalWords1) {
        Integer count = 0;
        for (String currentWords:words) {
            if (currentWords == totalWords1) {
                count++;
            }
        }
        return count;
    }
}
