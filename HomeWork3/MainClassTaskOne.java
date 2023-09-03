package HomeWork3;

import HomeWork3.onlineShop.ProductDatabase;
import HomeWork3.onlineShop.ShopManager;
import HomeWork3.view.OnlineShopUI;

public class MainClassTaskOne {
    public static void main(String[] args) {
        ProductDatabase db = new ProductDatabase();
        ShopManager manager = new ShopManager(db);
        OnlineShopUI onlineShopUI = new OnlineShopUI(manager);
        onlineShopUI.run();
    }
}