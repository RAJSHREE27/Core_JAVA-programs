// main function for mobile class.

public class MobileMain{
	public static void main(String args[]){
		
		Mobile mob = new Mobile();
		
		mob.screenLength = 5;
		mob.width = 0.5;
		mob.frontCameraPixel = 8;
		mob.backCameraPixel = 15;
		
		System.out.println("\n");
		mob.setUnlockPassword("rajshree@CSE");
		mob.setUnlockPassword("  ");
		//mob.setUnlockPassword(null);
		mob.setContactNumber("9865324");
		mob.setContactNumber("9876543219");
		mob.setAndroidVersion("OREO");
		
		System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
		mob.mobileInfo();
		System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
		mob.mobileInformation();
		
		//System.out.println(mob.getUnlockPassword());
		System.out.println(mob.getContactNumber());
		System.out.println(mob.getAndroidVersion());
		
		
	}//end main
}// end class