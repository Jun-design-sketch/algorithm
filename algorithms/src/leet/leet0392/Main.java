package leet.leet0392;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();

        String s1 = "abc";
        String t1 = "ahbgdc";
        System.out.println(m.isSubsequence(s1, t1)); // true

        String s2 = "axc";
        String t2 = "ahbgdc";
        System.out.println(m.isSubsequence(s2, t2)); // false

        String s3 = "acb";
        String t3 = "ahbgdc";
        System.out.println(m.isSubsequence(s3, t3)); // false

        String s4 = "acb";
        String t4 = "acxacb";
        System.out.println(m.isSubsequence(s4, t4)); // true

        String s5 = "ab";
        String t5 = "baxxxxxb"; // true
        System.out.println(m.isSubsequence(s5, t5)); // true
    }

//   順番に検査さえすれば良いのでは？なかった
    public boolean isSubsequence0(String s, String t) {
        String[] sArr = s.split("");
        String[] tArr = t.split("");
        StringBuilder sb = new StringBuilder();

        for(String sEl : sArr) {
            for(String tEl : tArr) {
                if(sEl.equals(tEl)) {
                    sb.append(sEl);
                    break;
                }
            }
        }

        return sb.toString().equals(s);
    }

//  Two pointer
    public boolean isSubsequence(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        int sPoint = 0;
        int tPoint = 0;

        while(sPoint < s.length() && tPoint < t.length()) {
            if(sArr[sPoint] == tArr[tPoint]) {
                sPoint++;
                tPoint++;
            } else {
                tPoint++;
            }
        }

        return sPoint == sArr.length;
    }
}
