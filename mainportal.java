package fop_1_java;

import java.util.ArrayList;
import java.util.Scanner;

public class mainportal {

	public static void main(String[] args) throws Exception {

		StringBuffer str = new StringBuffer();

		user emp = new user("arnav", "shil");
		str.append(emp.getFirstName());
		String lstName = emp.getLastName();
		str.append(lstName.concat("@"));
		Scanner sc = new Scanner(System.in);
		System.out.println("please select departments:");
		System.out.println("(1:Technical, 2:Admin, 3:Human Resource, 4:Legal)");
		str.append(emp.dept(sc.nextInt()).concat(".greatlearning.com"));
		
		
		System.out.println("Password --->"+ emp.Password());
	}

}