package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by jnorina on 22/05/2017.
 */
public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion() {
        app.getNavigationHelper().gotoContactPage();
        app.getContactHelper().selectContact();
        app.getContactHelper().submitContactDeletion();
        app.getNavigationHelper().gotoContactPage();




    }
}
