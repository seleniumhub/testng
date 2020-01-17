package testcases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTestCases   implements IRetryAnalyzer {
	
	    public int retryCnt = 0;
	    //You could mentioned maxRetryCnt (Maximiun Retry Count) as per your requirement. Here I took 2, If any failed testcases then it runs two times
	    public int maxRetryCnt = 2;
	  
	    //This method will be called everytime a test fails. It will return TRUE if a test fails and need to be retried, else it returns FALSE
	    public boolean retry1(ITestResult result) {
	    	System.out.println("retry");
	        if (retryCnt < maxRetryCnt) {
	            System.out.println("Retrying " + result.getName() + " again and the count is " + (retryCnt+1));
	            retryCnt++;
	            return true;
	        }
	        return false;
	    }

		@Override
		public boolean retry(ITestResult result) {
			// TODO Auto-generated method stub
			return false;
		}
	   
	}


