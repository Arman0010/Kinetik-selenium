package mExpanse.Pages.TestCases;

import mExpance.Library.BaseClass;
import mExpanse.Pages.Implementation.Search_Impl;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(mExpanse.Listener.CustomListener.class)
public class SearchTC extends BaseClass{
    Search_Impl obj= new Search_Impl();

    @BeforeClass
    public void setupDriver(){
        setUp();
    }


    @Test
    public void Search() throws InterruptedException {
        obj.search(driver);
    }

    @AfterClass
    public void  testCaseTearDown() {
        tearDown();
    }
}
