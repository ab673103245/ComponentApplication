package qianfeng.componentapplication;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ComponentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_component);
    }

    public void onClick(View view) {

        // 如果被点击的话，跳转
        Intent intent = new Intent();
       // ComponentName componentName = new ComponentName("qianfeng.intentapplication", "qianfeng.intentapplication.SerilzableActivity");
        ComponentName componentName = new ComponentName(this, SecondActivity.class);
        intent.setComponent(componentName);
        startActivity(intent);
    }
}
