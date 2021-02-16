package com.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.HomePage;
import com.pages.ResultsPage;

public class BaseClass {
	public static WebDriver driver=new ChromeDriver();
	public static HomePage homePage=new HomePage();
	public static ResultsPage resultsPage=new ResultsPage();

}
