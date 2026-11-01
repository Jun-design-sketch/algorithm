package leet.leet2215;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// ...Given two 0-indexed integer arrays...
// >>>>>0-indexed<<<<<
// [1]から始まる言語もある。

//
public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.hashMapWas();

        System.out.println(m.findDifference(new int[]{1,2,3},new int[]{2,4,6})); // {{1,3}{4,6}}
        System.out.println(m.findDifference(new int[]{1,2,3,3},new int[]{1,1,2,2})); // {{3}{}}
    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        return result;
    }

    private void hashMapWas() {
        // ~= python dictionary
        Map<String, Integer> scores = new HashMap<>();
        scores.put("田中", 999);
        scores.put("吉野", 9999);
        scores.put("野田", -9999);
        // 挿入した順番が保証されない
        System.out.println(scores);
        // キーから取り出す
        System.out.println(scores.get("田中"));
        // 安全に
        System.out.println(scores.getOrDefault("カンガルー", 0));
        scores.putIfAbsent("ロケット",1);
        // 確認
        System.out.println(scores.containsKey("うさぎ"));
        System.out.println(scores.containsKey("吉野"));
        System.out.println(scores.containsValue(9999));
        // 削除
        int removed = scores.remove("田中");
        System.out.println(scores);
        System.out.println("removed : " + removed);
    }
}
