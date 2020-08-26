/*Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

 

Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"*/

public class deFangIPAddress {

	public static void main(String[] args) {
		System.out.println(defangIPaddr("255.100.50.0"));
	}
	 public static String defangIPaddr(String address) {
		 return address.replace(".", "[.]");
		    
		   
		   /* String resultAddress="";
		    char address1[]=address.toCharArray();
	        for (int i = 0; i < address1.length; i++) {
	          if (address1[i] == '.')
	            resultAddress += "[.]";
	          else
	            resultAddress += address1[i];
	        }
	        System.out.println(resultAddress);
	        return resultAddress;
	    */
		    }
}
