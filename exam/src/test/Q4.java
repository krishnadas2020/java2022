package test;

public class Q4 {

	public static void main(String[] args) {
		String output =returnSomething("cow");
		System.out.println(output);

	}
	public static String returnSomething(String s) {
		if(s == "cow") {
			s= "Animal";
		}else if(s == "table" ) {
			s= "objcets";
		
			
		}else  {
			s= "nothing";
			
			//System.out.println(s);
		}
		return s+"hi"+"hello";
	}	

}
