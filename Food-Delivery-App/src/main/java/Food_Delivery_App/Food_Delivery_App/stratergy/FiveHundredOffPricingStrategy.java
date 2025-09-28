package Food_Delivery_App.Food_Delivery_App.stratergy;

import Food_Delivery_App.Food_Delivery_App.model.Bill;
import Food_Delivery_App.Food_Delivery_App.model.MenuItem;
import Food_Delivery_App.Food_Delivery_App.model.enums.CouponCode;

import java.util.List;
import java.util.UUID;

public class FiveHundredOffPricingStrategy implements PricingStrategy {
    private final double discount = 500;

    @Override
    public Bill generateBill(List<MenuItem> menuItemList) {
        double totalCost = menuItemList.stream().mapToDouble(menuItem -> menuItem.getPrice()).sum();
        return Bill.builder()
                .id(UUID.randomUUID().toString())
                .totalCost(totalCost)
                .discount(discount)
                .amountToBePaid(totalCost - discount)
                .tax((totalCost - discount) * 0.05)
                .build();
    }

    @Override
    public boolean isApplicable(CouponCode couponCode) {
        return couponCode == CouponCode.FIVE_HUNDRED_OFF;
    }
}