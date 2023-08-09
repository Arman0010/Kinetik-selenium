package mExpanse.Pages.Implementation;

import mExpance.Library.Operations;
import mExpanse.Pages.Interface.Search_Interface;
import mExpanse.Pages.ObjectRepository.SearchOR;
import org.openqa.selenium.WebDriver;

public class Search_Impl implements Search_Interface {

    @Override
    public void search(WebDriver driver) throws InterruptedException {
        Operations.matchText(SearchOR.Locator.FeaturesItems,SearchOR.UIElements.FeaturesItems,driver);
        Operations.click(SearchOR.Locator.Products,driver);
        Thread.sleep(2000);
        Operations.matchText(SearchOR.Locator.AllProducts,SearchOR.UIElements.AllProducts,driver);
        Operations.sendText(SearchOR.Locator.SearchBox,"Blue Top",driver);
        Operations.click(SearchOR.Locator.SearchIcon,driver);
        Thread.sleep(2000);
        Operations.matchText(SearchOR.Locator.ProductName,SearchOR.UIElements.ProductName,driver);


    }

}
