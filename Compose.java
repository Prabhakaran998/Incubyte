package pageClass;

@pageObject(value = "compose")
public class Compose {
	
	@FindBy(how = How.XPATH , using  = "//input[@name='subjectbox']")
	public static webElement subject;
	
	@FindBy(how = How.XPATH , using  = "//*[@id=':zk']")
	public static webElement body;
	
	@FindBy(how = How.XPATH , using  = "//div[@id=':wp']")
	public static webElement send;

}
