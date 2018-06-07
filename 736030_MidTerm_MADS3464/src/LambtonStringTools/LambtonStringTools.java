/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LambtonStringTools;

/**
 *
 * @author macstudent
 */
public class LambtonStringTools {
    
    static int i;
static int c = 0;
static int res;

static void reverse(String s){
    char ch[] = new char[s.length()];
    for(i = 0;i < s.length();i++){
        ch[i] = s.charAt(i);
        }
    for(i=s.length()-1;i>=0;i--){
        System.out.print(ch[i]);
        }
        
}
}