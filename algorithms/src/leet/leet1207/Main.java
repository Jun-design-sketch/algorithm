package leet.leet1207;

import java.util.HashMap;
import java.util.Map;

// number of occurrences
// of each value
// in the array
// is true
public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.uniqueOccurrences(new int[]{1,2,2,1,1,3})); // true
        System.out.println(m.uniqueOccurrences(new int[]{1,2})); // false
        System.out.println(m.uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0})); // true
    }
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int element : arr) {
            m.put(element, m.getOrDefault(element, 0) + 1);
        }
        boolean isUnique = m.values().stream().distinct().count() == m.size();
        return isUnique;
    }
}
