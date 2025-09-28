package Food_Delivery_App.Food_Delivery_App.datastore;

import Food_Delivery_App.Food_Delivery_App.model.User;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Getter
public class UserData {
    private Map<String, User> userById = new HashMap<>();
}
