package demo;

import java.util.Random;

public class demo_2 {
    public void sort(int[] arr){
        int min;
        int tmp;
        
        for(int i=0; i<arr.length-1; i++){
            min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[min] >= arr[j]){
                    min = j;
                }
            }
            tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
            for(int a: arr) {
    			System.out.print(a+", ");
            }
            System.out.println("");
        }
    }
	public static void main(String[] args) {
		int[] arr = new int[10];
		Random r = new Random();
		for(int i=0; i<10; i++) {
			arr[i] = r.nextInt(100)+1;
		}
        for(int a: arr) {
			System.out.print(a+", ");
        }
        System.out.println("");
		demo_2 demo = new demo_2();
		demo.sort(arr);
		System.out.println("");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
	}
}
