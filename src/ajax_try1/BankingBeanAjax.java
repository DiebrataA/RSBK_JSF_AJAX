package ajax_try1;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class BankingBeanAjax extends BankingBeanBase {
	
	private String message = "";
	public String getMessage() {
		return(message);
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	public String showBalance() {
		if (!password.equals("secret")) {
			message = "Incorrect password";
		} else {
			CustomerLookupService service = new CustomerSimpleMap();
			customer = service.findCustomer(customerId);
			if (customer == null) {
				message = "Unknown customer";
			} else {
				message = String.format("Balance for %s %s is $%,.2f",
						customer.getFirstName(),
						customer.getLastName(),
						customer.getBalance());
			}
		}
		return(null);
	}
}
