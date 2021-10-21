import org.testng.Reporter;
import org.testng.annotations.Test;

public class Phone {
    @Test
	public void ss() {
	Reporter.log("Running test",true);
	}
    
    @Test(priority=1)
   	public void TC2() {
   	Reporter.log("Running test",true);
   	}
    
    @Test(enabled=false)
   	public void TC3() {
   	Reporter.log("Running test",true);
   	}
    
    
    
	
}
