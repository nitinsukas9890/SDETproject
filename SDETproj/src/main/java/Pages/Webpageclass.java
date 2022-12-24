package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Testbaseclass;

public class Webpageclass extends Testbaseclass{
	
	@FindBy(xpath=("//a[text()='December 17, 2021 (United States)']"))
	private WebElement getIMDBdate;
	
	@FindBy(xpath=("//a[text()='India']"))
	private WebElement getIMDBcountry;
	
	@FindBy(xpath=("//div[@class=\'plainlist\'][4]"))
	private WebElement getDateWiki;
	
	@FindBy(xpath=("//td[text()='India']"))
	private WebElement getCountryWiki;
	
	public Webpageclass()
	{
		PageFactory.initElements(driver, this);
	}
	    public String verifymovieDateWiki() throws Exception
	    {
	    	String wikiDate = getDateWiki.getText();
	    	Thread.sleep(2000);
	    	return wikiDate;
	    }
	    public String verifymovieDateIMDB() throws Exception
	    {
	    	driver.navigate().to("https://www.imdb.com/title/tt9389998/");
	    	String IMDBDate=getIMDBdate.getText();
	    	Thread.sleep(2000);
			return IMDBDate;
	    }
	    public String verifymovieCountrywiki() throws Exception
	    {
	    String WikiCountry= getCountryWiki.getText();
	    Thread.sleep(2000);
		return WikiCountry;
	    }
	    public String verifymovieCountryIMDB() throws Exception
	    {
	    	driver.navigate().to("https://www.imdb.com/title/tt9389998/");
	    	String IMDBCountry=getIMDBcountry.getText();
	    	Thread.sleep(2000);
			return IMDBCountry;
	    	
	    
	    
	    	
	    	
	    }
	

}
