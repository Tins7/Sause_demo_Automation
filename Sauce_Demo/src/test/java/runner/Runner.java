package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

//@RunWith(cucumber.class)

@CucumberOptions(
		
	features= "\\src\\main\\resources\\Features",
	glue= "steps",
	dryRun= true,
	monochrome= true	
		
		)
public class Runner {
	
	

}
