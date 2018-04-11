package ds.stack;

public class App {
    public static void main(String[] args) {

        System.out.println(reverseString("olleH"));

    }

    public static String reverseString(String str) {
        int stackSize = str.length();
        Stack theStack = new Stack(stackSize);
        String result = "";

        // Add each character in string to stack.

        for (int i = 0; i < str.length(); i++) { // Asymptotic notation = O(n) Linear Growth rate.
            char ch = str.charAt(i);
            theStack.push(ch);
        }

        // Append the resulting string from the last character to the first
        while (!theStack.isEmpty()) {
            char ch = theStack.pop();
            result += ch;
        }


        return result;
    }
}
