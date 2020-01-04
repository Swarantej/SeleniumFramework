package javapractise;

public class Interview_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// QUESTION 1: How to identify the lowest the number in the give matrix
		
		int a[][] = {{22,4,5},{3,4,7},{0,2,9}};
		//Assuiming that a[0][0] is the minimum value in the matrix
		int min = a[0][0];
		for(int i=0; i<3;i++) {
			for(int j=0;j<3;j++) {
				if((a[i][j])< min) {
					min = a[i][j];		
				}
				
				
			}
		}
		
		System.out.println("min Value is " +min);
		
		
		
		
		// QUESTION 2: Find out the Max Num
		int max = a[0][0];
		for(int i=0; i<3;i++) {
			for(int j=0;j<3;j++) {
				if((a[i][j])> max) {
					max = a[i][j];		
				}
				
				
			}
		}
		
		System.out.println("min Value is " +max);
		
		
		//QUESTION 3: Find the Minimum Num and the maxmium number in the column where minium number is identified
		
		//Assuiming that a[0][0] is the minimum value in the matrix
		
		int minNum = a[0][0];
		int maxNum;
		int col = 0;
		for(int i=0; i<3;i++) {
			for(int j=0;j<3;j++) {
				if((a[i][j])< minNum) {
					minNum = a[i][j];
					 col = j;
				}	
			}
		}
		 int k =0;
		 maxNum = a[0][col];
		 while(k<3) {
			 if(a[k][col]> maxNum) {
				 maxNum = a[k][col];
			 }
			 k++;
		 }
		 
		
		
		 System.out.println(" The Max num in the column of Min Numbr present is " + maxNum);

		
	}
	
	
	//
			
	


}
