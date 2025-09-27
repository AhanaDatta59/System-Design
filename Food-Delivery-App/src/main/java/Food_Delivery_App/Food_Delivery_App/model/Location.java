package Food_Delivery_App.Food_Delivery_App.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Builder
@Getter
@ToString
public class Location {
    private double longitude;
    private double latitude;
}