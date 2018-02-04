package com.design.Template;

public class TemplatePatternDemo
{
	public static void main(String[] args)
	{
		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Footbal();
		game.play();
	}
}
