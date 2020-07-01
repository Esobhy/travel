package com.phptravels.testutils;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.phptravels.testbase.Testbase;
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Testutils extends Testbase {
	public static ATUTestRecorder record_vidio;
	public static Sheet flight_sheet;
	public static Object test_data[][];
	
	public Testutils() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static void snapshot(String name) throws IOException {
		File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile,new File( "C:\\Users\\NTG\\eclipse-workspace\\PHPTravelsTest\\PhptravelsTest\\screanshot\\"+name+".png"));
	}
	
	public static void record(String name) throws ATUTestRecorderException {
     record_vidio =new ATUTestRecorder("C:\\Users\\NTG\\eclipse-workspace\\PHPTravelsTest\\PhptravelsTest\\vedio", name, false);
	}

	}
	

