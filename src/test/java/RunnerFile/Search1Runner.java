package RunnerFile;

import io.cucumber.testng.CucumberOptions;
import pages.BaseTestPage;

@CucumberOptions(features = "./src/test/java/featuresFile/Search1.feature" , glue = "StepDefinations" )
public class Search1Runner extends BaseTestPage {	
	
}
