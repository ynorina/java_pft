package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

    @Test
    public void testGroupDeletion() {
        //wd.findElement(By.name("searchform")).click();
        app.gotoGroupPage();
        app.selectGroup();
        app.deleteSelectedGroups();
        app.returtToGroupPage();
    }


}
