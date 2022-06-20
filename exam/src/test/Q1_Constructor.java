package test;

public class Q1_Constructor {
	
	String greenting;
	String user;
	
	Q1_Constructor(String g, String u){
		greenting=g;
		user=u;
		String s = (g+" "+u);
		System.out.println(s);// SOP always should be on constructor
		
	}
	
	

	public static void main(String[] args) {
		
		Q1_Constructor obj = new Q1_Constructor("hi", "Krishna");
		
		//System.out.println(obj);
		
		
		
	}

}
