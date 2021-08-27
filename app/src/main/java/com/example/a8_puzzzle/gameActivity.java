package com.example.a8_puzzzle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.LineNumberReader;
import java.util.ArrayList;


public class gameActivity extends AppCompatActivity {
    int countMove; // متغیر شمارش حرکات
    ArrayList<String> numbers;  // آرای لیستی از عناصر 8 پازل به ترتیب

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Bundle extras = getIntent().getExtras();
        String name = "UNKNOWN";
        if(extras!=null){
            if(extras.containsKey("name")){
                name =  extras.getString("name");
            }
        }
        TextView nameView = (TextView) findViewById(R.id.nameView);
        nameView.setText(name);
        countMove = 0;
        // تعریف تکست ویو شمارش حرکات
        final TextView txtMove = (TextView) findViewById(R.id.txtMove);

        //تعریف دکمه های 1 تا 9
        final TextView btn1 = (TextView) findViewById(R.id.btn1);
        final TextView btn2 = (TextView) findViewById(R.id.btn2);
        final TextView btn3 = (TextView) findViewById(R.id.btn3);
        final TextView btn4 = (TextView) findViewById(R.id.btn4);
        final TextView btn5 = (TextView) findViewById(R.id.btn5);
        final TextView btn6 = (TextView) findViewById(R.id.btn6);
        final TextView btn7 = (TextView) findViewById(R.id.btn7);
        final TextView btn8 = (TextView) findViewById(R.id.btn8);
        final TextView btn9 = (TextView) findViewById(R.id.btn9);
        numbers = new ArrayList<String>();
        numbers.add(btn1.getText() + "");
        numbers.add(btn2.getText() + "");
        numbers.add(btn3.getText() + "");
        numbers.add(btn4.getText() + "");
        numbers.add(btn5.getText() + "");
        numbers.add(btn6.getText() + "");
        numbers.add(btn7.getText() + "");
        numbers.add(btn8.getText() + "");
        numbers.add(btn9.getText() + "");

        // تعریف دکمه ریست
        final Button btnReset = (Button) findViewById(R.id.btnReset);

        // تعریف کلیک دکمه ها برای جابه جایی

