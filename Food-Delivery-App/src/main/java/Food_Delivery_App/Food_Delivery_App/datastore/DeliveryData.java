package Food_Delivery_App.Food_Delivery_App.datastore;

import Food_Delivery_App.Food_Delivery_App.model.Delivery;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Getter
public class DeliveryData {
    private Map<String, Delivery> deliveryById = new HashMap<>();
    private Map<String, List<String>> deliveryIdsByDeliveryBoyId = new HashMap<>();
}