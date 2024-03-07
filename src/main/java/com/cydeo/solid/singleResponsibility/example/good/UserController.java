package com.cydeo.solid.singleResponsibility.example.good;
//“Just because you can, does not mean you should.”
public class UserController { // this class, only responsible for this kind of operation

    public static void getRequest() {
        // Get the request
        // Send this request to validation and security part
    }

    public static String createResponse() {
        return "Response";   //For example "User is created"
    }

    public static void sendResponse() {
        // Send user a response
    }

}
