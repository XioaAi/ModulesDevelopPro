package com.emaxcard.pay.modulesdeveloppro;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button)
    Button button;
    @BindView(R.id.button2)
    Button button2;
    @BindView(R.id.button3)
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.button, R.id.button2, R.id.button3})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.button:
                ARouter.getInstance().build("/xiaoai1/module1").navigation();
                break;
            case R.id.button2:
                ARouter.getInstance().build("/xiaoai2/module2").withString("title","我是Module2!!!").navigation();
                break;
            case R.id.button3:
                ARouter.getInstance().build("/xiaoai3/module3").navigation();
                break;
        }
    }
}
