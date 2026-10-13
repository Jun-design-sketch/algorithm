package leet.leet1493;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.longestSubarray(new int[]{1,1,0,1})); // 3
        System.out.println(m.longestSubarray(new int[]{0,1,1,1,0,1,1,0,1})); // 5
        System.out.println(m.longestSubarray(new int[]{1,1,1})); // 2
    }

    public int longestSubarray(int[] nums) {
        int chance = 1;
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            if(nums[right] == 0) chance--;
            while(chance < 0) {
                if(nums[left] == 0) chance++;
                left++;
            }
            maxLength = Math.max(maxLength, right - left);
        }

        return maxLength;
    }
}
