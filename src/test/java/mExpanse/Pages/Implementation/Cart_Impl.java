package mExpanse.Pages.Implementation;

import mExpance.Library.Operations;
import mExpanse.Pages.Interface.Cart_Interface;
import mExpanse.Pages.ObjectRepository.CartOR;
import mExpanse.Pages.ObjectRepository.SearchOR;
import org.openqa.selenium.WebDriver;

public class Cart_Impl implements Cart_Interface {

    @Override
    public void cart(WebDriver driver) throws InterruptedException {
        Operations.matchText(CartOR.Locator.FeaturesItems,CartOR.UIElements.FeaturesItems,driver);
        Operations.click(CartOR.Locator.ViewProduct,driver);
        Operations.matchText(CartOR.Locator.ProductName,CartOR.UIElements.ProductName,driver);
        Operations.clear(CartOR.Locator.Quantity,driver);
        Operations.sendText(CartOR.Locator.Quantity, "4",driver);
        Operations.click(CartOR.Locator.AddToCart,driver);
        Thread.sleep(3000);
        Operations.click(CartOR.Locator.ViewCart,driver);
        Operations.matchText(CartOR.Locator.FinalQuantity,"4",driver);

    }

}
