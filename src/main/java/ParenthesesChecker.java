import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ParenthesesChecker {

    private String testString;
    private Stack<Character> stack;

    private List<Character> openingParentheses =  Arrays.asList('(', '<', '{','[');
    private List<Character> closingParentheses =  Arrays.asList(')', '>', '}',']');



    public boolean checkParentheses(String testString){
        stack = new Stack<Character>();

        for (int i = 0; i < testString.length(); i++){
            if (testString.charAt(i) == openingParentheses.get(0) || testString.charAt(i) == closingParentheses.get(0)){
                stack.push(testString.charAt(i));
            }
        }

        if (stack.size() % 2 != 0){
            return false;
        }

        for (int i = 0; i < stack.size(); i++) {
            if (stack.peek() == closingParentheses.get(0)) {
                stack.pop();
            } else {
                return false;
            }


            if (stack.peek() == openingParentheses.get(0)) {
                stack.pop();
            }

        }




        return false;
    }

}
