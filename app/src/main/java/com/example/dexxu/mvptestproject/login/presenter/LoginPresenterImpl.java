package com.example.dexxu.mvptestproject.login.presenter;

import com.example.dexxu.mvptestproject.login.listener.LoginListener;
import com.example.dexxu.mvptestproject.login.model.LoginInterator;
import com.example.dexxu.mvptestproject.login.model.LoginInteratorImpl;
import com.example.dexxu.mvptestproject.login.view.LoginView;

/**
 * Created by Dex.XU on 16/6/25.
 */
public class LoginPresenterImpl implements LoginPresenter {
    private LoginView loginView;
    private LoginInterator loginInterator;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        this.loginInterator = new LoginInteratorImpl();
    }


    @Override
    public void validateCredentials(String username, String password) {
        loginView.showProgressBar();
//        执行登录的操作
        loginInterator.login(username, password, new LoginListener() {
            @Override
            public void onSuccess(String userName) {
                loginView.hideProgressBar();
                loginView.loginSuccess();
            }

            @Override
            public void onFailure(String userName) {
                loginView.hideProgressBar();
                loginView.loginFailure();
                loginView.setPassWordError();
                loginView.setUserNameError();

            }
        });

    }
}
