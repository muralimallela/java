/*
 * Author      : Murali Krishna Mallela
 * Roll Number : 21C51A0522
 * Date        : 26/09/2024
 */
public class VarRules {
    public static void main(String[] args) {
        System.out.println("Variable Rules and Naming Conventions in Java:");


        int age = 25;
        double salary = 50000.50;
        String name = "John Doe";
        boolean isEmployed = true;

        System.out.println("\nValid variable declarations:");
        System.out.println("int age = " + age);
        System.out.println("double salary = " + salary);
        System.out.println("String name = \"" + name + "\"");
        System.out.println("boolean isEmployed = " + isEmployed);


        int _count = 10;
        String $currency = "USD";
        final double PI = 3.14159;

        System.out.println("\nValid variable names:");
        System.out.println("int _count = " + _count);
        System.out.println("String $currency = \"" + $currency + "\"");
        System.out.println("final double PI = " + PI);


        String firstName = "Jane";
        String lastName = "Smith";

        System.out.println("\nCamel case (recommended):");
        System.out.println("String firstName = \"" + firstName + "\"");
        System.out.println("String lastName = \"" + lastName + "\"");


        System.out.println("int 123abc = 5;  // Cannot start with a number");

        int a = 1;
        String veryLongVariableNameThatIsHardToRead = "Avoid this";

        System.out.println("\nDemonstrating scope:");
        {
            int x = 5;
            System.out.println("int x = " + x + ";");
        }
        System.out.println("1. Variables must start with a letter, underscore, or dollar sign.");
        System.out.println("2. Subsequent characters can be letters, digits, underscores, or dollar signs.");
        System.out.println("3. Variable names are case-sensitive.");
        System.out.println("4. Cannot use reserved keywords as variable names.");
        System.out.println("5. Use meaningful and descriptive names for variables.");
        System.out.println("6. Follow camelCase convention for variable names.");
        System.out.println("7. Use ALL_CAPS for constants.");
    }
}
