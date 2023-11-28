package practiceprojectasssisted;

public class ConstructorTypesDemo {
	// Default Constructor
    public ConstructorTypesDemo() {
        System.out.println("Default Constructor called.");
    }
    // Parameterized Constructor
    public ConstructorTypesDemo(String message) {
        System.out.println("Parameterized Constructor called with message: " + message);
    }
    // Copy Constructor
    public ConstructorTypesDemo(ConstructorTypesDemo other) {
        System.out.println("Copy Constructor called. Copied message from another instance: " + other.getMessage());
    }
    // Getter method to retrieve a message
    public String getMessage() {
        return "Hello from ConstructorTypesDemo!";
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating instances using different constructors
        ConstructorTypesDemo defaultConstructorObj = new ConstructorTypesDemo();
        ConstructorTypesDemo parameterizedConstructorObj = new ConstructorTypesDemo("Hello, parameterized constructor!");
        ConstructorTypesDemo originalObj = new ConstructorTypesDemo("Original message");
        ConstructorTypesDemo copyConstructorObj = new ConstructorTypesDemo(originalObj);

        // Accessing a method to retrieve a message
        System.out.println("Message from originalObj: " + originalObj.getMessage());

	}

}
