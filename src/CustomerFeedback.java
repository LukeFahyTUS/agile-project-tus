import java.util.Map;

public class CustomerFeedback {
   Map<String,String> customerFeedbackMap= new HashMap<>();
   
   public Boolean sendFeedback(CustomerFeedbackModel feedback) {
	 return   customerFeedbackMap.put(feedback.customerId, feedback.customerFeedback);
   }
}
