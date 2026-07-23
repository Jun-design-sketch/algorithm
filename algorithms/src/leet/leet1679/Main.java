package leet.leet1679;

/*
** kを作れる二つの要素
** 重複使用不可
** 何個？
 */
public class Main {
    public static void main(String[] args) {
        Main m = new Main();

        int[] q1 = {1,2,3,4};
        int k1 = 5;
        System.out.println(m.maxOperations(q1, k1)); // 2

        int[] q2 = {3,1,3,4,3};
        int k2 = 6;
        System.out.println(m.maxOperations(q2, k2)); // 1

        int[] q3 = {4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4};
        int k3 = 2;
        System.out.println(m.maxOperations(q3, k3)); // 2

        int[] q4 = {2,2,2,3,1,1,4,1};
        int k4 = 4;
        System.out.println(m.maxOperations(q4, k4)); // 2
    }

    // O(n^2)
    // Oを節減するには？
    // ポインタを移動する == ポインタが居た箇所は不要確定
    // 確信ができなかったから^2になった
    public int maxOperations(int[] nums, int k) {
        int l = 0;
        int r = nums.length-1;
        int count = 0;

        while(l <= r){
            while(l < r) {
                boolean match = (nums[l] + nums[r] == k);
                boolean notUsed = (nums[l] != 0) && (nums[r] != 0);
                boolean res = match && notUsed;

                if (res) {
                    // SUCCESS
                    count++;
                    nums[l] = 0;
                    nums[r] = 0;
                    break;
                } else {
                    // FAIL
                    r--;
                }
            }
            // RESET
            l++;
            r = nums.length-1;
        }
        return count;
    }
}
