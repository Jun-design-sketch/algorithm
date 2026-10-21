package leet.leet1732;

// Find the highest altitude
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.largestAltitudeRefactor(new int[]{-5,1,5,0,-7})); // 1
        System.out.println(main.largestAltitudeRefactor(new int[]{-4,-3,-2,-1,4,3,2})); // 0
    }

    public int largestAltitude(int[] gain) {
        int point = 0;
        int highest = Integer.MIN_VALUE;

        for(int i = 0; i< gain.length; i++) {
            point += gain[i];
            highest = Integer.max(highest, point);
        }
        return Integer.max(highest, 0);
    }

    /*
    * 仕様上highest地点はどれだけ低くても0未満にならないため
     */
    public int largestAltitudeRefactor(int[] gain) {
        int point = 0;
        int highest = 0;

        for(int i = 0; i< gain.length; i++) {
            point += gain[i];
            highest = Integer.max(highest, point);
        }
        return highest;
    }
}
