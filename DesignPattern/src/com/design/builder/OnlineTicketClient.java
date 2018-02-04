package com.design.builder;

import com.design.builder.OnlineTicket.Builder;

public class OnlineTicketClient
{
	public static void main(String[] args)
	{
		// Creating a builder object by passing the parameters
		Builder builder = new Builder("shawshank redemption ", 3);
		// Using the setter like methods for setting the optional parameters and
		// invoke build() to get the fully constructed object
		// we are purposefully omitting drinks count
		OnlineTicket onlineTicketBooked = builder.addpopcornCount(3).addanim3dGlassCount(3).addpopcornCount(3).build();
		System.out.println("The details of the online ticket `booked are " + onlineTicketBooked);
	}
}
