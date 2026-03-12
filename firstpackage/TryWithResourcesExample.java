package firstpackage;

import java.io.FileOutputStream;

public class TryWithResourcesExample {
	public static void main(String[] args) {

		double contractedLoad = 1.75;
		int presentMonthDays = FormatUtils.deltaDays("01/11/2024", "08/11/2024")+1;
        int prevDays = 30 - presentMonthDays;
        int days = 30;//meeterReadingBean.getNoOfDaysToBill();
        double r = presentMonthDays/30;
        double newFx = FormatUtils.roundDec2((double)presentMonthDays/30)*150*contractedLoad;//contractedLoad * 150 / days) * presentMonthDays;
        double prevFx = FormatUtils.roundDec2((double)prevDays/30)*70*contractedLoad;//(contractedLoad * 70 / days) * prevDays;
        System.out.println(newFx + prevFx);       
        
		
		/*
		try (FileOutputStream fos = new FileOutputStream("outputtext.txt")) {
			String text = "Hello World. This text is to be written to the file.";
			byte[] arr = text.getBytes();
			fos.write(arr);
		}catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Resource is closed and output has been written to the file");
		*/
	}
}
