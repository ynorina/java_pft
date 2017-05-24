package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by jnorina on 15/05/2017.
 */
public class NavigationHelper extends HelperBase{


    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void gotoGroupPage() {

        click(By.linkText("groups"));
    }

    public void gotoContactPage() {
        click(By.linkText("home"));
    }
}
