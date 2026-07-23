package leet.leet0011;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        int[] q1 = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(m.maxArea(q1)); // 49

        int[] q2 = new int[]{1,1};
        System.out.println(m.maxArea(q2)); // 1
    }

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int size = 0;
        while(left < right) {
            int h = Integer.min(height[left], height[right]);
            int w = right - left;
            int thisTime = h * w;

            size = Integer.max(size, thisTime);

            if(h == height[left]) left++;
            else if(h == height[right]) right--;
        }

        return size;
    }
}