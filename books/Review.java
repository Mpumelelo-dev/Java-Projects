package com.mpumelelo.books;

public class Review {
	private int id;
	private String descr;
	private String rating;
	public Review(int id,String descr,String rating)
	{
		this.id = id;
		this.descr=descr;
		this.rating=rating;
	}
public String toString()
{
	return String.format("id : %s ,descr: %s, rating :%s ",id,descr,rating);
}

}
