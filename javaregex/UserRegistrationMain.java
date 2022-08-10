/*@Purpose:: As a User need to enter a valid First Name
 *           First name starts with Cap and has minimum 3 characters
 *@File:: User Registration Using Regex
 *@Author:: Shubham Raj
 */
package com.javaregex;

import java.util.Scanner;

public class UserRegistrationMain {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {

            System.out.println("Enter 0 : Exit");
            System.out.println("Enter 1 : To validate First Name ");
            System.out.println("Enter 2 : To validate Last Name ");

            switch (scanner.nextInt()) {
                case 0:
                    System.exit(0);

                case 1:
                    UserRegistration.validFirstName();
                    break;

                case 2:
                    UserRegistration.validLastName();
                    break;

            }
        }
    }
}