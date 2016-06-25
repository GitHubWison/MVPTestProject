package com.example.dexxu.mvptestproject.login.model;

import com.example.dexxu.mvptestproject.login.listener.LoginListener;

/**
 * Created by Dex.XU on 16/6/25.
 */
public class LoginInteratorImpl implements LoginInterator {

    @Override
    public void login(final String userName, final String passWord, final LoginListener loginListener) {
        new Thread(new Runnable() {
            @Override
            public void run() {

//                    Thread.sleep(3000);
                    if (userName.equals("admin")&&passWord.equals("123"))
                    {
                        loginListener.onSuccess(userName);
                    }else
                    {
                        loginListener.onFailure(userName);
                    }

            }
        }).run();

    }
}
