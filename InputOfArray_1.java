package Array;

import java.util.Scanner;

public class InputOfArray_1 {

    public static int[] inputArr() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + i + "th Element");
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public static void print(int[] arr) {
        for (int dt : arr) {

            System.out.println(dt);
        }
    }

    public static void main(String[] args) {
        int[] arr = inputArr();
        print(arr);
    }
}
// package arraysintro;
// import java.util.Scanner;
// public class InputOfArray {
// public static void main(String args[]) {
// Scanner s=new Scanner(System.in);
// int n=s.nextInt();
// int[] arr=new int[n];
// for(int i=0;i<n;i++){
// System.out.println("Enter element at "+i+"th index");
// arr[i]=s.nextInt();
// }
// for(int i=0;i<n;i++){
// System.out.println(arr[i]);
// }
// }
// }
