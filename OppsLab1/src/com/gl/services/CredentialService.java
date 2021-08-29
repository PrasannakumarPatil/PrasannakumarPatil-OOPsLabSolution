package com.gl.services;

import com.gl.model.Employee;

import java.util.*;

public class CredentialService {

    public void generatePassword(){


        Random random= new Random();
        int numbers = random.nextInt(100-10)+10;
        String cLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String sLetters = "abcdefghijklmnopqrstuvwxys";
        String sChar = "!@#$%^&*()_></}{[]\\|";

        char cL1 = cLetters.charAt(random.nextInt(26));
        char cL2 = cLetters.charAt(random.nextInt(26));
        char sL1 = sLetters.charAt(random.nextInt(26));
        char sL2 = sLetters.charAt(random.nextInt(26));
        char sCh1= sChar.charAt(random.nextInt(sChar.length()));
        char sCh2 = sChar.charAt(random.nextInt(sChar.length()));

        String password = Integer.toString(numbers)+cL1+cL2+sL1+sL2+sCh1+sCh2;

        List<String >  rPassword =Arrays.asList(password.split(""));
        Collections.shuffle(rPassword);
        StringBuilder Pass = new StringBuilder();
        for (String e: rPassword){
            Pass.append(e);
        }
        System.out.println("Password--> "+Pass);
    }
    public void generateEmailAddress(Employee e1, String choice){

        System.out.println("Email--> "+e1.getFirstName()+e1.getLastName()+"."+choice+"@abc.com");

    }
    public void showCredentials(Employee e1, String choice){

        System.out.println("Dear "+ e1.getFirstName() +" your credentials are as follows");
        generateEmailAddress(e1, choice);
        generatePassword();


    }
}
