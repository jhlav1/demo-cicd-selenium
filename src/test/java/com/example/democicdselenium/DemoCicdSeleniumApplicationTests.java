package com.example.democicdselenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoCicdSeleniumApplicationTests {

	WebDriver driver;

	@Test
	void contextLoads() {
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");
		//driver = new ChromeDriver((options));
		FirefoxOptions options= new FirefoxOptions();
		options.addArguments("--headless");
		driver = new FirefoxDriver();
		driver.get("https://www.iths.se");

		assertEquals("IT-Högskolan – Här startar din IT-karriär!", driver.getTitle(), "The title does not match");
	}

}
