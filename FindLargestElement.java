package Array;

public class FindLargestElement {
    private static int findLargestElement(int[] arr) {
        int dt = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > dt) {
                dt = arr[i];
            }

        }
        return dt;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 5, 3, 1, 6, 9, 20 };
        System.out.println(findLargestElement(arr));

    }

}
