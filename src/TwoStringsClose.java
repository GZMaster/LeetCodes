import java.util.*;

public class TwoStringsClose {

    public boolean closeStrings(String word1, String word2) {
        String[] word1Arr = word1.split("");
        String[] word2Arr = word2.split("");

        boolean result = false;

        HashMap<String, Integer> setA = new HashMap();
        HashMap<String, Integer> setB = new HashMap();

        for (int i = 0; i < word1Arr.length; i++) {
            increamentvalue(setA, word1Arr[i]);
        }

        for (int i = 0; i < word2Arr.length; i++) {
            increamentvalue(setB, word2Arr[i]);
        }

        if (word1Arr.length == word2Arr.length) {
            result = setB.equals(setA);
        } else {
            return false;
        }
        return result;
    }

    public static<K> void increamentvalue(Map<K, Integer> map, K key) {
        Integer count = map.get(key);

        if (count == null) {
            map.put(key, 1);
        } else {
            map.put(key, count + 1);
        }
    }
}
