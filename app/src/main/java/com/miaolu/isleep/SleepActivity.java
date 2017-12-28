package com.miaolu.isleep;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItemView;
import android.view.View;
import android.widget.Button;


public class SleepActivity extends AppCompatActivity {
    private Button btnSelected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep);
        btnSelected = (Button) findViewById(R.id.button12);
        btnSelected.setBackgroundResource(R.drawable.sleepicon2);
    }
    //主页按钮
    public void onClick11(View v) {
        if (btnSelected.getId() != R.id.button11) {
            switch (btnSelected.getId()) {
                //睡眠按钮
                case R.id.button12:
                    btnSelected.setBackgroundResource(R.drawable.sleepicon1);
                    break;
                //发现按钮
                case R.id.button13:
                    btnSelected.setBackgroundResource(R.drawable.findicon1);
                    break;
                //树洞按钮
                case R.id.button14:
                    btnSelected.setBackgroundResource(R.drawable.holeicon1);
                    break;
                //我的按钮
                case R.id.button15:
                    btnSelected.setBackgroundResource(R.drawable.mineicon1);
                    break;
            }
            //改变btnSelected
            btnSelected = (Button) findViewById(R.id.button11);
            btnSelected.setBackgroundResource(R.drawable.mainicon2);
            Intent intent = new Intent(SleepActivity.this, com.miaolu.isleep.MainActivity.class);
            startActivity(intent);
        }
    }

    //睡眠按钮
    public void onClick12(View v)
    {
        if(btnSelected.getId() != R.id.button12)
        {
            switch (btnSelected.getId())
            {
                //首页按钮
                case R.id.button11:
                    btnSelected.setBackgroundResource(R.drawable.mainicon1);
                    break;
                //发现按钮
                case R.id.button13:
                    btnSelected.setBackgroundResource(R.drawable.findicon1);
                    break;
                //树洞按钮
                case R.id.button14:
                    btnSelected.setBackgroundResource(R.drawable.holeicon1);
                    break;
                //我的按钮
                case R.id.button15:
                    btnSelected.setBackgroundResource(R.drawable.mineicon1);
                    break;
            }
            //改变btnSelected
            btnSelected = (Button)findViewById(R.id.button12);
            btnSelected.setBackgroundResource(R.drawable.sleepicon2);
        }
    }

    //发现按钮
    public void onClick13(View v)
    {
        if(btnSelected.getId() != R.id.button13)
        {
            switch (btnSelected.getId())
            {
                //首页按钮
                case R.id.button11:
                    btnSelected.setBackgroundResource(R.drawable.mainicon1);
                    break;
                //睡眠按钮
                case R.id.button12:
                    btnSelected.setBackgroundResource(R.drawable.sleepicon1);
                    break;
                //树洞按钮
                case R.id.button14:
                    btnSelected.setBackgroundResource(R.drawable.holeicon1);
                    break;
                //我的按钮
                case R.id.button15:
                    btnSelected.setBackgroundResource(R.drawable.mineicon1);
                    break;
            }
            //改变btnSelected
            btnSelected = (Button)findViewById(R.id.button13);
            btnSelected.setBackgroundResource(R.drawable.findicon2);
            Intent intent = new Intent(SleepActivity.this, com.miaolu.isleep.FindActivity.class);
            startActivity(intent);
        }
    }

    //树洞按钮
    public void onClick14(View v)
    {
        if(btnSelected.getId() != R.id.button14)
        {
            switch (btnSelected.getId())
            {
                //首页按钮
                case R.id.button11:
                    btnSelected.setBackgroundResource(R.drawable.mainicon1);
                    break;
                //睡眠按钮
                case R.id.button12:
                    btnSelected.setBackgroundResource(R.drawable.sleepicon1);
                    break;
                //发现按钮
                case R.id.button13:
                    btnSelected.setBackgroundResource(R.drawable.findicon1);
                    break;
                //我的按钮
                case R.id.button15:
                    btnSelected.setBackgroundResource(R.drawable.mineicon1);
                    break;
            }
            //改变btnSelected
            btnSelected = (Button)findViewById(R.id.button14);
            btnSelected.setBackgroundResource(R.drawable.holeicon2);
        }
    }

    //我的按钮
    public void onClick15(View v)
    {
        if(btnSelected.getId() != R.id.button15)
        {
            switch (btnSelected.getId())
            {
                //首页按钮
                case R.id.button11:
                    btnSelected.setBackgroundResource(R.drawable.mainicon1);
                    break;
                //睡眠按钮
                case R.id.button12:
                    btnSelected.setBackgroundResource(R.drawable.sleepicon1);
                    break;
                //发现按钮
                case R.id.button13:
                    btnSelected.setBackgroundResource(R.drawable.findicon1);
                    break;
                //树洞按钮
                case R.id.button14:
                    btnSelected.setBackgroundResource(R.drawable.holeicon1);
                    break;
            }
            //改变btnSelected
            btnSelected = (Button)findViewById(R.id.button15);
            btnSelected.setBackgroundResource(R.drawable.mineicon2);
        }
    }
}