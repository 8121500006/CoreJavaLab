//package com.test;

import static java.lang.System.out;

class Entry
{
 public static void main(String[] args)
 {
  out.println("Employ details");
  Employ e = null;
  Date d=null;
  d=new Date(22,10,1995);
  e = new Employ("ABC","DEF",22344,"A",d);
  e.displayDetails();
  d=new Date(22,10,1995);
  e = new Employ("GHI","JKL",22344,"A",d);
  e.displayDetails();
  d=new Date(22,10,2015);
  e = new Employ("MNO","PQR",22344,"A",d);
  e.displayDetails();
  d=new Date(22,10,2014);
  e = new Employ("STU","VWX",22344,"A",d);
  e.displayDetails();		
 }
}







