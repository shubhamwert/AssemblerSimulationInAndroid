package com.stechapps.assemblerbyshubham;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String operant1;
    private String operant2;
    LinearLayout linearLayout;
    int acc=0;

    int A=0;
int B=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = findViewById(R.id.ll_dynamic);

    }

    private void getCommand1() {
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
        int temp;
        if (operant2.equals("A")||operant2.equals("B")) {
            temp=0;
        }
        else {
            temp = Integer.parseInt(operant2);}


        switch (opCode){
            case "MVI" :temp = Integer.parseInt(operant2);

                if (operant1.equals("A")) {
                    A = temp;
                }else if (operant1.equals("B")){
                    B=temp;
                }else {
                    Toast.makeText(MainActivity.this,"REgister Not foung",Toast.LENGTH_SHORT).show();
                }
                break;
            case "MOV" :  if (operant1.equals("A")) {
                A = B;
            }else if (operant1.equals("B")){
                B=A;
            }else {
                Toast.makeText(MainActivity.this,"REgister Not foung",Toast.LENGTH_SHORT).show();
            }
            break;
            case "DIV":if (operant1.equals("A")){
                A=A/B;
                acc=A;
            }else if(operant1.equals("B")){
                B=B/A;
                acc=B;
            }else {Toast.makeText(MainActivity.this," error not proper opcode",Toast.LENGTH_SHORT).show();}
                break;
            case "DIVI":if (operant1.equals("A")){
                A=A/temp;
                acc=A;
            }else if(operant1.equals("B")){
                B=B/temp;
                acc=B;
            }else {Toast.makeText(MainActivity.this," error not proper opcode",Toast.LENGTH_SHORT).show();}
                break;
            default:
                Toast.makeText(MainActivity.this," error",Toast.LENGTH_SHORT).show();



        }

        TextView tv=findViewById(R.id.inst1_reg);
        tv.setText(operant1);
        TextView tv2=findViewById(R.id.val1);
        if (operant2.equals("B")){
            tv2.setText(""+B);
        }else if (operant2.equals("A")){
            tv2.setText(""+A);

        }
        else {
            temp = Integer.parseInt(operant2);
            tv2.setText("" + temp);
        }


    }
    private void getCommand2() {
        EditText ed;
        String opCode = "";
        int i = 0;
        ed = findViewById(R.id.main_code_2);
        String s = ed.getText().toString();

        opCode = s.split(" ")[0].trim();
        operant1 = s.split(" ")[1].trim();
        operant2 = ed.getText().toString().trim().split(" ")[2];
        operant2= operant2.replaceAll("\\s", "");
        operant1= operant1.replaceAll("\\s", "");
        int temp;
        if (operant2.equals("A")||operant2.equals("B")) {
            temp=0;
        }
        else {
            temp = Integer.parseInt(operant2);}
        switch (opCode){
            case "MVI" :
                if (operant1.equals("A")) {
                    A = temp;
                }else if (operant1.equals("B")){
                    B=temp;
                }else {
                    Toast.makeText(MainActivity.this,"REgister Not foung",Toast.LENGTH_SHORT).show();
                }
                break;
            case "MOV" :  if (operant1.equals("A")) {
                A = B;
            }else if (operant1.equals("B")){
                B=A;
            }else {
                Toast.makeText(MainActivity.this,"REgister Not foung",Toast.LENGTH_SHORT).show();
            }
                break;
            case "DIV":if (operant1.equals("A")){
                A=A/B;
                acc=A;
            }else if(operant1.equals("B")){
                B=B/A;
                acc=B;
            }else {Toast.makeText(MainActivity.this," error not proper opcode",Toast.LENGTH_SHORT).show();}
                break;
            case "DIVI":if (operant1.equals("A")){
                A=A/temp;
                acc=A;
            }else if(operant1.equals("B")){
                B=B/temp;
                acc=B;
            }else {Toast.makeText(MainActivity.this," error not proper opcode",Toast.LENGTH_SHORT).show();}
                break;
            default:
                Toast.makeText(MainActivity.this," error",Toast.LENGTH_SHORT).show();



        }

        TextView tv=findViewById(R.id.inst2_reg);
        tv.setText(operant1);
        TextView tv2=findViewById(R.id.val2);
        if (operant2.equals("B")){
            tv2.setText(""+B);
        }else if (operant2.equals("A")){
            tv2.setText(""+A);

        }
        else {
            temp = Integer.parseInt(operant2);
            tv2.setText("" + temp);
        }


    }
    private void getCommand3() {
        EditText ed;
        String opCode = "";
        int i = 0;
        ed = findViewById(R.id.main_code_3);
        String s = ed.getText().toString();

        opCode = s.split(" ")[0].trim();
        operant1 = s.split(" ")[1].trim();
        operant2 = ed.getText().toString().trim().split(" ")[2];
        operant2= operant2.replaceAll("\\s", "");
        operant1= operant1.replaceAll("\\s", "");

        int temp;
        if (operant2.equals("A")||operant2.equals("B")) {
            temp=0;
        }
        else {
            temp = Integer.parseInt(operant2);}
        switch (opCode){
            case "MVI" :
                if (operant1.equals("A")) {
                    temp = Integer.parseInt(operant2);

                    A = temp;
                }else if (operant1.equals("B")){
                    temp = Integer.parseInt(operant2);
                    B=temp;
                }else {
                    Toast.makeText(MainActivity.this,"REgister Not foung",Toast.LENGTH_SHORT).show();
                }
                break;
            case "MOV" :  if (operant1.equals("A")) {
                A = B;
            }else if (operant1.equals("B")){
                B=A;
            }else {
                Toast.makeText(MainActivity.this,"REgister Not foung",Toast.LENGTH_SHORT).show();
            }
                break;
            case "DIV":if (operant1.equals("A")){
                A=A/B;
                acc=A;
            }else if(operant1.equals("B")){
                B=B/A;
                acc=B;
            }else {Toast.makeText(MainActivity.this," error not proper opcode",Toast.LENGTH_SHORT).show();}
                break;
            case "DIVI":if (operant1.equals("A")){

                A=A/temp;
                acc=A;
            }else if(operant1.equals("B")){
                B=B/temp;
                acc=B;
            }else {Toast.makeText(MainActivity.this," error not proper opcode",Toast.LENGTH_SHORT).show();}
                break;
            default:
                Toast.makeText(MainActivity.this," error",Toast.LENGTH_SHORT).show();



        }

        TextView tv=findViewById(R.id.inst3_reg);
        tv.setText(operant1);
        TextView tv2=findViewById(R.id.val3);

if(operant2.equals("B")){temp=B;}
else if (operant2.equals("A")){temp=A;}

else {
    temp = Integer.parseInt(operant2);
}
        tv2.setText(""+temp);



    }



    public void getCommand(View view) {
        getCommand1();
        getCommand2();
        getCommand3();
        TextView tv=findViewById(R.id.acc_tv);
        tv.setText(""+acc);
    }
}
