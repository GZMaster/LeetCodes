import java.util.HashMap;
import java.util.Map;

public class SortCharFreq {

    public String frequencySort(String s) {
        String[] arr = s.split("");
        HashMap<String, Integer> occurrence = new HashMap();
        Boolean uniqueMap = false;

        for (int i = 0; i < arr.length; i++) {
            increamentvalue(occurrence, arr[i]);
        }

        return occurrence.values().toString();
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
