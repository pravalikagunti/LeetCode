import java.util.HashMap;
import java.util.Map;

public class ReverseString {

	public static void main(String args[]) {
		ReverseString r=new ReverseString();
		char[] s= {'h','e'};
		StringBuilder s1=new StringBuilder("123");
		s1.reverse();
		
		r.reverseString(s);
	}	
	 public void reverseString(char[] s) {
	        char k;
	        for(int i=0;i<s.length/2;i++){
	            
	            s[i]=(char) (s[s.length-i-1]+s[i]);
	            s[s.length-i-1]=(char) (s[i]-s[s.length-i-1]);
	            s[i]=(char) (s[i]-s[s.length-i-1]);
	        }
	    }
	    public void reverseString1(char[] s) {
	        char k;
	        for(int i=0;i<s.length/2;i++){
	            k=s[i];
	            s[i]=s[s.length-i-1];
	            s[s.length-i-1]=k;
	        }
	        Map<Integer,String> m=new HashMap<>();
	    }
}
