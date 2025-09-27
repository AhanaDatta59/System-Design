package Food_Delivery_App.Food_Delivery_App.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.parsing.Location;

@AllArgsConstructor
@Builder
@Getter
@ToString
public class Address {
    private String id;
    private String streetAddress;
    private String city;
    private String zipCode;
    private Location location;
}