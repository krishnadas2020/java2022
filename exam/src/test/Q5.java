package test;

public class Q5 {

	public static void main(String[] args) {
		returningIndex();	

	}
	  public  static void returningIndex() {
		  String s = "we are facing java exam";
		 int l =  s.length();
		 for(int i =0; i<l;  i=i+1 ) {
			 if(s.charAt(i) == 'c') {         
				 System.out.println(i);
			 }			 
		 }
		  
	  }
}


