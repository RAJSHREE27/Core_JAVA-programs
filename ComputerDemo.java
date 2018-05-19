public class ComputerDemo{
	public static void main(String args[]){
		
		Computer comp = new Computer();
		comp.RAMsize=4;
		comp.monitorSize=11;
		comp.systemColor = "black";
		comp.brandName="DELL";
		comp.operatingSystemUsed = "Windows8";
		
		System.out.println("RAM size (in Mb) : "+comp.RAMsize);
		System.out.println("Monitor Size (in inches) : "+ comp.monitorSize);
		System.out.println("colour of System : "+comp.systemColor);
		System.out.println("brand name : "+ comp.brandName);
		System.out.println("operting system used : "+ comp.operatingSystemUsed);
		comp.DisplayVideo();
		comp.Calculation();
		comp.changeBackgroundImage();
		comp.ShutDownWay();
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		Laptop lap = new Laptop();
		lap.RAMsize=8;
		lap.monitorSize=10;
		lap.systemColor = "Silver";
		lap.brandName="HP";
		lap.operatingSystemUsed = "Windows10";
		
		lap.isTouchScreen = true;
		lap.isEmbeddedMouse = true;
		
		System.out.println("RAM size (in Mb) : "+lap.RAMsize);
		System.out.println("Monitor Size (in inches) : "+ lap.monitorSize);
		System.out.println("colour of System : "+lap.systemColor);
		System.out.println("brand name : "+ lap.brandName);
		System.out.println("operting system used : "+ lap.operatingSystemUsed);
		
		
		System.out.println("touch screen : "+lap.isTouchScreen);
		System.out.println("embedded mouse : "+lap.isEmbeddedMouse);
		
		lap.DisplayVideo();
		lap.Calculation();
		lap.changeBackgroundImage();
		lap.Movable();
		lap.ShutDownWay();
		
		
		
	}
}