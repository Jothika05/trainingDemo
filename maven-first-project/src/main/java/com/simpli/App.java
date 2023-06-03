package com.simpli;
import org.openqa.selenium.*;  
import org.openqa.selenium.chrome.ChromeDriver;
public class App {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.google.com/");
  }

}