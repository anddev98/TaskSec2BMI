package com.sematec.tasksec2bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* Button btn_Result = findViewById(R.id.btnResult);
        final EditText edt_Height = findViewById(R.id.edtHeight);
        final EditText edt_Weight = findViewById(R.id.edtWeight);
        final TextView txt_Result = findViewById(R.id.txtResult);
        final TextView txt_If = findViewById(R.id.txtIf);

        btn_Result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s_Height = edt_Height.getText().toString();
                String s_Weight = edt_Weight.getText().toString();
                int i_Height = Integer.parseInt(s_Height);
                int i_Weight = Integer.parseInt(s_Weight);
                float f_Height = i_Height * i_Height;
                float f_Result = i_Weight / f_Height;
                float Result = f_Result *  10000;
                // Toast.makeText(MainActivity.this, f_Result+"",Toast.LENGTH_LONG).show();
                txt_Result.setText(Result + "");

                if (Result < 18.5 ){
                    txt_If.setText("Underweight");}
                else if (Result >= 18.5 && Result <= 24.9){
                    txt_If.setText("Normal");}
                else if (Result >= 25 && Result <= 29.9){
                    txt_If.setText("Overweight");}
                else if (Result >= 30 ){
                    txt_If.setText("Obese");}


            }
        });*/
    }
}