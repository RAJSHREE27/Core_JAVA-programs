	
import java.util.*;

	public class DemoTelevision{
		public static void main(String args[]){
		
		Scanner scan =  new Scanner(System.in);
		
		Television tv = new Television();
		tv.channelList = new String[100];					// maximum upto 100 channels
		tv.channel_num = new int[100];						// maximum upto 100 channels
		System.out.print("Enter the number of channels in TV1 whose information is to be diplayed -> ");
		tv.numberOfChannels = scan.nextInt();
		System.out.print("\n");
		tv.Enter_Channel();
		tv.Display_Channel();
		
		

		}
	}