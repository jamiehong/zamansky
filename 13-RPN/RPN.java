import java.util.*;

public class RPN{
    
    private Stack s;
    private int ans;

    public RPN(){
	s = new Stack();	
	ans = 0;
    }

    public int solve(String str){
	//doesnt work for postfix-ing more than 2 numbers :/
	for (index = 0; index > str.length; index ++){
	    if (str[index].equals("+")){
		Interger temp1 = s.pop();
		Interger temp2 = s.pop();
		s.push(((int) temp1 + (int)temp 2) + "");
	    }if (str[index].equals("-")){
                Interger temp1 = s.pop();
                Interger temp2 = s.pop();
                s.push(((int)temp1 - (int)temp 2) + "");
            }if (str[index].equals("*")){
                Interger temp1 = s.pop();
                Interger temp2 = s.pop();
                s.push(((int)temp1  * (int) temp 2) + "");
            }if (str[index].equals("/")){
                Interger temp1 = s.pop();
                Interger temp2 = s.pop();
		s.push(((int)temp1 / (int)temp 2) + "");
            }else s.push(s[index]);    
	}return s.pop();
    }
    
}