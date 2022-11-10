import java.util.*;

public class Task4 {
        public static void main(String[] args) {
            // 4. Последовательность [((())()(())]] - неправильная, чтобы была true нужно второй символ '(' заменить на '['.
            System.out.print("Введите последовательность:");
            Scanner sc = new Scanner(System.in);
            String brackets = "[((())()(())]]";
            String input;
            input = sc.nextLine();
            System.out.println(isValidBrackets(input));
        }
        private static boolean isValidBrackets(String bracketsString) {
            Map<Character, Character> brackets = new HashMap<>();
            brackets.put(')', '(');
            brackets.put(']', '[');

            Deque<Character> stack = new LinkedList<>();
            for(Character c : bracketsString.toCharArray()){
                if(brackets.containsValue(c)){
                    stack.push(c);
                }
                else if(brackets.containsKey(c)){
                    if(stack.isEmpty() || stack.pop() != brackets.get(c)) {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }
}
