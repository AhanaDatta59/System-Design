package Food_Delivery_App.Food_Delivery_App.exceptions;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FoodDeliveryException extends RuntimeException {
    private ExceptionType exceptionType;
    private String message;
}