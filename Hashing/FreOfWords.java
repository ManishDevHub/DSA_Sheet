import java.util.*;
public class FreOfWords {

    

    public static void main(String[] args) {
        String str = "java is great and java is powerful";

     
        String[] words = str.split(" ");

        HashMap<String, Integer> freqMap = new HashMap<>();

        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
 
    

