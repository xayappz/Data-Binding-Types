package com.xayappz.databindingtypes;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.xayappz.databindingtypes.databinding.ActivityMainBinding;
import com.xayappz.databindingtypes.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.button1.setText(getString(R.string.button_1_txt));
        binding.button2.setText(getString(R.string.button_2_txt));
        binding.button3.setText(getString(R.string.button_3_txt));
        binding.button4.setText(getString(R.string.button_4_txt));
        binding.setPresenter(new MainPresenter());
    }
}
