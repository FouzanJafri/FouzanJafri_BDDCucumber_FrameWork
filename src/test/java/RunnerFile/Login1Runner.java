package RunnerFile;

import io.cucumber.testng.CucumberOptions;
import pages.BaseTestPage;

@CucumberOptions(features = "./src/test/java/featuresFile/Login1.feature" , glue = "StepDefinations", tags = "@Login" )
public class Login1Runner extends BaseTestPage{
	
}
