package com.aaneal.mvvm;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.aaneal.mvvm.commands.userLogin;
import com.aaneal.mvvm.databinding.ActivityMainBinding;
import com.aaneal.mvvm.model.User;
import com.aaneal.mvvm.viewmodel.UserModel;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        UserModel userModel = new UserModel(new User("Username", "Password"));
        activityMainBinding.setLogin(userModel);

        activityMainBinding.setUserLoginEvent(new userLogin() {
            @Override
            public void onClickLogin() {
                Toast.makeText(MainActivity.this, ""+activityMainBinding.getLogin().getUsername(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
