package GameDemoProject.Entities;

public class Campaign {
	private int id;
	private String Name;
	private String detail;
	private double discount;
	public Campaign(int id, String name, String detail, double discount) {
		this.id = id;
		Name = name;
		this.detail = detail;
		this.discount = discount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	

}
