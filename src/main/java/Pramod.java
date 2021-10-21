import org.testng.Reporter;
import org.testng.annotations.Test;

public class Pramod {

@Test	
public void TC1(){
Reporter.log("Running TC1",true);		
	}
@Test(priority=1)
public void TC2() {
Reporter.log("Running TC2",true);	
}


@Test(timeOut=8000)
public void TC3() throws InterruptedException {
Thread.sleep(7000);
Reporter.log("Running TC3",true);	
}

@Test(enabled=false)
public void TC4() {
Reporter.log("Running TC4",true);	
}

@Test(dependsOnMethods="TC1")
public void TC5() {
Reporter.log("Running TC5",true);	
}

@Test(invocationCount=5)
public void TC6() {
Reporter.log("Running TC6",true);	
}


}
