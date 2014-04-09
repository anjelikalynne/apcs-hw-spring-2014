import java.io.*;
import java.util.*;

public class RPN {
    private MyStackArray pancakes;

    public RPN {
	pancakes = new MyStackArray();
    }

    //from Devendra's code
    public boolean isValidOp(){
	String[] ops = {"+", "-", "*", "/", "%"}; 
	//"pow", "sqrt", "abs", "log", "ln", "sin", "cos", "tan", "clear", "off"
	for (String str: ops){
	    if (s.equals(str))
		return true;
	}
	return false;
    }


}