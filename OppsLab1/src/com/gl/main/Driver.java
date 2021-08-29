package com.gl.main;

import com.gl.model.Employee;
import com.gl.services.CredentialService;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {



        Employee e1 = new Employee("Prasannakumar", "patil");
        int choice;
        CredentialService credentialService = new CredentialService();
        System.out.println("Please enter the department from the following");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");

        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();

        switch (choice){
            case 1: credentialService.showCredentials(e1,"tech"); break;
            case 2: credentialService.showCredentials(e1,"admin"); break;
            case 3: credentialService.showCredentials(e1,"hr"); break;
            case 4:  credentialService.showCredentials(e1,"legal"); break;
            default:
                System.out.println("Invalid host");
        }
    }
}
