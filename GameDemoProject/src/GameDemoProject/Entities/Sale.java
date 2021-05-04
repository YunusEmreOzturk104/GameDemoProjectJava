package GameDemoProject.Entities;

public class Sale {
	private int id;
	private String creditNo;
	public Sale(int id, String creditNo) {
		this.id = id;
		this.creditNo = creditNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCreditNo() {
		return creditNo;
	}
	public void setCreditNo(String creditNo) {
		this.creditNo = creditNo;
	}
	
}
