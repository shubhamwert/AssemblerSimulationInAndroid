package com.stechapps.assemblerbyshubham;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    int acc = 0;
    int A=0,B=0; //registers

    private EditText ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed=findViewById(R.id.m_editor);


    }

    public void submit(View view) {
        String commands=ed.getText().toString().trim();
        String[] commmandList=commands.split("\n");
        for(int i=0;i<commmandList.length;i++){
            ConvertToAssembly(commmandList[i]);
        }

    }

    private void ConvertToAssembly(String s) {
        int opCodeId = 0;

        String opCode=s;
        String operant1;
        String operant2;
        int INDEXA=0;
        int INDEXB=0;



            opCode = s.split(" ")[0].trim();
            operant1 = s.split(" ")[1].trim();
            operant2 = ed.getText().toString().trim().split(" ")[2];
            operant2 = operant2.replaceAll("\\s", "");
            operant1 = operant1.replaceAll("\\s", "");
            int temp;
            if (operant1.equals("A")) {
                INDEXA = 1;
            }
            if (operant1.equals("B")) {
                INDEXB = 1;
            }

            if (operant2.equals("A") || operant2.equals("B")) {
                temp = 0;
            } else {
                temp = Integer.parseInt(operant2);
            }


            switch (opCode) {
                case "MVI":
                    opCodeId = 1000;
                    if (operant1.equals("A")) {
                        temp = Integer.parseInt(operant2);

                        A = temp;
                    } else if (operant1.equals("B")) {
                        temp = Integer.parseInt(operant2);
                        B = temp;
                    } else {
                        Toast.makeText(MainActivity.this, "REgister Not foung", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case "MOV":
                    opCodeId = 1005;

                    if (operant1.equals("A")) {
                        A = B;
                    } else if (operant1.equals("B")) {
                        B = A;
                    } else {
                        Toast.makeText(MainActivity.this, "REgister Not foung", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case "DIV":
                    opCodeId = 1010;

                    if (operant1.equals("A")) {
                        A = A / B;
                        acc = A;
                    } else if (operant1.equals("B")) {
                        B = B / A;
                        acc = B;
                    } else {
                        Toast.makeText(MainActivity.this, " error not proper opcode", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case "DIVI":
                    opCodeId = 1020;

                    if (operant1.equals("A")) {

                        A = A / temp;
                        acc = A;
                    } else if (operant1.equals("B")) {
                        B = B / temp;
                        acc = B;
                    } else {
                        Toast.makeText(MainActivity.this, " error not proper opcode", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case "ADD":
                    opCodeId = 1040;

                    if (operant1.equals("A")) {

                        A = A + B;
                        acc = A;
                    } else if (operant1.equals("B")) {
                        B = B + A;
                        acc = B;
                    } else {
                        Toast.makeText(MainActivity.this, " error not proper opcode", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case "ADI":
                    opCodeId = 1030;

                    if (operant1.equals("A")) {

                        A = A + temp;
                        acc = A;
                    } else if (operant1.equals("B")) {
                        B = B + temp;
                        acc = B;
                    } else {
                        Toast.makeText(MainActivity.this, " error not proper opcode", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case "SBI":
                    opCodeId = 1050;

                    if (operant1.equals("A")) {

                        A = A - temp;
                        acc = A;
                    } else if (operant1.equals("B")) {
                        B = B - temp;
                        acc = B;
                    } else {
                        Toast.makeText(MainActivity.this, " error not proper opcode", Toast.LENGTH_SHORT).show();
                    }
                    break;
                case "SUB":
                    opCodeId = 1065;

                    if (operant1.equals("A")) {
                        A = A - B;
                        acc = A;
                    } else if (operant1.equals("B")) {
                        B = B - A;
                        acc = B;
                    } else {
                        Toast.makeText(MainActivity.this, " error not proper opcode", Toast.LENGTH_SHORT).show();
                    }
                    break;
                default:
                    Toast.makeText(MainActivity.this, " error", Toast.LENGTH_SHORT).show();


            }
            EditTables();

    }

    private void EditTables() {
    TextView tvSymbol,tvInter;
    tvSymbol=findViewById(R.id.symbol_text);



    }


}


   /* private void getCommand1() {
        int opCodeId = 0;
        EditText ed;
        String opCode;
        ed = findViewById(R.id.main_code_1);
        if(!ed.getText().toString().isEmpty()){String s = ed.getText().toString();

        opCode = s.split(" ")[0].trim();
        operant1 = s.split(" ")[1].trim();
        operant2 = ed.getText().toString().trim().split(" ")[2];
        operant2 = operant2.replaceAll("\\s", "");
        operant1 = operant1.replaceAll("\\s", "");
        int temp;
        if (operant1.equals("A")) {
            INDEXA = 1;
        }
        if (operant1.equals("B")) {
            INDEXB = 1;
        }

        if (operant2.equals("A") || operant2.equals("B")) {
            temp = 0;
        } else {
            temp = Integer.parseInt(operant2);
        }


        switch (opCode) {
            case "MVI":
                opCodeId = 1000;
                if (operant1.equals("A")) {
                    temp = Integer.parseInt(operant2);

                    A = temp;
                } else if (operant1.equals("B")) {
                    temp = Integer.parseInt(operant2);
                    B = temp;
                } else {
                    Toast.makeText(MainActivity.this, "REgister Not foung", Toast.LENGTH_SHORT).show();
                }
                break;
            case "MOV":
                opCodeId = 1005;

                if (operant1.equals("A")) {
                    A = B;
                } else if (operant1.equals("B")) {
                    B = A;
                } else {
                    Toast.makeText(MainActivity.this, "REgister Not foung", Toast.LENGTH_SHORT).show();
                }
                break;
            case "DIV":
                opCodeId = 1010;

                if (operant1.equals("A")) {
                    A = A / B;
                    acc = A;
                } else if (operant1.equals("B")) {
                    B = B / A;
                    acc = B;
                } else {
                    Toast.makeText(MainActivity.this, " error not proper opcode", Toast.LENGTH_SHORT).show();
                }
                break;
            case "DIVI":
                opCodeId = 1020;

                if (operant1.equals("A")) {

                    A = A / temp;
                    acc = A;
                } else if (operant1.equals("B")) {
                    B = B / temp;
                    acc = B;
                } else {
                    Toast.makeText(MainActivity.this, " error not proper opcode", Toast.LENGTH_SHORT).show();
                }
                break;
            case "ADD":
                opCodeId = 1040;

                if (operant1.equals("A")) {

                    A = A + B;
                    acc = A;
                } else if (operant1.equals("B")) {
                    B = B + A;
                    acc = B;
                } else {
                    Toast.makeText(MainActivity.this, " error not proper opcode", Toast.LENGTH_SHORT).show();
                }
                break;
            case "ADI":
                opCodeId = 1030;

                if (operant1.equals("A")) {

                    A = A + temp;
                    acc = A;
                } else if (operant1.equals("B")) {
                    B = B + temp;
                    acc = B;
                } else {
                    Toast.makeText(MainActivity.this, " error not proper opcode", Toast.LENGTH_SHORT).show();
                }
                break;
            case "SBI":
                opCodeId = 1050;

                if (operant1.equals("A")) {

                    A = A - temp;
                    acc = A;
                } else if (operant1.equals("B")) {
                    B = B - temp;
                    acc = B;
                } else {
                    Toast.makeText(MainActivity.this, " error not proper opcode", Toast.LENGTH_SHORT).show();
                }
                break;
            case "SUB":
                opCodeId = 1065;

                if (operant1.equals("A")) {

                    A = A - B;
                    acc = A;
                } else if (operant1.equals("B")) {
                    B = B - A;
                    acc = B;
                } else {
                    Toast.makeText(MainActivity.this, " error not proper opcode", Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                Toast.makeText(MainActivity.this, " error", Toast.LENGTH_SHORT).show();


        }

        TextView tv = findViewById(R.id.inst1_reg);
        TextView tvval=findViewById(R.id.inter_val1);
        TextView insIndex = findViewById(R.id.inst1_intcode_index);
        tv.setText(operant1);
        TextView tv2 = findViewById(R.id.val1);
        if (operant2.equals("B")) {
            tv2.setText("" + A);
            tvval.setText("#"+INDEXB);

        } else if (operant2.equals("A")) {
            tv2.setText("" + B);
            tvval.setText("#"+INDEXA);


        } else {
            temp = Integer.parseInt(operant2);
            tv2.setText("" + temp);
            tvval.setText(""+temp);

        }
        if (operant1.equals("A")) {
            insIndex.setText("#"+INDEXA);
        }
       else if (operant1.equals("B")) {
            insIndex.setText("#"+INDEXB);

        }else {insIndex.setText(""+temp);}

        TextView tv3 = findViewById(R.id.opcode_1);
        tv3.setText("" + opCodeId);}


    }*/




