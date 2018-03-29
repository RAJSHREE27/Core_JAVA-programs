import java.util.*;

public class Doctor{
	
	void giveMedicines(String diseaseName){
		if(diseaseName.equalsIgnoreCase("Fever"))
		{
			System.out.println("DOCTOR'S VIEW -> ");
			System.out.println(" You should take paracetamol and drink boiled water. Also, take a sound sleep !");
		}
		else if(diseaseName.equalsIgnoreCase("Cold and Cough"))
		{
			System.out.println("DOCTOR'S VIEW -> ");
			System.out.println("You should take nice syrup and avoid consuming cold items. Taking a Steam bath with a deep sleep will be helpful !");
		}
		else if(diseaseName.equalsIgnoreCase("Indigestion"))
		{
			System.out.println("DOCTOR'S VIEW -> ");
			System.out.println("You should take Diegene or Eno kind of powders or aerated drinks and better do proper aerobics !");
		}
		else if(diseaseName.equalsIgnoreCase("Headache"))
		{
			System.out.println("DOCTOR'S VIEW -> ");
			System.out.println("You should take dispriene and a good sleep !");
		}
		else if(diseaseName.equalsIgnoreCase("Cramps"))
		{
			System.out.println("DOCTOR'S VIEW -> ");
			System.out.println("You should stretch you legs straight for a while and better to tie a band over it and relax !");
		}
		else{
			System.out.println("NO TREATMENT AVAILABLE !!!!");
		}
		System.out.println("_____________________________________________________________________________________________\n");
	}//end function
	
}//end class