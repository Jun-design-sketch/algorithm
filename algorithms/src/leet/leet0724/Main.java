package leet.leet0724;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.pivotIndex(new int[]{1,7,3,6,5,6})); // 3
        System.out.println(m.pivotIndex(new int[]{1,2,3})); // -1
        System.out.println(m.pivotIndex(new int[]{2,1,-1})); // 0
        System.out.println(m.pivotIndex(new int[]{-1,-1,0,1,1,0})); // 5
    }

    // (左の累積合) (ポイント) (右の累積合)
    // [0] [1] [2...n]
    // 右の累積合計 = 全体の合計 - それまでの左の合計
    public int pivotIndex(int[] nums) {
        int[] fromLeft = new int[nums.length+1];
        int currLeft = nums[0];
        fromLeft[0] = 0;
        for(int i = 1; i < fromLeft.length; i++) {
            fromLeft[i] = currLeft;
            if(i < fromLeft.length - 1) currLeft += nums[i];
        }
        int allSum = fromLeft[nums.length];

        int answerPoint = -1;
        for(int i=0; i<nums.length; i++) {
            int leftSum = fromLeft[i];
            int rightSum = i==nums.length-1 ? 0 : allSum - fromLeft[i+1];
            if(leftSum == rightSum){
                answerPoint = i;
                break;
            }
        }
        return answerPoint;
    }
}
