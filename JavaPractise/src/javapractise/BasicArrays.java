package javapractise;

public class BasicArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum =0;
		int temp =0;
		int a[] = {1,2,3,4};
		for(int i = 0; i<a.length;i++) {
			sum = sum+a[i];
		}
		System.out.println(sum);
		
		for(int i = 0; i<a.length;i++) {
			temp =a[i];
			if(temp==3) {
				System.out.println("index of 3 is "+i );
				break;
			}
		}
		
		
		//Multip Dim Array
		
		int b[][]  = {{1,2},{4,5}};
		for(int i =0; i<2;i++) {
			for(int j=0; j<2;j++) {
				System.out.println("Multi Dim Array "+b[i][j]);
			}
		}
	}
	
	//Index of 3 
	
	

}
