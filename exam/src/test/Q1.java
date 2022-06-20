package test;

public class Q1 {
	
	
	public static String returningString(String greenting, String user) {
		String s = (greenting +" "+ user);
		
	return s;
		
	}
	
	public static void main (String [] args ) {
		String x =returningString("Hi", "krishna");
		System.out.println(x);		
	}

}
