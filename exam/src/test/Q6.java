package test;

public class Q6 {

	public static void main(String[] args) {
		String s ="we are learning automation course";
		  int l  = s.length();
		   int count =0;
		   for(int i= 0; i<l; i=i+1) {
			   if(s.charAt(i)=='a') {
				   count=count+1;
			   }
			   
		   } 
		   System.out.println(count);	

	}
}
