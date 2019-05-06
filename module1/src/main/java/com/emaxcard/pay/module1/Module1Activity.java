package com.emaxcard.pay.module1;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import androidx.appcompat.app.AppCompatActivity;

@Route(path = "/xiaoai1/module1")
public class Module1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        ARouter.getInstance().inject(this);
    }
}
