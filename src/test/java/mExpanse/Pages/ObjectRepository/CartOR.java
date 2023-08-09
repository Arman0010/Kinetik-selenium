package mExpanse.Pages.ObjectRepository;

import org.openqa.selenium.By;

public class CartOR {
    public static class Locator{
        public static By FeaturesItems = By.xpath("//H2[@class='title text-center'][text()='Features Items']");
        public static By ViewProduct = By.xpath("//A[@href='/product_details/1']");
        public static By ProductName = By.xpath("//H2[text()='Blue Top']");
        public static By Quantity = By.xpath("//INPUT[@id='quantity']");
        public static By AddToCart = By.xpath("//BUTTON[@type='button']");
        public static By ViewCart = By.xpath("//U[text()='View Cart']");
        public static By FinalQuantity = By.xpath("//BUTTON[@class='disabled'][text()='4']");

    }

    public static class UIElements{
        public static String FeaturesItems = "FEATURES ITEMS";
        public static String ProductName = "Blue Top";

    }
}
