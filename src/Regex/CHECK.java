/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Regex;

import java.util.regex.Pattern;

/**
 *
 * @author kanniyappan.s
 */
public class CHECK {
     private static final String PHONE_REGEX="^[6-9]\\d{9}$";
     private static final String EMAIL_REGEX="^[a-zA-Z0-9._*%+-]+@[a-zA-Z0-9]+.[a-zA-Z]{2,3}$";
     private static final String PASSWORD_REGEX="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#%$^&+=]).{4,}$";
     
     public static boolean isValidPhone(String Number){
       return Pattern.matches(PHONE_REGEX, Number);
     }
     public static boolean isValidEmail(String Email){
       return Pattern.matches(EMAIL_REGEX, Email);
     }
     public static boolean isValidPass(String Pass){
      return Pattern.matches(PASSWORD_REGEX, Pass);
     }
}
