package exercises;

import java.util.HashMap;
import java.util.Map;

public class BalancedWordsCounter {
    public static Integer count(String input) throws Exception {
        if (input == null) {
            throw new Exception("Input can not be null");
        }

        int cot = 0;
        for (int i = 0; i <= input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                if (isBalanced(input.substring(i, j))) {
                    cot++;
                }
            }
        }

        return cot;
    }

    private static boolean isBalanced(String a) throws Exception {
        if (a.isEmpty()) return false;
        HashMap<Character, Integer> letters = new HashMap<Character, Integer>();
        for (int i = 0; i < a.length(); i++) {
            Character c = a.charAt(i);
            if (!Character.isLetter(c)) {
                throw new Exception("String contains non letter characters");
            }
            if (letters.containsKey(c)) {
                letters.put(c, letters.get(c) + 1);
            } else {
                letters.put(c, 1);
            }
        }
        int sample = letters.get(a.charAt(0));
        for (Map.Entry<Character, Integer> set : letters.entrySet()) {
            if (set.getValue() != sample) return false;
        }
        return true;
    }
}
