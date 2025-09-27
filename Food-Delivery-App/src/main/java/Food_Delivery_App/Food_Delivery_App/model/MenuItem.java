package Food_Delivery_App.Food_Delivery_App.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Builder
@Getter
@ToString
public class MenuItem {
    private String id;
    private String itemName;
    private CuisineType cuisineType;
    private MealType mealType;
    private double price;
}