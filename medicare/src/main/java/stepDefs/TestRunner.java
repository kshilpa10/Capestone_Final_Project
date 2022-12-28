package stepDefs;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
(
    	features = {"src/test/java/features/customerRegistration.feature",
    			"src/test/java/features/login.feature","src/test/java/features/productPurchase.feature"},
    	//tags= {"@sanity"},
    	glue = {"stepDefs"},
    	monochrome = true,
    	plugin = {"pretty","html:test-output","json:test-output/cucumber.json"}
    	
    		
		)

public class TestRunner {

}
