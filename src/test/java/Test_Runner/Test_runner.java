package Test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(features=" src//test//resources//Features//cucumber.feature ",
glue= {"stepdefination"})
public class Test_runner {

}

