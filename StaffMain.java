package com.gl.caseStudy1;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StaffMain {
	 public static Double totalCalculation (Applicant applicant) {
		 Double m1=applicant.getSubject1Mark();
		 Double m2=applicant.getSubject2Mark();
		 Double m3=applicant.getSubject3Mark();
		 if (m1<50 || m2<50 || m3<50) {
			 return 0.0;
		 }
		 else {
			 Double total=m1+m2+m3;
			 return total;
		 }
	 }
	 
	 public static Double percentageCalculation (Double total) {
		 Double per= (total/300)*100;
		 DecimalFormat df = new DecimalFormat("0.00");
		 String persentage=df.format(per);
		 return Double.parseDouble(persentage) ;
	 }
}