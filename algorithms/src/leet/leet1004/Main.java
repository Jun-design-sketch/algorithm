package leet.leet1004;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2)); // 6
        System.out.println(m.longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3)); // 10
    }

    /*
    * 窓の大きさをいかにすべきか：kの値に連動
    * ループの条件、いつ、どう左を縮ませるか
     */
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int chance = k;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {
            // チャンスの消費：右の方を伸ばす
            if(nums[right] == 0) chance--;

            // チャンスの修復：左を縮める
            while (chance < 0) {
                if(nums[left] == 0) chance++;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
