package com.statements.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhileCyclesExample1 {
	
	public static void main(String[] args) throws IOException {
		System.out.println("Output numbers in descending order!");	
     try{
		BufferedReader inputStreamReader = new BufferedReader(new InputStreamReader(System.in));
		int primaryNumberValue = 0;
		String decision = null;
		do {
			System.out.println("Insert primary number:");			
			primaryNumberValue = Integer.parseInt(inputStreamReader.readLine());
			System.out.println("Numbers in descrending: ");
			printNumbersInDescending(primaryNumberValue);

			System.out.print("Do you really want to restart? Y/N");
			decision = inputStreamReader.readLine().toString();
		} while ("Y".equals(decision));
		
 	} catch (NumberFormatException nfe) {
		System.err.println("Invalid Format!");
 	}
	}

	public static void printNumbersInDescending(int primaryNumberValue) {
			while(primaryNumberValue >= 0)
			{
				System.out.println(" " + primaryNumberValue-- + ";");
			}
	}
}
