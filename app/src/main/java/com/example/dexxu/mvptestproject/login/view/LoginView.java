package com.example.dexxu.mvptestproject.login.view;

/**
 * Created by Dex.XU on 16/6/25.
 */
public interface LoginView {
    void showProgressBar();
    void hideProgressBar();
    void setUserNameError();
    void setPassWordError();
    void loginSuccess();
    void loginFailure();

}
