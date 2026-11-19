package leet.leet1657;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

// apply pattern1 : move position
// apply pattern2 : change occurrences between two letter
// {1,3,2} == {3,1,2}
public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.closeStrings("abc","bca")); // true
        System.out.println(m.closeStrings("a","aa")); // false
        System.out.println(m.closeStrings("cabbba","abbccc")); // true
        System.out.println(m.closeStrings("uau","ssx")); // false
    }

    public boolean closeStrings(String word1, String word2) {
        HashMap<String, Integer> m1 = strToHashMap(word1);
        HashMap<String, Integer> m2 = strToHashMap(word2);
        if(!m1.keySet().equals(m2.keySet())){
            return false;
        }

        List<Integer> v1 = new ArrayList<>(m1.values());
        List<Integer> v2 = new ArrayList<>(m2.values());
        Collections.sort(v1);
        Collections.sort(v2);

        return v1.equals(v2);
    }

    private static HashMap<String, Integer> strToHashMap(String word) {
        String[] chs1 = word.split("");
        HashMap<String, Integer> map = new HashMap<>();
        for(String ch : chs1) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        return map;
    }
}
