package sep_batch_finalproject;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features_files",
                    glue = "Stepdef",
                    dryRun = false,
                    tags = "@Jira-347"
                    
                  
		)
public class TestRunner
{

}
