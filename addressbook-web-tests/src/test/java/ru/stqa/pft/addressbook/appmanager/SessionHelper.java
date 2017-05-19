package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by jnorina on 15/05/2017.
 */
public class SessionHelper extends HelperBase{

    public SessionHelper(FirefoxDriver wd) {

        super(wd);
    }

    public void login(String username, String password) {
        type (By.name("user"), username);
        wd.findElement(By.id("LoginForm")).click();
        type (By.name("pass"), password);
        click(By.xpath("//form[@id='LoginForm']/input[3]"));
    }

}
