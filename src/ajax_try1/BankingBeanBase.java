package ajax_try1;

public abstract class BankingBeanBase {
	 public String customerId, password;
	  public Customer customer;

	  public String getCustomerId() {
	    return(customerId);
	  }

	  public void setCustomerId(String customerId) {
	    this.customerId = customerId;
	  }

	  public String getPassword() {
	    return(password);
	  }

	  public void setPassword(String password) {
	    this.password = password;
	  }
	  
	  public Customer getCustomer() {
	    return(customer);
	  }

	  public abstract String showBalance();
	}

