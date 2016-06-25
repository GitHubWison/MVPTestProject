package com.example.dexxu.mvptestproject.login.model;

import com.example.dexxu.mvptestproject.login.listener.LoginListener;

/**
 * Created by Dex.XU on 16/6/25.
 */
public interface LoginInterator {
    void login(String userName, String passWord, LoginListener loginListener);
}
