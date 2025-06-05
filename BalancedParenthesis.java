import java.util.*;
public class Main
{
    static boolean arebalanced(String arr)
    {
        Deque<Character> stack=new ArrayDeque<Character>();
        for(int i=0;i<arr.length();i++)
        {
            char x=arr.charAt(i);
            if(x=='[' || x=='(' || x=='{')
            {
                stack.push(x);
            }
            if(stack.isEmpty())
            {
                return false;
            }
            char check;
            switch(x)
            {
                case '}':
                    check=stack.pop();
                    if(check=='(' || check=='[')
                    return false;
                    break;
                case ']':
                    check=stack.pop();
                    if(check=='{' || check=='(')
                    return false;
                    break;
                case ')':
                    check=stack.pop();
                    if(check=='[' || check=='{')
                    return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    if(arebalanced(str))
	    {
	        System.out.println("true");
	    }
	    else{
	        System.out.println("false");
	    }
	}
}
