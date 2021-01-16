package com.xayappz.databindingtypes;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.xayappz.databindingtypes.databinding.ActivityDataBinding1Binding;


public class DataBindingActivity1 extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ActivityDataBinding1Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding_1);
        binding.txtName.setText("Akshay Rohilla");
        binding.txtSkills.setText("Android, Java");
        binding.txtComments.setText("Thanks!");
    }
}
