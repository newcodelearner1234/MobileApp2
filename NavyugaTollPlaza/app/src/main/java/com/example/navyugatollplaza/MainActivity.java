package com.example.navyugatollplaza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private int vehicleCount = 0;
    private int vehicleCount2 = 0;
    private int vehicleCount4 = 0;
    private int vehicleCountTruck = 0;
    private int vehicleCountVip = 0;
    private int vehicleCountRfid = 0;

    private int feeAmt = 0;

    Button btn2,btn4,btnTruck,btnVip,btnRfid;
    TextView cntVehicle,cntFee,cnt2,cnt4,cntTruck,cntVip,cntRfid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn2 = (Button) findViewById(R.id.twoWheeler);
        btn4 = (Button) findViewById(R.id.fourWheeler);
        btnTruck = (Button) findViewById(R.id.truck);
        btnVip = (Button) findViewById(R.id.vip);
        btnRfid = (Button) findViewById(R.id.rfid);

        cntVehicle = (TextView) findViewById(R.id.vehicleCount);
        cntFee = (TextView) findViewById(R.id.feeCount);
        cnt2 = (TextView) findViewById(R.id.count2);
        cnt4 = (TextView) findViewById(R.id.count4);
        cntTruck = (TextView) findViewById(R.id.countTruck);
        cntVip = (TextView) findViewById(R.id.countVip);
        cntRfid = (TextView) findViewById(R.id.countRfid);

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                vehicleCount++;
                cntVehicle.setText(Integer.toString(vehicleCount));
                vehicleCount2++;
                cnt2.setText(Integer.toString(vehicleCount2));
                feeAmt+=100;
                cntFee.setText(Integer.toString(feeAmt));
            }
        });

        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                vehicleCount++;
                cntVehicle.setText(Integer.toString(vehicleCount));
                vehicleCount4++;
                cnt4.setText(Integer.toString(vehicleCount4));
                feeAmt+=200;
                cntFee.setText(Integer.toString(feeAmt));
            }
        });

        btnTruck.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                vehicleCount++;
                cntVehicle.setText(Integer.toString(vehicleCount));
                vehicleCountTruck++;
                cntTruck.setText(Integer.toString(vehicleCountTruck));
                feeAmt+=400;
                cntFee.setText(Integer.toString(feeAmt));
            }
        });

        btnVip.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                vehicleCount++;
                cntVehicle.setText(Integer.toString(vehicleCount));
                vehicleCountVip++;
                cntVip.setText(Integer.toString(vehicleCountVip));
                feeAmt+=0;
                cntFee.setText(Integer.toString(feeAmt));
            }
        });

        btnRfid.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                vehicleCount++;
                cntVehicle.setText(Integer.toString(vehicleCount));
                vehicleCountRfid++;
                cntRfid.setText(Integer.toString(vehicleCountRfid));
                feeAmt+=50;
                cntFee.setText(Integer.toString(feeAmt));
            }
        });

    }
}