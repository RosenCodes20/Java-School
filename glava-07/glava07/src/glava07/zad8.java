package glava07;

import java.util.HashMap;
import java.util.Map;

public class zad8 {
	public static void main(String[] args) {
        int[] array = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int mostFrequentElement = array[0];
        int maxCount = 0;
        
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentElement = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println("Най-често срещаният елемент е: " + mostFrequentElement);
    }
}
