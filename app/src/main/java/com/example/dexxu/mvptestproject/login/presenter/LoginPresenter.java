package com.example.dexxu.mvptestproject.login.presenter;

import com.example.dexxu.mvptestproject.login.model.LoginInterator;
import com.example.dexxu.mvptestproject.login.view.LoginView;

/**
 * Created by Dex.XU on 16/6/25.
 */
public interface LoginPresenter {
    void validateCredentials(String username, String password);

}
