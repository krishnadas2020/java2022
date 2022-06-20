package test;
//print out the elements which are below 30 or above 50


public class Q7 {

	public static void main(String[] args) {
		int [] array = {10,20,34,44,19,23,46,100,200};
		int l = array.length;
		for(int i = 0;  i<l;  i=i+1) {
			if(array[i] <30 || array[i] >50) { // using or || conditions to find out below and above values 
				
				System.out.println(array[i ]);
				
			}
			
		}	
		
	}	

}
