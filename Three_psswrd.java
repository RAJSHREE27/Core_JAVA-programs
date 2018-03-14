//this program takes password from the user three times not more than that if entered wrong

public class Three_psswrd{
	public static void main(String args[]) throws Exception{
		
		String sysPsswrd = "U_Won't_Get";
		java.io.Console con = System.console();
		
		System.out.println("ENTER THE PASSWORD TO LOGIN -");
		for(int count = 0; count<3 ; count++)
		{
			char []ip_psswrd = con.readPassword();
			String PASSWORD = new String(ip_psswrd);
			if(PASSWORD.equals(sysPsswrd)==true)
			{	
				for(int star=0; star<5 ;  star++)
				{
					System.out.print("*");
					Thread.sleep(1000);
				}
				System.out.println("\n HEY ! U GOT IT!");
				System.exit(0);
			}
			if(count==2)
			{
				System.out.println("SORRY ! NO FURTHER CHANCE LEFT");
				System.exit(0);
				
			}
			else
			{
				System.out.println("TRY ONCE MORE!");
			}
			
		}
	}// end main
}// end class