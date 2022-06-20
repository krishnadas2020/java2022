package test;

public class Q5_1 {

	public static void main(String[] args) {
		returningIndex('m');
		

	}
	public static void returningIndex(char a) {
		String s= "we are faceing java exam";
		int l =s.length();
		for(int i=0;  i<l;  i=i+1) {
			if(s.charAt(i)== a) {     //charAt() return index charactar 
				System.out.println(i);	
			}
				
			}
		

		
	}
	
	

}
