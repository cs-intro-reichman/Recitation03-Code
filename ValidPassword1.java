// Question 3 
public class ValidPassword1 {
    public static void main (String[] args) {
        String password = args[0];	
        boolean valid = isValid(password);
    
        if (valid) {
            System.out.println("the password is valid");
        } else {
            System.out.println("the password is not valid");
        }
    }
    //Receives a String pass and returns if its a valid password
    public static boolean isValid(String pass){

        boolean len = pass.length() >= 6;
        boolean capital = false;
        boolean small = false;
        boolean digit = false;

        if (!len){
	   	    return false;
        }
        for (int i=0; i < pass.length(); i++){
            if (!small && pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z') {
                small = true;
            }
            if (!capital && pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z') {
                capital = true;
            }
            if (!digit && pass.charAt(i) >= '0' && pass.charAt(i) <= '9') {
                digit = true;
            }
        }
        return (capital && small && digit);
    } 

    
}
