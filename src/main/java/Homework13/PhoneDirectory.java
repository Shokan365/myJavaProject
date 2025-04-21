package Homework13;
import java.util.*;
public class PhoneDirectory {

        private final Map<String, List<String>> directory = new HashMap<>();

        public void add(String lastName, String phoneNumber) {
            directory.computeIfAbsent(lastName, k -> new ArrayList<>()).add(phoneNumber);
        }

        public List<String> get(String lastName) {
            return directory.getOrDefault(lastName, Collections.emptyList());
        }

        public static void main(String[] args) {
            PhoneDirectory pd = new PhoneDirectory();

            pd.add("Alma", "123-456-7890");
            pd.add("Alikhan", "987-654-3210");
            pd.add("Talgat", "111-222-3333");
            pd.add("Samgat", "444-555-6666");

            System.out.println("\n📞 Alikhan's numbers: " + pd.get("Alikhan"));
            System.out.println("📞 Alma's numbers: " + pd.get("Alma"));
            System.out.println("📞 Talgat's numbers: " + pd.get("Taylor"));
            System.out.println("📞 Unknown: " + pd.get("Samgat"));
        }
    }