        // روش کار : مقایسه با خانه اعداد اطرافش
        // اگر خالی بود خانه کنارش جابهجا میشود مقدار تکستش

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((String) btn1.getText()).equals("")) {
                    Toast.makeText(gameActivity.this, "EMPTY PLACE YOU CLICK", Toast.LENGTH_SHORT).show();
                } else if (((String) btn2.getText()).equals("")) {
                    btn2.setText(btn1.getText() + "");
                    btn1.setText("");
                    countMove++;
                    txtMove.setText("Move = " + countMove);
                } else if (((String) btn4.getText()).equals("")) {
                    btn4.setText(btn1.getText() + "");
                    btn1.setText("");
                    countMove++;
                    txtMove.setText("Move = " + countMove);
                } else {
                    Toast.makeText(gameActivity.this, "CAN NOT MOVE!", Toast.LENGTH_SHORT).show();
                }
                checkFinished();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((String) btn2.getText()).equals("")) {
                    Toast.makeText(gameActivity.this, "EMPTY PLACE YOU CLICK", Toast.LENGTH_SHORT).show();
                } else if (((String) btn1.getText()).equals("")) {
                    btn1.setText(btn2.getText() + "");
                    btn2.setText("");
                    countMove++;
                    txtMove.setText("Move = " + countMove);
                } else if (((String) btn5.getText()).equals("")) {
                    btn5.setText(btn2.getText() + "");
                    btn2.setText("");
                    countMove++;
                    txtMove.setText("Move = " + countMove);
                } else if (((String) btn3.getText()).equals("")) {
                    btn3.setText(btn2.getText() + "");
                    btn2.setText("");
                    countMove++;
                    txtMove.setText("Move = " + countMove);
                } else {
                    Toast.makeText(gameActivity.this, "CAN NOT MOVE!", Toast.LENGTH_SHORT).show();
                }
                checkFinished();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((String) btn3.getText()).equals("")) {
                    Toast.makeText(gameActivity.this, "EMPTY PLACE YOU CLICK", Toast.LENGTH_SHORT).show();
                } else if (((String) btn2.getText()).equals("")) {
                    btn2.setText(btn3.getText() + "");
                    btn3.setText("");
                    countMove++;
                    txtMove.setText("Move = " + countMove);
                } else if (((String) btn6.getText()).equals("")) {
                    btn6.setText(btn3.getText() + "");
                    btn3.setText("");
                    countMove++;
                    txtMove.setText("Move = " + countMove);
                } else {
                    Toast.makeText(gameActivity.this, "CAN NOT MOVE!", Toast.LENGTH_SHORT).show();
                }
                checkFinished();
            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((String) btn4.getText()).equals("")) {
                    Toast.makeText(gameActivity.this, "EMPTY PLACE YOU CLICK", Toast.LENGTH_SHORT).show();
                } else if (((String) btn1.getText()).equals("")) {
                    btn1.setText(btn4.getText() + "");
                    btn4.setText("");
                    countMove++;
                    txtMove.setText("Move = " + countMove);
                } else if (((String) btn5.getText()).equals("")) {
                    btn5.setText(btn4.getText() + "");
                    btn4.setText("");
                    countMove++;
                    txtMove.setText("Move = " + countMove);
                } else if (((String) btn7.getText()).equals("")) {
                    btn7.setText(btn4.getText() + "");
                    btn4.setText("");
                    countMove++;
                    txtMove.setText("Move = " + countMove);
                } else {
                    Toast.makeText(gameActivity.this, "CAN NOT MOVE!", Toast.LENGTH_SHORT).show();
                }
                checkFinished();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((String) btn5.getText()).equals("")) {
                    Toast.makeText(gameActivity.this, "EMPTY PLACE YOU CLICK", Toast.LENGTH_SHORT).show();
                } else if (((String) btn2.getText()).equals("")) {
                    btn2.setText(btn5.getText() + "");
                    btn5.setText("");
                    countMove++;
                    txtMove.setText("Move = " + countMove);
                } else if (((String) btn4.getText()).equals("")) {
                    btn4.setText(btn5.getText() + "");
                    btn5.setText("");
                    countMove++;
                    txtMove.setText("Move = " + countMove);
                } else if (((String) btn6.getText()).equals("")) {
                    btn6.setText(btn5.getText() + "");
                    btn5.setText("");
                    countMove++;
                    txtMove.setText("Move = " + countMove);
                } else if (((String) btn8.getText()).equals("")) {
                    btn8.setText(btn5.getText() + "");
                    btn5.setText("");
                    countMove++;
                    txtMove.setText("Move = " + countMove);
                } else {
                    Toast.makeText(gameActivity.this, "CAN NOT MOVE!", Toast.LENGTH_SHORT).show();
                }
                checkFinished();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((String) btn6.getText()).equals("")) {
                    Toast.makeText(gameActivity.this, "EMPTY PLACE YOU CLICK", Toast.LENGTH_SHORT).show();
                } else if (((String) btn3.getText()).equals("")) {
                    btn3.setText(btn6.getText() + "");
                    btn6.setText("");
                    countMove++;
                    txtMove.setText("Move = " + countMove);
                } else if (((String) btn5.getText()).equals("")) {
                    btn5.setText(btn6.getText() + "");
                    btn6.setText("");
                    countMove++;
                    txtMove.setText("Move = " + countMove);
                } else if (((String) btn9.getText()).equals("")) {
                    btn9.setText(btn6.getText() + "");
                    btn6.setText("");
                    countMove++;
                    txtMove.setText("Move = " + countMove);
                } else {
                    Toast.makeText(gameActivity.this, "CAN NOT MOVE!", Toast.LENGTH_SHORT).show();
                }
                checkFinished();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((String) btn7.getText()).equals("")) {
                    Toast.makeText(gameActivity.this, "EMPTY PLACE YOU CLICK", Toast.LENGTH_SHORT).show();
                } else if (((String) btn4.getText()).equals("")) {
                    btn4.setText(btn7.getText() + "");
                    btn7.setText("");
                    countMove++;
                    txtMove.setText("Move = " + countMove);
                } else if (((String) btn8.getText()).equals("")) {
                    btn8.setText(btn7.getText() + "");
                    btn7.setText("");
                    countMove++;
                    txtMove.setText("Move = " + countMove);
                } else {
                    Toast.makeText(gameActivity.this, "CAN NOT MOVE!", Toast.LENGTH_SHORT).show();
                }
                checkFinished();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((String) btn8.getText()).equals("")) {
                    Toast.makeText(gameActivity.this, "EMPTY PLACE YOU CLICK", Toast.LENGTH_SHORT).show();
                } else if (((String) btn7.getText()).equals("")) {
                    btn7.setText(btn8.getText() + "");
                    btn8.setText("");
                    countMove++;
                    txtMove.setText("Move = " + countMove);
                } else if (((String) btn5.getText()).equals("")) {
                    btn5.setText(btn8.getText() + "");
                    btn8.setText("");
                    countMove++;
                    txtMove.setText("Move = " + countMove);
                } else if (((String) btn9.getText()).equals("")) {
                    btn9.setText(btn8.getText() + "");
                    btn8.setText("");
                    countMove++;
                    txtMove.setText("Move = " + countMove);
                } else {
                    Toast.makeText(gameActivity.this, "CAN NOT MOVE!", Toast.LENGTH_SHORT).show();
                }
                checkFinished();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((String) btn9.getText()).equals("")) {
                    Toast.makeText(gameActivity.this, "EMPTY PLACE YOU CLICK", Toast.LENGTH_SHORT).show();
                } else if (((String) btn6.getText()).equals("")) {
                    btn6.setText(btn9.getText() + "");
                    btn9.setText("");
                    countMove++;
                    txtMove.setText("Move = " + countMove);
                } else if (((String) btn8.getText()).equals("")) {
                    btn8.setText(btn9.getText() + "");
                    btn9.setText("");
                    countMove++;
                    txtMove.setText("Move = " + countMove);
                } else {
                    Toast.makeText(gameActivity.this, "CAN NOT MOVE!", Toast.LENGTH_SHORT).show();
                }
                checkFinished();
            }
        });



        // تعریف تابع ریست
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restButton();


            }
        });

        Button btnAgain = (Button) findViewById(R.id.btnAgain);
        btnAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restButton();
                txtMove.setVisibility(View.VISIBLE);
                TableLayout tbl = (TableLayout) findViewById(R.id.tblLayout);
                tbl.setVisibility(View.VISIBLE);
                btnReset.setVisibility(View.VISIBLE);
                LinearLayout winner = (LinearLayout) findViewById(R.id.win);
                winner.setVisibility(View.INVISIBLE);
            }
        });



    }

    // تابعی که بررسی میکند پایان یافته یا نه
    protected void checkFinished() {

        ArrayList<String> numbersEnd = new ArrayList<String>();

        // حالت صحیح
        ArrayList<String> numberCorrect = new ArrayList<String>();
        numberCorrect.add("1");
        numberCorrect.add("2");
        numberCorrect.add("3");
        numberCorrect.add("4");
        numberCorrect.add("");
        numberCorrect.add("5");
        numberCorrect.add("6");
        numberCorrect.add("7");
        numberCorrect.add("8");


        // حالتی که بررسی میکند
        final TextView btn1 = (TextView) findViewById(R.id.btn1);
        final TextView btn2 = (TextView) findViewById(R.id.btn2);
        final TextView btn3 = (TextView) findViewById(R.id.btn3);
        final TextView btn4 = (TextView) findViewById(R.id.btn4);
        final TextView btn5 = (TextView) findViewById(R.id.btn5);
        final TextView btn6 = (TextView) findViewById(R.id.btn6);
        final TextView btn7 = (TextView) findViewById(R.id.btn7);
        final TextView btn8 = (TextView) findViewById(R.id.btn8);
        final TextView btn9 = (TextView) findViewById(R.id.btn9);
        numbersEnd.add(btn1.getText() + "");
        numbersEnd.add(btn2.getText() + "");
        numbersEnd.add(btn3.getText() + "");
        numbersEnd.add(btn4.getText() + "");
        numbersEnd.add(btn5.getText() + "");
        numbersEnd.add(btn6.getText() + "");
        numbersEnd.add(btn7.getText() + "");
        numbersEnd.add(btn8.getText() + "");
        numbersEnd.add(btn9.getText() + "");



        // بررسی
        if (numbersEnd.equals(numberCorrect)) {
            Toast.makeText(this, "Congratulations Dude!", Toast.LENGTH_LONG).show();
            TableLayout tbl = (TableLayout) findViewById(R.id.tblLayout);
            tbl.setVisibility(View.INVISIBLE);
            TextView txtMove = (TextView) findViewById(R.id.txtMove);
            txtMove.setVisibility(View.INVISIBLE);
            TextView btnReset = (TextView) findViewById(R.id.btnReset);
            btnReset.setVisibility(View.INVISIBLE);
            LinearLayout winner = (LinearLayout) findViewById(R.id.win);
            winner.setVisibility(View.VISIBLE);
        } else {
        }
    }
    protected void restButton(){
        final TextView txtMove = (TextView) findViewById(R.id.txtMove);
        final TextView btn1 = (TextView) findViewById(R.id.btn1);
        final TextView btn2 = (TextView) findViewById(R.id.btn2);
        final TextView btn3 = (TextView) findViewById(R.id.btn3);
        final TextView btn4 = (TextView) findViewById(R.id.btn4);
        final TextView btn5 = (TextView) findViewById(R.id.btn5);
        final TextView btn6 = (TextView) findViewById(R.id.btn6);
        final TextView btn7 = (TextView) findViewById(R.id.btn7);
        final TextView btn8 = (TextView) findViewById(R.id.btn8);
        final TextView btn9 = (TextView) findViewById(R.id.btn9);

        txtMove.setText("Move = 0");
        countMove = 0;
        btn1.setText(numbers.get(0));
        btn2.setText(numbers.get(1));
        btn3.setText(numbers.get(2));
        btn4.setText(numbers.get(3));
        btn5.setText(numbers.get(4));
        btn6.setText(numbers.get(5));
        btn7.setText(numbers.get(6));
        btn8.setText(numbers.get(7));
        btn9.setText(numbers.get(8));

    }
}

