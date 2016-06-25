
package com.example.dexxu.mvptestproject.login.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.dexxu.mvptestproject.R;
import com.example.dexxu.mvptestproject.login.presenter.LoginPresenter;
import com.example.dexxu.mvptestproject.login.presenter.LoginPresenterImpl;

public class LoginActivity extends AppCompatActivity implements LoginView
{
    private EditText username_edittext;
    private EditText password_edittext;
    private Button login_button;
    private ProgressBar progress;
    private LoginPresenter loginpresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initViews();
        initDatas();
        initEvents();

    }

    private void initViews() {
        username_edittext = (EditText)findViewById(R.id.username_edittext);
        password_edittext = (EditText)findViewById(R.id.password_edittext);
        login_button = (Button)findViewById(R.id.login_button);
        progress = (ProgressBar)findViewById(R.id.progress);
    }

    private void initDatas() {
//        password_edittext.seterr
        loginpresenter = new LoginPresenterImpl(this);
    }

    private void initEvents() {
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = username_edittext.getText().toString();
                String password = password_edittext.getText().toString();
                loginpresenter.validateCredentials(username,password);
            }
        });
    }

    @Override
    public void showProgressBar() {
        progress.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgressBar() {
        progress.setVisibility(View.INVISIBLE);
    }

    @Override
    public void setUserNameError() {
        username_edittext.setError("用户名输入错误");
    }

    @Override
    public void setPassWordError() {
        password_edittext.setError("密码输入错误");
    }

    @Override
    public void loginSuccess() {
        Toast.makeText(LoginActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginFailure() {
        Toast.makeText(LoginActivity.this, "登录失败", Toast.LENGTH_SHORT).show();
    }
}
