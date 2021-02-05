package com.example.mymenu;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.ShareCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import yuku.ambilwarna.AmbilWarnaDialog;

public class MainActivity extends AppCompatActivity {

    TextInputEditText myMessage,myNum;
    ConstraintLayout Layout;
    int defaultColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myMessage = findViewById(R.id.message);
        myNum = findViewById(R.id.number);

        defaultColor = ContextCompat.getColor(MainActivity.this,R.color.design_default_color_primary);
        Layout = findViewById(R.id.layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.send:
                whatsappSend();
                return true;

            case R.id.colorChange:
                Toast.makeText(MainActivity.this,"Change color", Toast.LENGTH_SHORT).show();
                changeColor();
                return true;

            case R.id.share:
                Toast.makeText(MainActivity.this, "Share", Toast.LENGTH_SHORT).show();
                share();
                return true;

            case R.id.exit:
                Toast.makeText(MainActivity.this, "exit", Toast.LENGTH_SHORT).show();
                exit();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }


    }

    private void changeColor() {
        AmbilWarnaDialog ambilWarnaDialog = new AmbilWarnaDialog(this, defaultColor, new AmbilWarnaDialog.OnAmbilWarnaListener() {
            @Override
            public void onCancel(AmbilWarnaDialog dialog) {

            }

            @Override
            public void onOk(AmbilWarnaDialog dialog, int color) {
                defaultColor = color;
                Layout.setBackgroundColor(defaultColor);
            }
        });
        ambilWarnaDialog.show();
    }


    private void share() {
        String txt = myMessage.getText().toString();
        String mimeType = "text/plain";

        ShareCompat.IntentBuilder
                .from(MainActivity.this)
                .setType(mimeType)
                .setChooserTitle(txt)
                .setText(txt)
                .startChooser();
    }

    void whatsappSend() {
        String message = myMessage.getText().toString();
        String number = myNum.getText().toString();

        if (number.matches("") || (number.length() != 10) ) {
            Toast.makeText(MainActivity.this, "Please enter valid number(10 digits)", Toast.LENGTH_SHORT).show();
            return;
        }
//        String res = "";
//        boolean installed = appInstalledOrNot("com.WhatsApp");
//        if (installed)
//        {
//            res = "True";
//        }
//        else
//        {
//            res = "False";
//        }
//        if (installed) {
//            Intent intent = new Intent(Intent.ACTION_VIEW);
//            intent.setData(Uri.parse("http://api.whatsapp.com/send?phone="+ "+91"+ number + "&text=" + message));
//            startActivity(intent);
//        } else {
//            Toast.makeText(MainActivity.this, "Whatsapp not instaled", Toast.LENGTH_SHORT).show();
//
//        }
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://api.whatsapp.com/send?phone="+ "+91"+ number + "&text=" + message));
            startActivity(intent);
//        Toast.makeText(MainActivity.this, res, Toast.LENGTH_SHORT).show();
    }

    private boolean appInstalledOrNot(String url) {
        PackageManager packageManager = getPackageManager();
        boolean app_installed;

        try {
            packageManager.getPackageInfo(url, PackageManager.GET_ACTIVITIES);
            app_installed = true;
        } catch ( PackageManager.NameNotFoundException e ) {
            app_installed = false;
        }

        return app_installed;
    }

    void exit()
    {
        finish();
    }
}