package Food_Delivery_App.Food_Delivery_App.datastore;

import Food_Delivery_App.Food_Delivery_App.model.Order;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Getter
public class OrderData {
    private Map<String, Order> orderById = new HashMap<>();
    private Map<String, List<String>> orderIdsByUserId = new HashMap<>();

}