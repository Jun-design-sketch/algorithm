package leet.leet0011;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        int[] q1 = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(m.maxArea(q1)); // 49

        int[] q2 = new int[]{1,1};
        System.out.println(m.maxArea(q2)); // 1
    }

    // 곱의 값이 가장 커지는 조합..
    // (1,1) (2,8), (3,6), (4,2), (5,5), (6,4), (7,8), (8,3), (9,7)
    // 영역내에 존재할 수 있는 사각형은 많은데 그 중에 제일 큰 사각형이 뭔지?
    // 왼편에서 배열값을 하나씩 받으면서 오른편으로 진행하는것을 상상했지만 생각하다 막힘
    // 왼편끝과 오른편끝에 커서를 두고, 각 커서가 중앙으로 움직여가는 방식을 채용할 것
    // 사각형의 세로값은, 왼편/오른편 중 Math.min()
    // 사각형의 가로값은, (오른편 - 왼편)
    public int maxArea(int[] height) {
        int left = 0;
        int right = 0;

        while(left < right) {
            break;
        }

        return 0;
    }
}
