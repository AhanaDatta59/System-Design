package Food_Delivery_App.Food_Delivery_App.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Builder
@ToString
public class User {
    private String id;
    private String name;
    private long phoneNo;
    private Address address;
}