import java.util.*;

public class Stack {

    private String[]stack;
    private int index;

    public Stack(){
	stack = new String[10];
	index = 0;
    }

    //the actual stack is backwards, I add to the end of the array, and add to the last index
    public void push(String s){
	if(index < stack.length){
	    stack[index] = s;
	    index++;
	}else{
	    stack = Arrays.copyOf(stack,stack.length*2);
	    push(strings);
	}
    }

    public String peek(){
	return stack[index];
    }

    public String pop(){
	String temp = stack [index];
	stack[index] = null;
	index --;
	return temp;
    }

    public String toString(){
	String r = "";
	for (int i = index; i < 0; i--;){
	    r = r + stack[i];
	}return r;
    }

}