/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg736030_midterm_mads3464;



/**
 *
 * @author macstudent
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      LambtonStringTools lst = new LambtonStringTools();
    lst.reverse("Lambton");
    
    
    String binaryString="1000";  
int decimal=Integer.parseInt(binaryString,2);  
System.out.println(decimal); 

   System.out.println(StringReverse.reverse("Lambton"));
        System.out.println("" + BinaryDecimal.binaryToDecimal("1000"));
        System.out.println(MaxOccurenceOfCharacter.mostFrequent("aaaabbbbccc"));
        System.out.println(SubString.replaceSubString("the dog jumped over the fence.", "the", "that"));
     }
}

class StringReverse {

    public static String reverse(String input) {
        String reverse = "";
        for(int i = input.length() - 1; i >= 0; i--)
        {
            reverse = reverse + input.charAt(i);
        }
        return reverse;
    }
}

class BinaryDecimal {

    public static int binaryToDecimal(String input) {
        Long binary =  Long.valueOf(input).longValue();
        int decimalNumber = 0, i = 0;
        long remainder;
        while (binary != 0)
        {
            remainder = binary % 10;
            binary /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }
        return decimalNumber;
    }
}

class MaxOccurenceOfCharacter {

    public static String mostFrequent(String input) {
        char[] array = input.toCharArray();
        int maxCount = 1;
        char maxChar = array[0];
 
          for(int i = 0, j = 0; i < input.length() - 1; i = j){
               int count = 1;
           while (++j < input.length() && array[i] == array[j]) {
                  count++;
                }
         
          if (count >= maxCount) {
             maxCount = count;
             maxChar = array[i];
         }
         
        }
 
    return (maxChar + " = " + maxCount);
    }
}

class SubString {

    public static String replaceSubString(String s1, String s2, String s3) {
        
        s1 = s1.replaceAll(s2,s3);
        return s1;
    
    }

    }
   
    
    


        
                
          
          

        
    

