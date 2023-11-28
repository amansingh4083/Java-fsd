package practiceprojectasssisted;
import java.util.HashMap;
import java.util.Map;


public class MapVarification {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a HashMap
        Map<String, Integer> studentScores = new HashMap<>();
        // Add key-value pairs
        studentScores.put("Alice", 90);
        studentScores.put("Bob", 85);
        studentScores.put("Charlie", 95);
        // Display the map
        System.out.println("Student Scores: " + studentScores);
        // Access values using keys
        int bobScore = studentScores.get("Bob");
        System.out.println("Bob's Score: " + bobScore);
        // Check if a key exists
        String studentName = "Alice";
        if (studentScores.containsKey(studentName)) {
            System.out.println(studentName + "'s score is present.");
        } else {
            System.out.println(studentName + "'s score is not present.");
        }
        // Update a value
        studentScores.put("Alice", 92);
        System.out.println("Updated Student Scores: " + studentScores);
        // Remove a key-value pair
        studentScores.remove("Charlie");
        System.out.println("After Removing Charlie's Score: " + studentScores);
        // Iterate through the map
        System.out.println("Iterating through the map:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        // Clear the map
        studentScores.clear();
        System.out.println("Map after clearing: " + studentScores);

	}

}
