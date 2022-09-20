package fop_1_java;

import java.util.Random;

public class user {

	private String firstName;
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	private String lastName;
	public user(String fname, String lname) {
		this.firstName = fname;
		this.lastName  = lname;
	}
	
	public String dept(int i) throws Exception {
		String dept = null;
		switch (i) {
		case 1:{
			dept = "Technical";
			break;
		}
		case 2:{
			dept = "Admin";
			break;
		}
		case 3:{
			dept = "Human Resource";
			break;
		}
		case 4:{
			dept = "Legal";
			break;
		}
		default:{
			throw new Exception("department invalid");
		}
			
		}
		return dept;
	}
	
	public StringBuffer Password () {
		StringBuffer pre = new StringBuffer();
		for (int i = 0; i < 3; i++) {
			pre = pre.append(String.valueOf(Math.round(Math.random() * 10)));
		}

		String[] spChar = { "!", "@", "#", "$" };
		int index = 0;
		while (true) {
			int indexTemp = (int) Math.round(Math.random() * 10);
			if (indexTemp == 0 || indexTemp == 1 || indexTemp == 2 || indexTemp == 3) {
				index = indexTemp;
				break;
			}

		}
		pre.append(spChar[index]);
		Random rd = new Random();
		char smallLetter = (char) (rd.nextInt(26) + 'a');
		pre.append(smallLetter);

		Random rd1 = new Random();
		char capsLetter1 = (char) (rd1.nextInt(26) + 'A');
		pre.append(capsLetter1);

		Random rd2 = new Random();
		char capsLetter2 = (char) (rd2.nextInt(26) + 'A');
		pre.append(capsLetter2);

		return pre;
	}
}