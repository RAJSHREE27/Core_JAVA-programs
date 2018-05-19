// properties of  pen  /********INHERITANCE-OVRRIDE********/

public class Pen{
	
	String brandName;
	String inkFlow;
	String inkColor;
	float price;
	
	void SmudgeFree(){
		System.out.println("yeah it is smudge free! ");
	}
	void inkFlowRate(){
		System.out.println("the ink flow rate is "+inkFlow);
	}
	void renewal(){
		System.out.println("refills are inserted to renew it again");
	}
	
}//enc class