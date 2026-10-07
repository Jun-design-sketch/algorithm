package leet.leet1456;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.maxVowels("abciiidef", 3)); // 3
        System.out.println(m.maxVowels("aeiou", 2)); // 2
        System.out.println(m.maxVowels("leetcode", 3)); // 2
    }

    public int maxVowels(String s, int k) {
        // 初回分の母音数をチェックする
        int count = 0;
        for(int i = 0; i < k; i++) {
            if(isVowel(s, i)) count++;
        }

        // 初回分以降の母音数をチェックする
        int max = count;
        if(max == k) return max;

        for(int i = k; i < s.length(); i++) {
            if(isVowel(s, i-k)) count--;
            if(isVowel(s, i)) count++;
            max = Math.max(max, count);
            if(max == k) return max;
        }

        return max;
    }

    public int maxVowelsOld(String s, int k) {
        // 初回分の母音数をチェックする
        int count = 0;
        for(int i = 0; i < k; i++) {
            if(isVowel(s, i)) count++;
        }

        // 初回分以降の母音数をチェックする
        int max = count;
        int newCount = count;
        for(int i = k; i < s.length(); i++) {
            if(isVowel(s, i-k)) newCount--;
            if(isVowel(s, i)) newCount++;
            max = Math.max(max, newCount);
        }

        return max;
    }

    private boolean isVowel(String s, int i) {
        return "aeiou".indexOf(s.charAt(i)) >= 0;
    }
}
