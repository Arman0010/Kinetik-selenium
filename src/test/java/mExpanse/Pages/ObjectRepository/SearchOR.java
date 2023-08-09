package mExpanse.Pages.ObjectRepository;

import org.openqa.selenium.By;

public class SearchOR {
    public static class Locator{
        public static By FeaturesItems = By.xpath("//H2[@class='title text-center'][text()='Features Items']");
        public static By Products = By.xpath("//A[@href='/products']");
        public static By AllProducts = By.xpath("//H2[@class='title text-center'][text()='All Products']");
        public static By SearchBox = By.xpath("//INPUT[@id='search_product']");
        public static By SearchIcon = By.xpath("//BUTTON[@id='submit_search']");
        public static By ProductName = By.xpath("/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/p");

    }

    public static class UIElements{
        public static String FeaturesItems = "FEATURES ITEMS";
        public static String AllProducts = "ALL PRODUCTS";
        public static String ProductName = "Blue Top";
    }
}
