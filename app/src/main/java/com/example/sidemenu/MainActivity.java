package com.example.sidemenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;

public class MainActivity<SETTING> extends AppCompatActivity {
    final int  SETTING = 1, ABOUT = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        SubMenu subMenu = menu.addSubMenu(SETTING,1,1,"Setting");
                        subMenu.add(SETTING,2,2,"Phone_setting");
                        subMenu.add(SETTING,3,3,"Bluetooth_setting");
        MenuItem menuItem = menu.add(ABOUT,1,4,"About");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        Toast.makeText(this,"onPrepare",Toast.LENGTH_SHORT).show();
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case 1:
                getToast1("setting open");
                break;
            case 2:
                getToast1("phone setting open");
                break;
            case 3:
                getToast1("Bluetooth open");
                break;
            case 4:
                getToast1("about open");
        }
        return super.onOptionsItemSelected(item);
    }
    private void getToast1(String text){
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show();
    }
}