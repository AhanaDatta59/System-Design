package Food_Delivery_App.Food_Delivery_App.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Builder
@Getter
@ToString
public class Bill {
    private String id;
    private double totalCost;
    private double discount;
    private double tax;
    private double amountToBePaid;
}