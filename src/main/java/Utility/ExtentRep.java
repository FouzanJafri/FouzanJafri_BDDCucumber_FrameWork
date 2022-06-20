package Utility;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentRep {
	
	public static ExtentReports getIns() {
		return new ExtentReports("./Output/Report/ExtentReport.html", false);
	}

}
