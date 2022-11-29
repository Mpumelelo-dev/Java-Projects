package com.mpumelelo.books;

import java.util.ArrayList;

public class Books {
private int id;
private String name;
private String author;

ArrayList<Review> reviews = new ArrayList<Review>();

	public ArrayList<Review> getReviews() {
	return reviews;
}

public void setReviews(ArrayList<Review> reviews) {
	this.reviews = reviews;
}
public void addReviews(Review review)
{
this.reviews.add(review);
}

	public Books(int id,String name,String author) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.author=author;
	}
	public String toString()
	{
		return String.format("id : %s,name : %s, author :%s ,Review : [%s]",id,name,author,reviews);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books myObj = new Books(2,"Honey","Lelo");
		myObj.addReviews(new Review(2,"Novel","Good"));
	myObj.addReviews(new Review(2,"textbook","bad"));
		//Review myReview = new Review(2,"Novel","Good");
		System.out.println(myObj);

	}

}
