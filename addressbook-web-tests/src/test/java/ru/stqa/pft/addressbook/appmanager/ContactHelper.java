package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by jnorina on 20/05/2017.
 */
public class ContactHelper extends HelperBase{
     public ContactHelper(FirefoxDriver wd) {
        super(wd);
    }



    public void returnToHomepage() {
        click(By.linkText("home page"));
    }

    public void submitContactCreation() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void fillContactForm(ContactData contactData) {
        type (By.name("firstname"),contactData.getFirstName());
        type (By.name("lastname"),contactData.getLastName());
        type (By.name("title"),contactData.getTitle());
        type (By.name("company"), contactData.getCompany());
        type (By.name("address"),contactData.getAddress());

    }

    public void gotoAddContactPage() {
        click(By.linkText("add new"));
    }
}
