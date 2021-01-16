package com.xayappz.databindingtypes;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.xayappz.databindingtypes.databinding.ActivityDataBinding3Binding;
import com.xayappz.databindingtypes.model.LoginModel;
import com.xayappz.databindingtypes.presenter.LoginPresenter;

public class DataBindingActivity3 extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityDataBinding3Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding_3);
        binding.setLoginInfo(new LoginModel());
        binding.setLoginPresenter(new LoginPresenter());
    }
}
