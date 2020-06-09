package schoolSystem;

import java.util.Scanner;

public class DataEntryTest {
	
	public static void main(String asrgs[]) {
		
		Scanner scan = new Scanner(System.in);
		DataEntry data = new DataEntry();
		
		data.getNumber(scan);
		data.startRecording(scan);
		data.getInfo();
		
	}
}
