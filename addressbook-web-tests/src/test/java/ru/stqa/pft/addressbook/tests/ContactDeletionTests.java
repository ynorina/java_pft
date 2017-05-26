package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

/**
 * Created by jnorina on 22/05/2017.
 */
public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion() {
        app.getNavigationHelper().gotoContactPage();
        if (! app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("New", "Contact", "Tester", "Company", "Lenin street 10, Moscow", "test1"));

        }

        app.getContactHelper().selectContact();
        app.getContactHelper().submitContactDeletion();
        app.getNavigationHelper().gotoContactPage();




    }
}
