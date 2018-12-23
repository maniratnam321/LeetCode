package solution;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntegerSolution {
    public int romanToInt(String s) {

        Map<Character, Integer> romanToIntegerMap = new HashMap<>();
        romanToIntegerMap.put('I', 1);
        romanToIntegerMap.put('V', 5);
        romanToIntegerMap.put('X', 10);
        romanToIntegerMap.put('L', 50);
        romanToIntegerMap.put('C', 100);
        romanToIntegerMap.put('D', 500);
        romanToIntegerMap.put('M', 1000);

        int value = 0;

        char[] input = s.toCharArray();

        for(int i = 0; i < input.length; i++) {
            if (i == input.length - 1) {
                value += romanToIntegerMap.get(input[i]);
                break;
            }
            if (input[i] == 'I' && input[i + 1] == 'V') {
                value += 4;
                i++;
            } else if (input[i] == 'I' && input[i + 1] == 'X') {
                value += 9;
                i++;
            } else if (input[i] == 'X' && input[i + 1] == 'L') {
                value += 40;
                i++;
            } else if(input[i] == 'X' && input[i + 1] == 'C') {
                value += 90;
                i++;
            } else if(input[i] == 'C' && input[i + 1] == 'D') {
                value += 400;
                i++;
            } else if(input[i] == 'C' && input[i + 1] == 'M') {
                value += 900;
                i++;
            } else {
                value += romanToIntegerMap.get(input[i]);
            }
        }
        return value;
    }
}
