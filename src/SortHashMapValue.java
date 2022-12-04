import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class SortHashMapValue {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        LinkedHashMap<Integer, String> sortedMap = new LinkedHashMap<>();

        ArrayList<Integer> list = new ArrayList<>();

        char[] characters = new char[128];

        map.put("A", 5);
        map.put("B", 7);
        map.put("C", 3);
        map.put("D", 1);
        map.put("E", 2);
        map.put("F", 8);
        map.put("G", 4);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            list.add(entry.getValue());
        }

        Collections.sort(list);

        for (int num : list) {
            for (Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue().equals(num)) {
                    characters = entry.getKey().toCharArray();
                }
            }
        }

        String result = String.valueOf(characters).toCharArray().toString();


    }
}
