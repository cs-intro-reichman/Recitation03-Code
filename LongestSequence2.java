// Question 2, another version
public class LongestSequence2 {
    public static void main (String[] args) {
        String text = args[0];
        // initialize the longest char to some arbitrary value.
        char longest = ' ';
        int maxLength = 1;
        int curLength = 1;
        // loop over the text, if the current letter is equal to the previous letter, increase curLength, save the
        // maxLength and which letter appears in the longest sequence 
        for (int i = 1 ; i < text.length() ; i++) {
            char curChar = text.charAt(i);
            char prevChar = text.charAt(i-1);
            if (curChar == prevChar) {
            curLength++;
            } else {
            curLength = 1;	
            }
            if (curLength > maxLength) {
            maxLength = curLength;
            longest = text.charAt(i);
            }
        }	

        // print the longest sequence
        System.out.print("The longest sequence of identical letters is : ");
        for (int j = 0; j < maxLength; j++) {
            System.out.print(longest);
        }
        System.out.println(); // convention 

    }
}
        
