package com.xayappz.databindingtypes;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.xayappz.databindingtypes.databinding.ActivityDataBinding4Binding;
import com.xayappz.databindingtypes.model.StudentProfile;
import com.xayappz.databindingtypes.recyclerview.DataBinding4Adapter;

import java.util.ArrayList;
import java.util.List;

public class DataBindingActivity4 extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ActivityDataBinding4Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding_4);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<StudentProfile> list = new ArrayList<>();
        list.add(new StudentProfile("Akshay", "Trainer", "Keep it Simple"));
        list.add(new StudentProfile("Bill Gates", "Computers", "if you were born poor its not your mistake but If you die poor its your mistake"));
        list.add(new StudentProfile("Baba Ma-Ki-Chu", "Philosophy", "Sab Moh Maya Hai"));

        DataBinding4Adapter adapter = new DataBinding4Adapter(this, list);
        binding.recyclerView.setAdapter(adapter);
    }
}
