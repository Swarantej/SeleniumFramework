package javapractise;

import java.util.ArrayList;

public class Interview_Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Print the unique number in the list of array
		 * Print the number with the repated times
		 */

		int a[] = {1,4,6,7,4,3,9,8,9,7,3,7,7};
		/**
		 * Steps :
		 * First create an array list as it can hold duplicate values
		 * Take the first num and check it it is in array list object, if not add the num, have variable num of times repated
		 * Then once the value is added then check the num present in array by using j =i+1 and increase the num of repated 
		 * If present exit the loop and print
		 */
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i =0; i<a.length;i++) {
			int k =0;
			if(!al.contains(a[i])) {
				al.add(a[i]);
				k++;
				
				for(int j= i+1; j<a.length;j++) {
					if(a[i]==a[j]) {
						k++;
					}
				}
				
				System.out.println("The num "+a[i]+" is repated "+k+" times");
				if(k==1) {
					System.out.println(" The unique number present in array is "+a[i]);
				}
				
			}
			
			
			
		}
		
		
	}

}
