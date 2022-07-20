package pages;

import org.openqa.selenium.By;

import Browser.Browser;

public class AddtoCart extends Browser {
	public static void openbrowser() {
		Browser.OpenBrowser();
		
	}
	public static void Enterurl(String a)
	{
		Browser.openurl(a);
	}
	public static void Selecting_an_item_to_buy() {
		try
		{
			driver.findElement(By.xpath("//img[@title=\"iPhone\"]")).click();	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void  click_on_add_to_cart()
	
	{
		try
		{
			driver.findElement(By.id("button-cart")).click();	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void Item_should_be_added_to_cart()
	{
		try
		{
			driver.findElement(By.className("d-none d-md-inline")).click();	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
