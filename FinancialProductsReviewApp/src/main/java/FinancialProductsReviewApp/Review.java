package FinancialProductsReviewApp;

import java.util.List;

public class Review {
	private int reviewid;
	private String review_text;
	private String financial_Product_reviewed;
	private List<Comment> comments;
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Review(int reviewid, String review_text, String financial_Product_reviewed, List<Comment> comments) {
		super();
		this.reviewid = reviewid;
		this.review_text = review_text;
		this.financial_Product_reviewed = financial_Product_reviewed;
		this.comments = comments;
	}
	public int getReviewid() {
		return reviewid;
	}
	public void setReviewid(int reviewid) {
		this.reviewid = reviewid;
	}
	public String getReview_text() {
		return review_text;
	}
	public void setReview_text(String review_text) {
		this.review_text = review_text;
	}
	public String getFinancial_Product_reviewed() {
		return financial_Product_reviewed;
	}
	public void setFinancial_Product_reviewed(String financial_Product_reviewed) {
		this.financial_Product_reviewed = financial_Product_reviewed;
	}
	public List<Comment> getComments() {
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	

}
