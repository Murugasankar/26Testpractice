package Runnerpackage;

import org.junit.runner.RunWith;

import Basepackage.Baseclass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src\\test\\java\\feature\\file1.feature",glue = "StepPackage")
	public class Runnerclass extends Baseclass
	{
	

}
