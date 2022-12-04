import java.util.*;

public class SortCharFreq {

    public static void main(String[] args) {
        String input = "tree";

        SortCharFreq arrangeString = new SortCharFreq();

        System.out.println(arrangeString.frequencySort(input));
    }

    public String frequencySort(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(String.valueOf(s.charAt(i)))) {
                map.put(String.valueOf(s.charAt(i)), map.get(String.valueOf(s.charAt(i))) + 1);
            } else {
                map.put(String.valueOf(s.charAt(i)), 1);
            }
        }

        Map<String, Integer> sortedMap = sortByValue(map);

        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                result += entry.getKey();
            }
        }

        return result;

    }

    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {

        List list = new LinkedList(map.entrySet());

        // Defined Custom Comparator here
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o2)).getValue())
                        .compareTo(((Map.Entry) (o1)).getValue());
            }});

        // Here I am copying the sorted list in HashMap
        // using LinkedHashMap to preserve the insertion order

        Map sortedHashMap = new LinkedHashMap();

        for (Iterator it = list.iterator(); it.hasNext();){
            Map.Entry entry = (Map.Entry) it.next();

            sortedHashMap.put(entry.getKey(), entry.getValue());

        }  return sortedHashMap;

    }//end of method sortByFrequencyOfValuesInArrayList()}
}
