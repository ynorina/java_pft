package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by jnorina on 20/05/2017.
 */
public class ContactHelper extends HelperBase{
     public ContactHelper(WebDriver wd) {
        super(wd);
    }



    public void returnToHomepage() {
        click(By.linkText("home page"));
    }

    public void submitContactCreation() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void fillContactForm(ContactData contactData, boolean creation) {
        type (By.name("firstname"),contactData.getFirstName());
        type (By.name("lastname"),contactData.getLastName());
        type (By.name("title"),contactData.getTitle());
        type (By.name("company"), contactData.getCompany());
        type (By.name("address"),contactData.getAddress());

        if (creation){
            new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else{
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }
    }

    public void gotoAddContactPage() {
        click(By.linkText("add new"));
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }

    public void submitContactDeletion() {
         click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
         wd.switchTo().alert().accept();

         }

    public void gotoContactEdit() {
         click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
    }

    public void submitContactModification() {
         click(By.name("update"));
    }
}
