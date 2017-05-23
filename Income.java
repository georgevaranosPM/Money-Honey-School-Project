

public class Income {

	private String in_tag;
	private double in_amount;
	private boolean monthly;
	private boolean taxed;
	


	public Income(String in_tag, double in_amount, boolean monthly, boolean taxed) {
		super();
		this.in_tag = in_tag;
		this.in_amount = in_amount;
		this.monthly = monthly;
		this.taxed = taxed;
	}



	public String getIn_tag() {
		return in_tag;
	}



	public void setIn_tag(String in_tag) {
		this.in_tag = in_tag;
	}



	public double getIn_amount() {
		return in_amount;
	}



	public void setIn_amount(double in_amount) {
		this.in_amount = in_amount;
	}
	
	

} 