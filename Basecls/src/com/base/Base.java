package com.base;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	public static WebDriver driver; // common
	
	public static void browser_open() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thasif Ahamed\\eclipse-workspace\\Basecls\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	public static void url(String url) {
		driver.get(url);
	}
	public static void Sendkeys(WebElement name,String search_item) {
		name.sendKeys(search_item);	
	}
	public static void wondow_max() {
		driver.manage().window().maximize();	
	}
	public static void close() {
		driver.close();
	}
	public static void Quit() {
		driver.quit();
	}
	public static void clear(WebElement clear) {
		clear.clear();
	}
	public static void navigateto(String url) {
		driver.navigate().to(url);
		
	}
	public static void navigate_bach() {
		driver.navigate().back();
	}
	public static void Navigate_forward() {
		driver.navigate().forward();;
	}
	public static void Navigate_refresh() {
		driver.navigate().refresh();
	}
	public static void Alert_Accept() {
		driver.switchTo().alert().accept();
	}
	public static void Alert_Dismiss() {
		driver.switchTo().alert().dismiss();
	}
	public static void Alert_sendkeys() {
		driver.switchTo().alert().sendKeys("Thasif");
	}
	public static void Alert_getText() {
		driver.switchTo().alert().getText();
	}
	public static void click(WebElement click_button) {
		click_button.click();	
	}
	// Frame
	public static void Frame(WebElement frame) {
		driver.switchTo().frame(frame);	
	}
	public static void Patent_Frame(WebElement pframe ) {
		driver.switchTo().frame(pframe);	
	}
	public static void Coming_out_of_Frame() {
		driver.switchTo().defaultContent();	
	}
	
	public static void getAttribute(WebElement getAttribute) {
		
		String attribute = getAttribute.getAttribute("id");
		 System.out.println(attribute);
	}
	// WAIT
	public static void implicitlyWait() {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	public static void Explicit_wait(String waitpath) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(waitpath)));
	}
	// GET
	public static void gettitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void Getoptions(WebElement all_dropdown) {
		Select select_dd = new Select(all_dropdown);
		List<WebElement> options = select_dd.getOptions();
		for (WebElement alldd : options) {
			System.out.println(alldd.getText());
	}		
	}
	public static void GetCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();	
		System.out.println(currentUrl);
	}
	// IS
	public static void isSelected(WebElement select) {
		boolean selected = select.isSelected();
		System.out.println(selected);
	}
	public static void isdisplay(WebElement display) {
		boolean displayed = display.isDisplayed();
		System.out.println(displayed);
	}
	public static void isEnabled(WebElement enabled) {
		System.out.println(enabled.isEnabled());
	}
	public static void isMultiple(WebElement multiple) {
		Select select = new Select(multiple);
		System.out.println(select.isMultiple());
	}
	// DROP DOWNS
	public static void Dropdown_selectbyindex(WebElement dd_value,int search) {
		Select select = new Select(dd_value);
		select.selectByIndex(search); 
	}
	public static void Dropdown_selectbyValue(WebElement dd_value,String value) {
		Select select = new Select(dd_value);
		select.selectByValue(value);
	}
	public static void Dropdown_selectbyVisibleText(WebElement dd_value,String VisibleText) {
		Select dd = new Select(dd_value);
		dd.selectByVisibleText(VisibleText);	
	}
	public static void Dropdown_getFirstSelectedOption(WebElement Alldropdown) {
		Select d = new Select(Alldropdown);
		WebElement firstSelectedOption = d.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
	}
	public static void Dropdown_getAllSelectedOptions(WebElement Alldropdown ) {
		Select d = new Select(Alldropdown);
		List<WebElement> allSelectedOptions = d.getAllSelectedOptions();
		for (WebElement alloptionselected : allSelectedOptions) {
			System.out.println(alloptionselected.getText());
		}
	}
	public static void Dropdown_deselectbyindex(WebElement dd_value, int index) {
		Select dd = new Select(dd_value);
		dd.deselectByIndex(index);	
	}
	public static void Dropdown_deselectbyValue(WebElement dd_value , String value) {
		Select dd = new Select(dd_value);
		dd.deselectByValue(value);
	}
	public static void Dropdown_deselectbyVisibleText(WebElement dd_value ,String VisibleText) {
		Select dd = new Select(dd_value);
		dd.deselectByVisibleText(VisibleText);
	}
	public static void Dropdown_deselectbyall(WebElement dd_value) {	
		Select dd = new Select(dd_value);
		dd.deselectAll();
	}
	//Actions
	public static void moveToElement(WebElement movetoelement) {
		Actions action = new Actions(driver);
		action.moveToElement(movetoelement);		
	}
	public static void drag_and_drop(WebElement one, WebElement two) {
		Actions action = new Actions(driver);
		action.dragAndDrop(one,two).build().perform();	
	}
	public static void drag_and_dropby(WebElement one , int x , int y) {
	    Actions action = new Actions(driver);
	    action.dragAndDropBy(one, x, y).build().perform();	
	}
	public static void right_click(WebElement rightclick) {
		Actions actions = new Actions(driver);
		actions.contextClick(rightclick).build().perform();	
	}
	public static void double_click(WebElement doubleclick) {
		Actions actions = new Actions(driver);
		actions.doubleClick(doubleclick).build().perform();	
	}
	public static void child_window() {
		java.util.Set<String> allwindowid = driver.getWindowHandles();
        Iterator<String> seprateid = allwindowid.iterator();
        String parentid = seprateid.next();
        String childid = seprateid.next();
        driver.switchTo().window(childid);
	}
	public static void parent_window() {
		java.util.Set<String> allwindowid = driver.getWindowHandles();
        Iterator<String> seprateid = allwindowid.iterator();
        String parentid = seprateid.next();
        String childid = seprateid.next();
        driver.switchTo().window(parentid);	
	}
	
}
