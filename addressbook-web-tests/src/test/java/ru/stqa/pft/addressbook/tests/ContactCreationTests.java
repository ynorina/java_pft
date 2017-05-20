package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.tests.TestBase;




public class ContactCreationTests extends TestBase {
    //FirefoxDriver wd;

    @Test
    public void testContactCreation() {
        app.getContactHelper().gotoAddContactPage();
        app.getContactHelper().fillContactForm(new ContactData("New", "Contact", "Tester", "Company", "Lenin street 10, Moscow"));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomepage();
    }


}
