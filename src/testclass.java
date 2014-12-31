
public class testclass {

	private String [] [] product;
	private int quantity;
	private String companyName;

	/**
	 * 
	 */
	public testclass() {
		// TODO Auto-generated constructor stub
		quantity=0;
	}

	/**
	 * @param args
	 */
	public void setQuantity(Integer i) {
	
		quantity=i;
		
	}
	
	/**
	 * @param args
	 */
	public Integer getQuantity() {
	
		return quantity;
		
	}	

	/**
	 * @param args
	 */
	public void companyName(String i) {
	
		companyName=i;
		
	}
	
	/**
	 * @param args
	 */
	public String companyName() {
	
		return companyName;
		
	}	
	
}
