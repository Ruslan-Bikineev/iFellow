package ifellow;

import java.util.HashMap;

public class Task2 {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String word = "Hello";
        for (int i = 0; i < word.length(); i++) {
            if (map.containsKey(word.charAt(i))) {
                map.put(word.charAt(i), map.get(word.charAt(i)) + 1);
            } else {
                map.put(word.charAt(i), 1);
            }
        }
        map.forEach((key, value) -> {
            if (value > 1) {
                System.out.println(key);
            }
        });
    }
}
