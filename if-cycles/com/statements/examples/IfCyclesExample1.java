package com.statements.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfCyclesExample1 {

	public static void main(String[] args) throws IOException {
		String descriptionprogram = "Search the score on a scale ECTS!";
		System.out.println(descriptionprogram);

		BufferedReader inputStreamReader = new BufferedReader(new InputStreamReader(System.in));
		String markValue = null;
		String decision = null;
		do {
			System.out.println("Insert your mark:");
			markValue = inputStreamReader.readLine().toString();

			String ecst = getScaleECTS(markValue);
			System.out.println("Your ECST is: " + ecst);

			System.out.print("Do you really want to restart? Y/N");
			decision = inputStreamReader.readLine().toString();
		} while ("Y".equals(decision));
	}

	/**
	 * method for find scale ECTS from mark
	 * @param markValue  the input data for method, means mark for which must be found ECTS 
	 * **/
	public static String getScaleECTS(String markValue) throws IOException {
		String ecst = null;
		try {
			int i = Integer.parseInt(markValue);
			if (i >= 1 && i <= 34) {
				ecst = "F";
			} else if (i >= 35 && i <= 59) {
				ecst = "FX";
			} else if (i >= 60 && i <= 66) {
				ecst = "E";
			} else if (i >= 67 && i <= 74) {
				ecst = "D";
			} else if (i >= 75 && i <= 81) {
				ecst = "C";
			} else if (i >= 82 && i <= 89) {
				ecst = "B";
			} else if (i >= 90 && i <= 100) {
				ecst = "A";
			} else if (i >= 101) {
				System.out.println("Output the mark outside!");
			}
		} catch (NumberFormatException e) {
			System.err.println("Invalid Format!");
		}
		return ecst;
	}
}
