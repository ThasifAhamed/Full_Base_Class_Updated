package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Mainpage extends Base {
	public static void main(String[] args) throws InterruptedException {
		browser_open();
		wondow_max();
		url("https://demoqa.com/droppable");
		WebElement one = driver.findElement(By.xpath("//div[@id='draggable']"));
		drag_and_dropby(one,150,50);
       
}
	

	

	

	



	

	

	

	
		
}
