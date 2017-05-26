package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

/**
 * Created by jnorina on 23/05/2017.
 */
public class ContactModificationTests extends TestBase {
    @Test
    public void testContactModification() {

        app.getNavigationHelper().gotoContactPage();
        if (! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("New", "Contact", "Tester", "Company", "Lenin street 10, Moscow", "test1"));

        }
        app.getContactHelper().gotoContactEdit();
        app.getContactHelper().fillContactForm(new ContactData("Ivan", "Ivanov", "Test Lead", "Google", "Marx street 101, Omsk", null), false);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToHomepage();
    }



}
