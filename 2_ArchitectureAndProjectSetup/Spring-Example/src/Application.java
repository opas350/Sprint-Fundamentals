import com.opas350.service.CustomerService;
import com.opas350.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {

		CustomerService service = new CustomerServiceImpl();
		
		System.out.println(service.findAll().get(0).getFirstName());
	}

}
