package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

/**
 * Created by jnorina on 11/05/2017.
 */
public class TestBase {

    protected final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);
    //protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp() throws Exception {
        app.init();
    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }

    //public ApplicationManager getApp() {
        //return app;
   // }
}
