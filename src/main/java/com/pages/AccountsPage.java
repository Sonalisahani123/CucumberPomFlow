package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {
	private WebDriver driver;
	private By accountssections=By.cssSelector("div#center_column span");
	
	public AccountsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public String getAccountsPageTitle()
	{
		return driver.getTitle();
	}
	public int getAccountsSectionCount()
	{
		return driver.findElements(accountssections).size()-1;
	}
	
	public List<String> getAccountsSectionList()
	{
      List<String> accountList= new ArrayList<>();
      List<WebElement> accountsHeaderList= driver.findElements(accountssections);
      for(WebElement e: accountsHeaderList)
      {
    	  String text=e.getText();
    	  System.out.println(text);
    	  accountList.add(text);
      }
		return  accountList;
		
	}
	
	

}
