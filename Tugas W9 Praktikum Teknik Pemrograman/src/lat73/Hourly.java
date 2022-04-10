/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lat73;

/**
 *
 * @author Rofa'ul
 */
//********************************************************
//  Hourly.java       Author: Lewis/Loftus
//
//  Represents an employee that gets paid by the hour.
//*******************************************************
public class Hourly extends Employee{
	private int hoursWorked;
	//--------------------------------------------------------
	//  Sets up this hourly employee using the specified information.
	//--------------------------------------------------------
	public Hourly(String eName, String eAddress, String ePhone, String socSecNumber, double rate){
		super(eName,eAddress,ePhone,socSecNumber,rate);	
		hoursWorked = 0;  // bonus has yet to be awarded
	}
	//--------------------------------------------------------
	//  Adds the specified number of hours to this employee's
	//  accumulated hours.
	//--------------------------------------------------------
	public void addHours(int moreHours){
		hoursWorked += moreHours;
	}
	//--------------------------------------------------------
	//  Computes and returns the pay for this hourly employee.
	//--------------------------------------------------------
	public double pay(){
		double payment = payRate * hoursWorked;
		hoursWorked = 0;
		return payment;
	}
	//--------------------------------------------------------
	//  Returns information about this hourly employee as a string.
	//--------------------------------------------------------
	public String toString(){
		String result = super.toString();
		result += "\nCurrent Hours: " + hoursWorked;
		return result;
	}
}