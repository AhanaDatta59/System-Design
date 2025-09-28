package Food_Delivery_App.Food_Delivery_App.services;

import Food_Delivery_App.Food_Delivery_App.model.Bill;
import Food_Delivery_App.Food_Delivery_App.model.MenuItem;
import Food_Delivery_App.Food_Delivery_App.model.enums.CouponCode;
import Food_Delivery_App.Food_Delivery_App.stratergy.PricingStrategy;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PricingService {
    private List<PricingStrategy> pricingStrategyList;
    private CartService cartService;

    @Autowired
    public PricingService(List<PricingStrategy> pricingStrategyList, CartService cartService) {
        this.pricingStrategyList = pricingStrategyList;
        this.cartService = cartService;
    }

    public Bill getBill(@NonNull final String userId, @NonNull final String restaurantId,
                        @NonNull final CouponCode couponCode) {
        List<MenuItem> menuItemList = cartService.getAllItemsOfCart(userId, restaurantId);
        return pricingStrategyList.stream().filter(pricingStrategy -> pricingStrategy.isApplicable(couponCode))
                .findAny().get().generateBill(menuItemList);
    }
}