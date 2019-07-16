package rocks.zipcode.quiz4.collections;

import java.util.*;

public class WordCounter {
    HashMap<String, Integer> mp = new HashMap<>();
    public WordCounter(String... strings) {
        for (int i = 0; i < strings.length; i++) {
            int count = mp.containsKey(strings[i]) ? mp.get(strings[i]) : 0;
            mp.put(strings[i], count+1);
        }
    }

    public Map<String, Integer> getWordCountMap() {
        return mp;
    }
}
