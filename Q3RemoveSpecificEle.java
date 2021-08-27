package hW;

import java.util.Arrays;

public class Q3RemoveSpecificEle {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5};
		int ele=5;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==ele) {
				for (int j = i; j < a.length-1; j++) {
					a[j]=a[j+1];
					
				}
				a[a.length-1]=0;
				
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
