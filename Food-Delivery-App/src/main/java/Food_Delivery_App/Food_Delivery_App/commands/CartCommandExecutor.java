package Food_Delivery_App.Food_Delivery_App.commands;

import Food_Delivery_App.Food_Delivery_App.exceptions.ExceptionType;
import Food_Delivery_App.Food_Delivery_App.exceptions.FoodDeliveryException;
import Food_Delivery_App.Food_Delivery_App.model.enums.CartCommandType;
import lombok.NonNull;

public abstract class CartCommandExecutor {
    public void execute(@NonNull final String userId, @NonNull final String restaurantId,
                        @NonNull final String itemId) {
        if (!isValid(userId, restaurantId, itemId)) {
            throw new FoodDeliveryException(ExceptionType.MENU_ITEM_NOT_FOUND, "menu item not found");
        }
        executeCommand(userId, restaurantId, itemId);
    }

    public abstract boolean isValid(final String userId, final String restaurantId, final String itemId);

    public abstract void executeCommand(final String userId, final String restaurantId, final String itemId);

    public abstract boolean isApplicable(final CartCommandType cartCommandType);

}