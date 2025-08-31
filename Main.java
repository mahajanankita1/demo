class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        // Example subtraction
        int result = subtract(10, 5);
        System.out.println("Subtraction result: " + result);

        // Example addition
        int sum = add(10, 5);
        System.out.println("Addition result: " + sum);
    }

    // Method to perform subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Method to perform addition
    public static int add(int a, int b) {
        return a + b;
    }
}
