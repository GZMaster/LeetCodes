import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UniqueNumberOccurrences {
    public static void main (String[] arg) {
        int arr1[] = {4, 4, 4, 4};
        int arr2[] = {1, 1, 2, 2, 3};
        int arr3[] = {4, 4, 2, 2, 2, 3};
        int arr4[] = {1, 2, 2, 3};

        UniqueNumberOccurrences findUniqueOccurrence = new UniqueNumberOccurrences();

        boolean answer1 = findUniqueOccurrence.uniqueOccurrences(arr1);
        boolean answer2 = findUniqueOccurrence.uniqueOccurrences(arr2);
        boolean answer3 = findUniqueOccurrence.uniqueOccurrences(arr3);
        boolean answer4 = findUniqueOccurrence.uniqueOccurrences(arr4);

        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
        System.out.println(answer4);
    }

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> occurrence = new HashMap();
        Boolean uniqueMap = false;

        for (int i = 0; i < arr.length; i++) {
            increamentvalue(occurrence, arr[i]);
        }

        ArrayList values = new ArrayList(occurrence.values());
        for (int i = 0; i < values.size(); i++) {
            if (values.size() == 1) {
                return true;
            }
            for (int j = i+1; j<values.size(); j++) {
                if (!values.get(i).equals(values.get(j))) {
                    uniqueMap = true;
                } else {
                    return false;
                }
            }
        }

        return uniqueMap;
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
