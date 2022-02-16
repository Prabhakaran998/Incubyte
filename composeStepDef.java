package stepDefinition;

import pageClass.Compose;

public class composeStepDef {

	
	@And("^I enter ([^\"]*)in the subject$")
	public void iEnterTheSubject(String elementName) {
		
		Compose.subject.sendKeys(elementName);
	}
	
	
	@And("^I enter ([^\"]*)in the body$")
	public void iEnterInTheBody(String elementName) {
		
		Compose.body.sendKeys(elementName);
	}
}
