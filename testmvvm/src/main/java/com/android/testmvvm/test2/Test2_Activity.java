package com.android.testmvvm.test2;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.android.testmvvm.R;
import com.android.testmvvm.databinding.Test2ActivityLayoutBinding;
import com.android.testmvvm.uitl.Constants;

@Route(path = Constants.TEST2_ACTIVITY)
public class Test2_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.test2_activity_layout);
        Test2ActivityLayoutBinding binding = DataBindingUtil.setContentView(this, R.layout.test2_activity_layout);
        MVVMViewModel mvvmViewModel = new MVVMViewModel(getApplication());
        binding.setViewModel(mvvmViewModel);
    }
}
