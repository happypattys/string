import java.util.Scanner; 

public class stringmethods {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine(); 

        System.out.println("\n String Operations");

        
        int length = inputString.length();
        System.out.println("1. Length of the string: " + length);

        
        String upperCaseString = inputString.toUpperCase();
        System.out.println("2. String in uppercase: " + upperCaseString);

        
        String lowerCaseString = inputString.toLowerCase();
        System.out.println("3. String in lowercase: " + lowerCaseString);

        
        if (length > 0) {
            
            char firstChar = inputString.charAt(0);
            System.out.println("4. First character: " + firstChar);

            
            char lastChar = inputString.charAt(length - 1);
            System.out.println("5. Last character: " + lastChar);

            
            if (length >= 5) { 
                String subString = inputString.substring(1, 5);
                System.out.println("6. Substring from second to fifth character: " + subString);
            } else {
                System.out.println("6. String is too short to extract substring from second to fifth character.");
            }
        } else {
            System.out.println("String is empty. Cannot perform character/substring operations.");
        }

        
        scanner.close();
    }
}
