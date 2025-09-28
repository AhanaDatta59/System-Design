package Food_Delivery_App.Food_Delivery_App.commands;

import Food_Delivery_App.Food_Delivery_App.exceptions.ExceptionType;
import Food_Delivery_App.Food_Delivery_App.exceptions.FoodDeliveryException;
import Food_Delivery_App.Food_Delivery_App.model.Order;
import Food_Delivery_App.Food_Delivery_App.model.enums.OrderCommandType;
import lombok.NonNull;

public abstract class OrderCommandExecutor {
    public void execute(@NonNull final Order order) {
        if (!isValid(order)) {
            throw new FoodDeliveryException(ExceptionType.ORDER_NOT_VALID, "order not valid");
        }
        executeCommand(order);
    }

    public abstract boolean isValid(final Order order);

    public abstract void executeCommand(final Order order);

    public abstract boolean isApplicable(final OrderCommandType orderCommandType);
}