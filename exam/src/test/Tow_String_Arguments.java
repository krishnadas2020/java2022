package test;

public class Tow_String_Arguments {

	public static void main(String[] args) {
		
		Tow_String_Arguments obj = new Tow_String_Arguments	();
		  
				   String  output =obj.returingString("hi", "krishna");
				   System.out.println(output);
		
		

	}
      public String returingString(String greenting,String user) {
    	  String s =(greenting +" "+ user);
    	  return s;
    	  
      }
	
	
}
