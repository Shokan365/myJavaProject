package Homework13;
import java.util.*;
public class Main {



        public static void main(String[] args) {
            String[] words = {
                    "apple", "banana", "apple", "orange", "grape",
                    "banana", "kiwi", "melon", "apple", "peach",
                    "grape", "lemon", "kiwi", "banana", "plum"
            };

            Map<String, Integer> wordCount = new HashMap<>();

            for (String word : words) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }

            System.out.println("📋 Unique words:");
            for (String word : wordCount.keySet()) {
                System.out.println(word);
            }

            System.out.println("\n📊 Word frequency:");
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }


