//package com.test;

public class Date 
{
 private int day; 
 private int month;
 private int year;

 public  Date(int da,int mo,int ye)
 {
  this.day=da;
  this.month=mo;
  this.year=ye;	
 }
 
 public String toString() 
 {
  return String.format(day + "-" + month + "-" +year);
 }
}
