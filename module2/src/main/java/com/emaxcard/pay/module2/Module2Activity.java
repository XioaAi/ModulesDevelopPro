package com.emaxcard.pay.module2;

import android.os.Bundle;
import android.widget.Button;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;

@Route(path = "/xiaoai2/module2")
public class Module2Activity extends AppCompatActivity {

    @BindView(R2.id.module2_button)
    Button button;

    @Autowired
    public String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
        ARouter.getInstance().inject(this);

        button.setText(title);
    }
}
