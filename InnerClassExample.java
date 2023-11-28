package practiceprojectasssisted;
class OuterClass {
    private int outerVar = 10;

    // Inner class
    class InnerClass {
        void display() {
            System.out.println("Inner class method: " + outerVar);
        }
    }

    // Method to create and use the inner class
    void useInnerClass() {
        InnerClass innerObj = new InnerClass();
        innerObj.display();
    }
}

public class InnerClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Create an instance of the outer class
        OuterClass outerObj = new OuterClass();

        // Call the method to use the inner class
        outerObj.useInnerClass();

	}

}
