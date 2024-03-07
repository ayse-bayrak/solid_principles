package com.cydeo.solid.singleResponsibility.example.good;

public class SecurityFilter { //This class is doing only authentication and authorization and it is not doing anything else

    public static boolean authenticate() {
        // Check authentication
        return true;
    }

    public static boolean authorization() {
        // Check authorization
        return true;
    }

}
