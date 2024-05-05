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


import java.util.Scanner;
public class LargestOfNumbers {
    public static void printArray(int[]arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static int[] takeInput(){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter element at "+i+"th index");
            arr[i]=s.nextInt();
        }
        return arr;
        
    }
    public static int largest(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    
    
public static void main(String args[]) {
     int[] arr=takeInput();
     int lar=largest(arr);
     System.out.println(lar);
    }
}

