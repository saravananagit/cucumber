package org.finalRun;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

 @RunWith(Cucumber.class)
 @CucumberOptions(features="src\\test\\resources\\feature",
 glue="org.definition",dryRun=false)

public class RunAll {

}
