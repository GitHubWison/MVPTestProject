package com.example.dexxu.mvptestproject.login.listener;

/**
 * Created by Dex.XU on 16/6/25.
 */
public interface LoginListener {
    void onSuccess(String userName);
    void onFailure(String userName);
}
