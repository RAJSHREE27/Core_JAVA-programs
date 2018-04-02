//program using getter and setter methods to implement certain operations of MOBILE phone

 public class Mobile{
	 
	 int screenLength;
	 double width;
	 private String unlockPassword;
	 private String contactNumber;
	 private String androidVersion;					
	 private int numberOfApps;
	 int frontCameraPixel;
	 int backCameraPixel;
	 
	 public String getUnlockPassword(){			//getter method is used to assign values and setter method is used to put conditions and print
	 
		return unlockPassword;
	 }
	 
	  public String getContactNumber(){			//getter method is used to assign values and setter method is used to put conditions and print
	 
		return contactNumber;
	 }
	 
	  public String getAndroidVersion(){			//getter method is used to assign values and setter method is used to put conditions and print
	 
		return androidVersion;
	 }
	 
	 //applying Validation 
	 //using setter method
	 
	 public void setUnlockPassword(String unlockPassword){
		 if(unlockPassword == null)
		 {
			 System.out.println("INVALID ENTRY!");
		 }
		 unlockPassword =  unlockPassword.trim();
		 if(unlockPassword.isEmpty()){
			 
			  System.out.println("INVALID ENTRY!");
		 }
		 else{
			 
			 for(int count= 1; count <= unlockPassword.length(); count++)
			 {
				  System.out.print("*");
			 }
			  System.out.print("\n");
		 }
		 this.unlockPassword = unlockPassword ;
	 }
	 
	 public void setContactNumber(String contactNumber){
	 
		if(contactNumber.length() != 10)
		{
			System.out.println("INVALID CONTACT NUMBER !");
		}
		else{
			System.out.print("NUMBER ACCEPTED !!");
		}
		
		this.contactNumber = contactNumber;
		
	 }
	 public void setAndroidVersion(String androidVersion){
		
		 System.out.println("\n\n Android version used =  "+androidVersion );
		 this.androidVersion = androidVersion ;
	 }
	 
	 void mobileInfo(){
		  System.out.println("\n An Android phone is a powerful, high-tech smartphone that runs on the Android operating system -");
		  System.out.println("(OS) developed by Google and is used by a variety of mobile phone manufacturers.");
		  System.out.print("\n");
	 }
	 
	 
	 void mobileInformation(){
		 System.out.println("----------Some Basic physical info about Mobile----------------\n");
		 System.out.println("Screen Length(in inches) = "+ screenLength);
		 System.out.println("Body Width (in cm) = "+ width);
		 System.out.println("configuration (in pixels) of : front camera = "+frontCameraPixel + " and back camera = "+backCameraPixel );
	 } 
	 
 }// end class