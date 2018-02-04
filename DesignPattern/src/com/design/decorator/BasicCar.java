package com.design.decorator;

public class BasicCar implements Car
{
	@Override
	public void assemble()
	{
		System.out.print("Basic Car.");
	}
}
