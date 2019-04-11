package com.stechapps.assemblerbyshubham;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String operant1;
    private String operant2;
int A=0;
int B=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linearLayout=findViewById(R.id.ll_dynamic);

    }

    private void getCommand() {
        EditText ed;
        String opCode = "";
        int i = 0;
        ed = findViewById(R.id.main_code_1);
        String s = ed.getText().toString();

        opCode = s.split(" ")[0].trim();
        operant1 = s.split(" ")[1].trim();
        operant2 = ed.getText().toString().trim().split(" ")[2];
        operant2= operant2.replaceAll("\\s", "");
        operant1= operant1.replaceAll("\\s", "");
        int temp=Integer.parseInt(operant2);


        switch (opCode){
            case "MVI" :
                if (operant1.equals("A")) {
                    A = temp;
                    drawSymbolTable("A",A);
                }else if (operant1.equals("B")){
                    B=temp;
                }else {
                    Toast.makeText(MainActivity.this,"REgister Not foung",Toast.LENGTH_SHORT).show();
                }
                break;
            case "MOV" : operant1=operant2;
            break;
            default:
                Toast.makeText(MainActivity.this," error",Toast.LENGTH_SHORT).show();



        }



    }

    private void drawSymbolTable(String regName, int val) {
    }

    public void getCommand(View view) {
        getCommand();
    }
}
