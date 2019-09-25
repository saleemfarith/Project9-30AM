package org.cts.TestNGProject;

import java.util.Date;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class A {

@Test(groups="Regression")
public void tc1() {
System.out.println("Farith");
}

@Test(groups="Sanity")
public void tc2() {
System.out.println("Karthik");
}

@Test(groups="Smoke")
public void tc3() {
System.out.println("Saranya");
}
@Test(groups="Regression")
public void tc4() {
System.out.println("Naveen");
}
@Test(groups="Retest")
public void tc5() {
System.out.println("Suresh");
}
@Test(groups="Regression")
public void tc6() {
System.out.println("Syed");

}















}
