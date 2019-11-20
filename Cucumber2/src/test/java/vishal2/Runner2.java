package vishal2;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature\\demo3.feature",glue= {"StepDef"},plugin= {"html:target/cucumber.html"})


public class Runner2 {

}
