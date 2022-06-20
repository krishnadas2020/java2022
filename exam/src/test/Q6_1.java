package test;
//make a method which will return total number of the character appear of string 


public class Q6_1 {

	public static void main(String[] args) {
		returningTotalNumber('a');

	}
	
	public static void returningTotalNumber(char c) {
		String s = "we are learning QA automation course";
		int  l= s.length();
		int count =0;
		for(int i=0;  i<l;  i=i+1) {
			if(s.charAt(i) == c) {    // c variable represent 
				count=count+1;  //
				//System.out.println(count);
			}
		}
		System.out.println(count);
	}

}
