// Question 2 
public class LongestSequence1 {
    public static void main (String[] args) {
        String text = args[0];
        // initialize the longest char to some arbitrary value.
        char longest = ' ';
        char curChar = text.charAt(0);
        int maxLength = 0;
        int curLength = 0;
        // loop over the text, for each letter find how many times it appears consecutively
        // then decide which letter appears in the longest sequence and how many times.
        for (int i = 0 ; i < text.length() ; i++) {
            char chr = text.charAt(i); 
            boolean flag = false;
            if (chr == curChar) {
                curLength++;
            } else {
                flag = true;	
            }
            if (curLength > maxLength) {
                maxLength = curLength;
                longest = chr;
            }
            curLength = !flag ? curLength : 1; 
            curChar = !flag ? chr : text.charAt(i); 
        }	
        
        // print the longest sequence
        System.out.print("The longest sequence of identical letters is : ");
        for (int j = 0; j < maxLength; j++) {
            System.out.print(longest);
        }
        System.out.println(); // convention 
    }
}
        
