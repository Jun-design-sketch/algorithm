package leet.leet0643;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();

        int[] nums1 = {1,12,-5,-6,50,3};
        int k1 = 4;
        System.out.printf("%.5f\n", m.findMaxAverage(nums1, k1)); // 12.75000

        int[] nums2 = {5};
        int k2 = 1;
        System.out.printf("%.5f\n", m.findMaxAverage(nums2, k2)); // 5.00000
    }

    public double findMaxAverageOld(int[] nums, int k) {
        double maxValue = (double) Integer.MIN_VALUE;
        int windowsLength = k;
        int fullLength = nums.length;
        int slideTry = fullLength-windowsLength > 0 ? fullLength-windowsLength+1 : 1;

        for (int i=0; i<slideTry; i++) {
            int eachSum = 0;
            for(int j=0; j<windowsLength; j++) {
                eachSum += nums[i+j];
            }
            double eachAverage = (double) eachSum / windowsLength;
            maxValue = eachAverage > maxValue ? eachAverage : maxValue;
        }

        return maxValue;
    }

    /*
    * slide windowするときは、左の元素を失う・右の元素を得る
    * そのため、slideする度に失う分と得られる分を反映するだけで良い
     */
    public double findMaxAverage(int[] nums, int k) {
        // 初回の和を求める
        int sum = 0;
        for (int i = 0; i < k; i++){
            sum += nums[i];
        }

        // 初回以降の和を求める
        int newSum = sum;
        for (int i = k; i < nums.length; i++) {
            newSum += nums[i] - nums[i-k];
            sum = Math.max(sum, newSum);
        }

        return (double) sum / k;
    }
}
