package com.example.administrator.teamgrade08.Login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.administrator.teamgrade08.R;

public class UserAc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        setTitle("普通用户");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("注销");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getOrder()){
            case 0:
                NetWorkInf.reset(this);

                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
