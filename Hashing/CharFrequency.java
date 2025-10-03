import java.util.*;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "hello world";
        str = str.replaceAll("\\s", "");
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
