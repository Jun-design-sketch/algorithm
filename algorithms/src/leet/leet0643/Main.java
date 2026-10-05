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

    public double findMaxAverage(int[] nums, int k) {
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
}
