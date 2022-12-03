import java.util.*;

public class TwoStringsClose {
    public static void main(String[] args) {
        String input1 = "cabbba";
        String input2 = "abbccc";

        boolean findCloseStrings = closeStrings(input1, input2);

        System.out.println(findCloseStrings);
    }

    public static boolean closeStrings(String word1, String word2) {
        String[] word1Arr = word1.split("");
        String[] word2Arr = word2.split("");

        boolean result;

        HashMap<String, Integer> setA = new HashMap<>();
        HashMap<String, Integer> setB = new HashMap<>();

        for (String s : word1Arr) {
            incrementalism(setA, s);
        }

        for (String s : word2Arr) {
            incrementalism(setB, s);
        }

        if (word1Arr.length == word2Arr.length) {
            result = setB.equals(setA);
        } else {
            return false;
        }
        return result;
    }

    public static<K> void incrementalism(Map<K, Integer> map, K key) {
        map.merge(key, 1, Integer::sum);
    }
}
