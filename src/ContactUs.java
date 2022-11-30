import java.util.ArrayList;
import src.model.ContactFormModel;

public class ContactUs {
	
	List<ContactFormModel> listOfContactForms = new ArrayList<>();
	
	public Boolean contactUs(ContactFormModel contactForm) {
		try {
			listOfContactForms.add(contactForm);
		}catch (Exception e) {
			return false;
		}
		return true;
	}

}
