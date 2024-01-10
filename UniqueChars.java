/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        // Replace the following statement with your code
        /**
         * string letters, if letter in length i deslnt exist in letters, add it to letters
         * and add it to new string
         * if it exists, dont add it to new string
         * return new string
         */

         String letters = "";
         String newString = "";

         for(int i = 0; i < s.length(); i++)
         {  
            char temp = s.charAt(i);
            if(letters.indexOf(temp) == -1 && temp != ' ')
            {
                letters += temp;
                newString += temp;
            }
            else if(temp == ' ')
                    newString+= ' ';
         }

        return newString;

    }
}
