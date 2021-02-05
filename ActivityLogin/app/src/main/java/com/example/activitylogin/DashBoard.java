package com.example.activitylogin;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class DashBoard extends AppCompatActivity {

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_dash_board);

            ImageButton btnWebsite = findViewById(R.id.imageButtonWeb);
            ImageButton btnCall = findViewById(R.id.makeCall);
            ImageButton btnLocation = findViewById(R.id.openMap);
            ImageButton btnMail = findViewById(R.id.sendMail);

            btnWebsite.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(DashBoard.this, "Website button clicked.", Toast.LENGTH_SHORT).show();
                    String url =  "http://newtreat.co.in/";
                    Uri webpage = Uri.parse(url);

                    Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

                    if(intent.resolveActivity(getPackageManager()) != null){
                        startActivity(intent);
                    }else{
                        Log.d("ImplicitIntents", "Can't handle this intent!");
                    }
                }
            });

            btnCall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(DashBoard.this, "Call button clicked", Toast.LENGTH_SHORT).show();
                    String contactNum =  "8619562638";

                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + contactNum));

                    if(intent.resolveActivity(getPackageManager()) != null){
                        startActivity(intent);
                    }else{
                        Log.d("ImplicitIntents", "Can't handle this intent!");
                    }
                }
            });

            btnLocation.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(DashBoard.this, "Location button clicked", Toast.LENGTH_SHORT).show();
                    String location =  "NewTreat.co";

                    Uri addressUri = Uri.parse("geo:0,0?q=" + location);
                    Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);

                    if(intent.resolveActivity(getPackageManager()) != null){
                        startActivity(intent);
                    }else{
                        Log.d("ImplicitIntents", "Can't handle this intent!");
                    }
                }
            });

            btnMail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(DashBoard.this, "Mail button clicked", Toast.LENGTH_SHORT).show();
                    String subject = "Greetings from 4MCA!!";
                    String[] sendTo = new String[] {"naishar.shah31@gmail.com", "mbharti321@gmail.com","dharam69@gmail.com"};
                    String content = "Good Morning !, This is a test email sent through the MY APP";

                    Intent intent = new Intent(Intent.ACTION_SENDTO);
                    intent.setData(Uri.parse("mailto:")); // only email apps should handle this
                    intent.putExtra(Intent.EXTRA_EMAIL, sendTo);
                    intent.putExtra(Intent.EXTRA_SUBJECT, subject);
                    intent.putExtra(Intent.EXTRA_TEXT, content);

                    if(intent.resolveActivity(getPackageManager()) != null){
                        startActivity(intent);
                    }else{
                        Log.d("ImplicitIntents", "Can't handle this intent!");
                    }
                }
            });
        }

}