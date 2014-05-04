package com.uphouseworks.demo;

import java.util.Random;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("This is some basic java printing out");
		System.out.println("This is a new feature coming up here!");
		newFeature();
	}
	
	private static void newFeature()
	{
		System.out.println("This is a NEW feature!");
		Random rand = new Random();
	    System.out.println(rand.nextInt(100)+"<- wow, new feature");
	}

}
