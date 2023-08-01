package Bhushan;

import java.util.Arrays;

//1108. Defanging an IP Address

//Given a valid (IPv4) IP address, return a defanged version of that IP address.
//
//A defanged IP address replaces every period "." with "[.]".
//
// 
//
//Example 1:
//
//Input: address = "1.1.1.1"
//Output: "1[.]1[.]1[.]1"

public class DefanginganIPAddress {
	public static void main(String[] args) {
		String addressString="1.1.1.1";
		int[] nums= {12,2,1};
		Arrays.toString(nums);
		
		System.out.println(defangIPaddr(addressString));
		
	}
	
	 public static StringBuilder defangIPaddr(String address) {
		 StringBuilder s1=new StringBuilder();
		 for (char i = 0; i < address.length(); i++) {
			s1.append(address.charAt(i));
			if(address.charAt(i)=='.') {
				s1.append("[.]");
			}
		}
		return s1;
	        
	 }

}
