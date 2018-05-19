public class Main{
	public static void main(String args[]){
		
		Pen p = new Pen();
		Marker m = new Marker();
		
	 p.brandName="flora";
	 p.inkFlow="lower";
	 p.inkColor="red";
	 p.price=20;
	 
	 System.out.println("brand name of pen = "+p.brandName);
	 System.out.println("inflow :"+p.inkFlow);
	 System.out.println("ink colour : "+p.inkColor);
	 System.out.println("price of pen : "+p.price);
	 
	 p.SmudgeFree();
	 p.inkFlowRate();
	 p.renewal();
	 
	 System.out.println("-----------------------------------------------------------------");
	 
	 m.brandName="sportzz";
	 m.inkFlow="higher";
	 m.inkColor="black";
	 m.price=55;
	 m.type = "french";
	 
	 System.out.println("brand name of pen = "+m.brandName);
	 System.out.println("inflow :"+m.inkFlow);
	 System.out.println("ink colour : "+m.inkColor);
	 System.out.println("price of pen : "+m.price);
	 
	 m.SmudgeFree();
	 m.inkFlowRate();
	 m.whiteBoard();
	 m.renewal();
	 
	}
}