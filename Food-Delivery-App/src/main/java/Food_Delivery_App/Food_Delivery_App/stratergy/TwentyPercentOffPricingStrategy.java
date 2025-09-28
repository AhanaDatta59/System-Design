package Food_Delivery_App.Food_Delivery_App.stratergy;

import Food_Delivery_App.Food_Delivery_App.model.Bill;
import Food_Delivery_App.Food_Delivery_App.model.MenuItem;
import Food_Delivery_App.Food_Delivery_App.model.enums.CouponCode;

import java.util.List;
import java.util.UUID;

public class TwentyPercentOffPricingStrategy implements PricingStrategy {
    private final double discountPercent = 20;

    @Override
    public Bill generateBill(List<MenuItem> menuItemList) {
        double totalCost = menuItemList.stream().mapToDouble(menuItem -> menuItem.getPrice()).sum();
        return Bill.builder()
                .id(UUID.randomUUID().toString())
                .totalCost(totalCost)
                .discount(totalCost * discountPercent / 100)
                .amountToBePaid(totalCost - totalCost * discountPercent / 100)
                .tax((totalCost - totalCost * discountPercent / 100) * 0.05)
                .build();
    }

    @Override
    public boolean isApplicable(CouponCode couponCode) {
        return couponCode == CouponCode.TWENTY_PERCENT_OFF;
    }
}