// program to take a password for a single time

public class One_psswrd{
	
	public static void main( String args[]){
		
		String sysPsswrd = "U_Won't_Get";
		java.io.Console con = System.console();
		
		System.out.println(" Enter the valid password");
		char []password = con.readPassword();
		// it will not display password in commandLine
		String PASSWORD = new String(password);
		
		if (sysPsswrd.equals(PASSWORD)==false)
		{
			System.out.println("INVALID PASSWORD!! YOU CANNOT LOGIN NOW!");
	
		}
		else
		{
			System.out.println("HEY, YOU GOT IT ! WELCOME !!");
		}			
		
	}//end main
}//end class