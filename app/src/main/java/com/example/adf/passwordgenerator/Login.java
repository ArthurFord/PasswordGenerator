/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.adf.passwordgenerator;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author adffo
 */
public class Login {
    private String userName;
    private String password;
    private int passwordLength;
    private int requiredPasswordLength;

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    public static String createNewPassword(int p) {
        StringBuilder pWord = new StringBuilder(p);
        //caps
        for (int i = 0; i < p * .25; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(65, 91);
            char c = (char) (randomNum);
            int randInsert = ThreadLocalRandom.current().nextInt(0, pWord.length() + 1);
            pWord.insert(randInsert, c);
        }
        //lowercase
        for (int i = 0; i < p * .25; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(97, 123);
            char c = (char) (randomNum);
            int randInsert = ThreadLocalRandom.current().nextInt(0, pWord.length() + 1);
            pWord.insert(randInsert, c);
        }
        //special lower
        for (int i = 0; i < p * .25; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(33, 48);
            char c = (char) (randomNum);
            int randInsert = ThreadLocalRandom.current().nextInt(0, pWord.length() + 1);
            pWord.insert(randInsert, c);
        }
        //numbers
        for (int i = 0; i < p * .25; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(48, 58);
            char c = (char) (randomNum);
            int randInsert = ThreadLocalRandom.current().nextInt(0, pWord.length() + 1);
            pWord.insert(randInsert, c);
        }
        return pWord.substring(0, p);
    }
} //End of Class  
    

