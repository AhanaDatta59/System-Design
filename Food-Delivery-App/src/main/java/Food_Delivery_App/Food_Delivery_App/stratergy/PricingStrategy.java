package Food_Delivery_App.Food_Delivery_App.stratergy;

import Food_Delivery_App.Food_Delivery_App.model.Bill;
import Food_Delivery_App.Food_Delivery_App.model.MenuItem;
import Food_Delivery_App.Food_Delivery_App.model.enums.CouponCode;

import java.util.List;

public interface PricingStrategy {
    Bill generateBill(List<MenuItem> menuItemList);

    boolean isApplicable(CouponCode couponCode);
}