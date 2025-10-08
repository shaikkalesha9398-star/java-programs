package JavaPrograms;

// Define the public class named Count_Words_In_String
public class Count_Words_In_String 
{
    // Main method - program execution starts here
    public static void main(String[] args) 
    {
        // Input string - the string from which we will count words
        String str = "Automation testing is interesting ";

        // Remove any extra spaces at the beginning and end of the string,
        // and then split the string into words wherever one or more spaces occur
        String[] words = str.trim().split("\\s+");

        // Store the number of words by finding the length of the array
        int wordCount = words.length;

        // Print the total number of words to the console (printed using System.err for highlighting)
        System.err.println("Number of words in the string: " + wordCount);	        

        // Use a for-each loop to iterate through each word in the array
        for (String word : words) 
        {
            // Print each word in the string
            System.out.println(word);
        }
    }
}