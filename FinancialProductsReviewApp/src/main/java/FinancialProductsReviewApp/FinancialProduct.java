package FinancialProductsReviewApp;

public class FinancialProduct {
	private int financial_productid;
	private String financial_product_name;
	private String description;
	private int rating;
	private Review review;
	public int getFinancial_productid() {
		return financial_productid;
	}
	public void setFinancial_productid(int financial_productid) {
		this.financial_productid = financial_productid;
	}
	public String getFinancial_product_name() {
		return financial_product_name;
	}
	public void setFinancial_product_name(String financial_product_name) {
		this.financial_product_name = financial_product_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Review getReview() {
		return review;
	}
	public void setReview(Review review) {
		this.review = review;
	}
	public FinancialProduct(int financial_productid, String financial_product_name, String description, int rating,
			Review review) {
		super();
		this.financial_productid = financial_productid;
		this.financial_product_name = financial_product_name;
		this.description = description;
		this.rating = rating;
		this.review = review;
	}
	public FinancialProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}