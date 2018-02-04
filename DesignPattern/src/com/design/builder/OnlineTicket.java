package com.design.builder;

public class OnlineTicket
{ // Making the constructed product immutable by making all fields final
	private final String movieName;
	private final int ticketCount;
	private final int popcornCount;
	private final int drinksCount;
	private final int anim3dGlassCount;

	private OnlineTicket(Builder builder) {
		this.movieName = builder.movieName;
		this.ticketCount = builder.ticketCount;
		this.popcornCount = builder.popcornCount;
		this.drinksCount = builder.drinksCount;
		this.anim3dGlassCount = builder.anim3dGlassCount;
	}
	@Override
	public String toString()
	{
		return "OnlineTicket [movieName=" + movieName + ", ticketCount=" + ticketCount + ", popcornCount=" + popcornCount + ", drinksCount=" + drinksCount + ", anim3dGlassCount=" + anim3dGlassCount + "]";
	}

	// The static builder inner class responsible for constructing our product
	public static class Builder
	{
		private final String movieName;
		private final int ticketCount;
		private int popcornCount;
		private int drinksCount;
		private int anim3dGlassCount;

		// Builder constructor with mandatory fields
		public Builder(String movieName, int ticketCount) {
			this.movieName = movieName;
			this.ticketCount = ticketCount;
		}
		// Setter like builder methods to set the values for optional parameter
		public Builder addDrinksCount(int value)
		{
			this.drinksCount = value;
			return this;
		}
		public Builder addpopcornCount(int value)
		{
			this.popcornCount = value;
			return this;
		}
		public Builder addanim3dGlassCount(int value)
		{
			this.anim3dGlassCount = value;
			return this;
		}
		// The method responsible for returning the fully constructed object
		public OnlineTicket build()
		{
			return new OnlineTicket(this);
		}
	}
}
