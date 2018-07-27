package listener.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MyListener implements ITestListener{
	ExtentReports r;
	ExtentTest t;

	@Override
	public void onFinish(ITestContext context) {
		r.endTest(t);
		r.flush();
		
	}	

	@Override
	public void onStart(ITestContext context) {
		
		//System.out.println("Context start");
		r=new ExtentReports("C:\\PNCB\\WorkSpace\\MyFramework\\src\\test\\java\\Myreports.html");
		r.addSystemInfo("User","Panter");
		r.addSystemInfo("Browser","chrome");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage finish");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		t.log(LogStatus.FAIL,result.getMethod().getMethodName()+"has failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped Failed");
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		t=r.startTest(result.getMethod().getMethodName()+"has started");
		t.log(LogStatus.INFO,result.getMethod().getMethodName()+"has started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		t.log(LogStatus.PASS,result.getMethod().getMethodName()+"has passed");
		
	}

}
