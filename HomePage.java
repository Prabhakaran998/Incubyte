package pageClass;

@pageObject(value = "compose")
public class HomePage {
	
	@TargetPage("")
	@FindBy(how = How.XPATH , using  = "//*[@class='T-I T-I-KE L3']")
	public static webElement composeButton;
	

}
