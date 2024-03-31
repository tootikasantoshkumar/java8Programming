package different.type.programming;

import java.util.Stack;

public class ParanthesisChecker {
    public static void main(String[] args) {
        String str="{[]}({})[]";//
        Stack<Character> stack= new Stack<>();
        for (int i =0;i<str.length();i++){
            if(str.charAt(i)=='{' || str.charAt(i)=='['|| str.charAt(i)=='(')
                stack.push(str.charAt(i));
            else if (!stack.empty() && (
                    (str.charAt(i)=='}' && stack.peek()=='{')
                    || (str.charAt(i)==']' && stack.peek()=='[')
                    ||  (str.charAt(i)==')' && stack.peek()=='(')
                    )
            )
                stack.pop();
            else
               stack.push(str.charAt(i));

        }
        if(stack.empty())
            System.out.println("balanced");
        else
            System.out.println("NOT balanced");
    }
}
