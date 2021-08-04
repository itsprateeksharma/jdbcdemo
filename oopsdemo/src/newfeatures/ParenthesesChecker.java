package newfeatures;

import java.util.Stack;

public class ParenthesesChecker {
 
    public static void main(String[] args) {
 
    	public boolean isValid(String s) {
    		 
    	    Stack st = new Stack<>();
    	 
    	    for(int i = 0; i < s.length(); i++) {
    	 
    	        Character ch = s.charAt(i);
    	 
    	      
    	 
    	       if(!st.isEmpty() && ch == ')' && st.peek() == '(') {
    	             st.pop();
    	 
    	       
    	 
    	        } else {
    	              st.push(ch);
    	        }
    	 
    	    }
    	 
    	    if(st.isEmpty()) {
    	       return true;
    	    } 
    	 
    	     return false;        
    	 
   }
}