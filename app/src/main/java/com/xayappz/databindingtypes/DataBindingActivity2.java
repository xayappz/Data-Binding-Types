package com.xayappz.databindingtypes;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.xayappz.databindingtypes.databinding.DataBindingActivity2Binding;
import com.xayappz.databindingtypes.model.UserProfile;

public class DataBindingActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingActivity2Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding_2);
        UserProfile userProfile = new UserProfile("Akshay", "Android Developer, Java Lover", "Thanks!");
        binding.setUserProfile(userProfile);
    }
}
