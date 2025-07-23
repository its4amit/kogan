package com.cp.test;

import com.cp.models.UserData;

public class UserDataTest {

    public static void main(String[] args) {
        setUserData();
    }
    public static void setUserData(){

        UserData user  = new UserData();

         user.setUserName("standard_user");
         user.setPassword("secret_sauce");

        System.out.println("UserName:" + user.getUserName());
        System.out.println("Password:" + user.getPassword());
    }

}
