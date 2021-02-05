package com.example.mydetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText uName;
    private RadioGroup radioGroup;
    private CheckBox cDelhi,cMumbai,cKolkata,cBanglore;
    private Button show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        show = findViewById(R.id.btnShow);

        uName = findViewById(R.id.userName);
        radioGroup = findViewById(R.id.radioGroup);
        cDelhi = findViewById(R.id.cbDelhi);
        cMumbai = findViewById(R.id.cbMumbai);
        cKolkata = findViewById(R.id.cbKolkata);
        cBanglore = findViewById(R.id.cbBanglore);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer displayMsg = new StringBuffer();
                displayMsg.append("Username: ");
                displayMsg.append(uName.getText()).append("\n");

                int selectedRadio = radioGroup.getCheckedRadioButtonId();
                Button ageButton = findViewById(selectedRadio);
                if(selectedRadio == -1){
                    Toast.makeText(MainActivity.this, "Please select only one age group",Toast.LENGTH_LONG).show();
                }
                else{
                    displayMsg.append("Age Group: ");
                    displayMsg.append(ageButton.getText()).append("\n");
                }
                displayMsg.append("Selected City: ");
                if(cDelhi.isChecked()){
                    displayMsg.append(cDelhi.getText());
                }
                if(cMumbai.isChecked()){
                    displayMsg.append(", ").append(cMumbai.getText());
                }
                if(cKolkata.isChecked()){
                    displayMsg.append(", ").append(cKolkata.getText());
                }
                if(cBanglore.isChecked()){
                    displayMsg.append(", ").append(cBanglore.getText());
                }

                Toast.makeText(MainActivity.this, displayMsg,Toast.LENGTH_LONG).show();
            }
        });
    }
}