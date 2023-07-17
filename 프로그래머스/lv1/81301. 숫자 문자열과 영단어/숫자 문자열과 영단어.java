import java.util.HashMap;

public class Solution {
    public static int solution(String s) {
        HashMap<String, Integer> numberMap = createNumberMap();
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                result.append(ch);
            } else {
                sb.append(ch);
                if (numberMap.containsKey(sb.toString())) {
                    result.append(numberMap.get(sb.toString()));
                    sb.setLength(0);
                }
            }
        }
        
        return Integer.parseInt(result.toString());
    }
    
    private static HashMap<String, Integer> createNumberMap() {
        HashMap<String, Integer> numberMap = new HashMap<>();
        numberMap.put("zero", 0);
        numberMap.put("one", 1);
        numberMap.put("two", 2);
        numberMap.put("three", 3);
        numberMap.put("four", 4);
        numberMap.put("five", 5);
        numberMap.put("six", 6);
        numberMap.put("seven", 7);
        numberMap.put("eight", 8);
        numberMap.put("nine", 9);
        return numberMap;
    }
    
    public static void main(String[] args) {
        String s = "1zerotwozero3";
        int result = solution(s);
        System.out.println(result);
    }
}
