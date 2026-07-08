package leet.leet0283;

// TWO POINTERS
public class Main {
    public static void main(String[] args) {
        Main m = new Main();

        // C1
        int[] nums1 = {0, 1, 0, 3, 12};
        m.moveZeroes(nums1); // {1,3,12,0,0}

        // C2
        int[] nums2 = {1, 0};
        m.moveZeroes(nums2); // {1, 0}

        // C3
        int[] nums3 = {4,2,4,0,0,3,0,5,1,0};
        m.moveZeroes(nums3); // {4,2,4,3,5,1,0,0,0,0}

        // C4
        int[] nums4 = {0};
        m.moveZeroes(nums4); // {0}

        // C5
        int[] nums5 = {
                -48764,-37585,13045,0,68754,-47747,14202,83944,
                -68075,-8137,12497,-8260,-97065,-7820,-41210,
                19833,52812,0,-54665,-84822
        };
        m.moveZeroes(nums5);
        // {-48764,-37585,13045,68754,-47747,
        // 14202,83944,-68075,-8137,12497,-8260,
        // -97065,-7820,-41210,19833,52812,-54665,-84822,0,0}
    }

    // exchange / swap せねばならないと考えていた
    public void moveZeroesX(int[] nums) {
        int left = 0;
        int right = 1;
        int size = nums.length;

        while(left < size && right < size) {
            int tmp;
            if(nums[left] == 0 && nums[right] != 0){
                tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
            }

            if(nums[left] != 0){
                left += 1;
                right += 1;
            }
            if(right < size && nums[right] == 0) right += 1;
        }

        // DEBUG
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.print("\n");
    }

    // filter
    public void moveZeroes(int[] nums) {
        int left = 0;

        for(int right = 0; right < nums.length; right++) {
            if(nums[right] != 0) {
                nums[left] = nums[right];
                left += 1;
            }
        }

        while(left < nums.length) {
            nums[left] = 0;
            left += 1;
        }

        // DEBUG
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.print("\n");
    }
}
