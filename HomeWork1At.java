package com.example.cpsc_411_hw_1;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import android.view.ViewGroup;


public class HomeWork1At extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        HorizontalScrollView vih = new HorizontalScrollView(this);

        GridLayout root = new GridLayout(this);
        ViewGroup.LayoutParams rParams = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        );

        root.setLayoutParams(rParams);
        root.setOrientation(GridLayout.HORIZONTAL);
        root.setBackgroundColor(Color.BLACK);
        root.setColumnCount(5);
        root.setRowCount(11);





        TextView tv;

        GridLayout.Spec row;
        GridLayout.Spec col;
        GridLayout.LayoutParams cParams;
        for(int i = 0; i < 11; i++) {
            tv = new TextView(this);
            tv.setText(String.valueOf(i+1));
            tv.setTextSize(16);
            tv.setBackgroundColor(Color.GRAY);

            if(i <9)
            {tv.setPadding(26,0,26,0);}
            else{tv.setPadding(14,0,14,0);}
            row = GridLayout.spec(i,0f);
            col = GridLayout.spec(0, 0f);

            cParams = new GridLayout.LayoutParams(row, col);
            tv.setLayoutParams(cParams);
            root.addView(tv);

        }



        tv = new TextView(this);
        tv.setText("Rules void hello1(int hour)");

        tv.setTextSize(16);
        tv.setTextColor(Color.WHITE);
        tv.setBackgroundColor(Color.BLACK);
        tv.setPadding(600,0,0,0);
        row = GridLayout.spec(0,0);
        col = GridLayout.spec(1, 4, 1f);
        cParams = new GridLayout.LayoutParams(row, col);
//        cParams.setMargins(1,1,1,1);
       // cParams.setGravity(Gravity.CENTER_HORIZONTAL);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("properties");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.WHITE);
        tv.setPadding(53,26,40,32);
        row = GridLayout.spec(1,0);
        col = GridLayout.spec(1,1);
        cParams = new GridLayout.LayoutParams(row, col);

        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("name");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.WHITE);
        tv.setPadding(220,0,190,0);
        row = GridLayout.spec(1,1);
        col = GridLayout.spec(2,1);
        cParams = new GridLayout.LayoutParams(row, col);

        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("category");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.WHITE);
        tv.setPadding(202,0,150,0);
        row = GridLayout.spec(2,0);
        col = GridLayout.spec(2,1);
        cParams = new GridLayout.LayoutParams(row, col);

        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("Day Hour Classification");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.WHITE);
        tv.setPadding(0,0,315,0);
        row = GridLayout.spec(1,1);
        col = GridLayout.spec(3,0);
        cParams = new GridLayout.LayoutParams(row, col);

        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("Day and Time");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.WHITE);
        tv.setPadding(0,0,495,0);
        row = GridLayout.spec(2,0);
        col = GridLayout.spec(3,1);
        cParams = new GridLayout.LayoutParams(row, col);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("Rule");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.CYAN);
        tv.setPadding(100,0,103,0);
        row = GridLayout.spec(3,0);
        col = GridLayout.spec(1,1);
        cParams = new GridLayout.LayoutParams(row, col);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        int a = 0;
        for(int i = 5;i < 12; i++)
        {
            tv = new TextView(this);
            if(i == 7)
            {
                tv.setText("Rule");
            }
            else if(i > 7)
            {
                a++;
                tv.setText("R"+String.valueOf(9+a));
            }
            tv.setTextSize(16);
            tv.setTextColor(Color.BLACK);
            if(i<7)
            {tv.setBackgroundColor(Color.CYAN);}
            else{tv.setBackgroundColor(Color.WHITE);}
            if(i == 5 || i == 6)
            {
                tv.setPadding(130,0,154,0);
            }
            else if(i==7){tv.setPadding(0,1,203,0);}
            else{
                tv.setPadding(0,0,210,0);
            }
            row = GridLayout.spec(i-1,0);
            col = GridLayout.spec(1,1);
            cParams = new GridLayout.LayoutParams(row, col);
            tv.setLayoutParams(cParams);
            root.addView(tv);

        }

        tv = new TextView(this);
        tv.setText("C1");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.CYAN);
        tv.setPadding(240,0,224,0);
        row = GridLayout.spec(3,0);
        col = GridLayout.spec(2,1);
        cParams = new GridLayout.LayoutParams(row, col);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("min<=hour&&hour<=max");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.CYAN);
        tv.setPadding(25,0,31,0);
        row = GridLayout.spec(4,0);
        col = GridLayout.spec(2,1);
        cParams = new GridLayout.LayoutParams(row, col);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        for(int i =6;i<12; i++) {
            tv = new TextView(this);
            if (i == 6) {
                tv.setText("int min");
            } else if (i == 7) {
                tv.setText("From");
            } else if (i >= 8) {
                if(i== 8)
                {
                    tv.setText("0");
                }
                if(i== 9)
                {
                    tv.setText("12");
                }
                if(i== 10)
                {
                    tv.setText("18");
                }
                if(i== 11)
                {
                    tv.setText("22");
                }
            } else {
                tv.setText("");
            }
            tv.setTextColor(Color.BLACK);
            if (i == 6) {
                tv.setBackgroundColor(Color.CYAN);
            } else {
                tv.setBackgroundColor(Color.YELLOW);
            }
            if (i >= 9) {
                tv.setPadding(200, 6, 0, 0);
            }
            else if(i == 8){tv.setPadding(220, 6, 0, 0); }
            else if (i == 6) {
                tv.setPadding(80, 5, 70, 1);
            } else {
                tv.setPadding(0, 6, 170, 0);
            }
            row = GridLayout.spec(i - 1, 0);
            col = GridLayout.spec(2, 1);
            cParams = new GridLayout.LayoutParams(row, col);
            tv.setLayoutParams(cParams);
            root.addView(tv);
        }
        int m = 0;
        int n = 0;
        for(int i =6;i<12; i++)
        {
            tv = new TextView(this);
            if(i == 6){
                tv.setText("int max");
            }
            else if(i == 7)
            {
                tv.setText("To");
            }
            else if(i>=8)
            {
                if(i== 8)
                {
                    tv.setText("11");
                }
                if(i== 9)
                {
                    tv.setText("17");
                }
                if(i== 10)
                {
                    tv.setText("21");
                }
                if(i== 11)
                {
                    tv.setText("23");
                }
            }
            else
            {tv.setText("");}
            tv.setTextColor(Color.BLACK);
            if(i == 6)
            {
                tv.setBackgroundColor(Color.CYAN);
            }
            else
            {
                tv.setBackgroundColor(Color.YELLOW);
            }
            if(i>=8) {
                tv.setPadding(232, 6, 0, 0);
            }
            else if (i == 6) {
                tv.setPadding(80, 5, 75, 1);
            }
            else{ tv.setPadding(0, 6,234 , 0);}
            row = GridLayout.spec(i-1,0);
            col = GridLayout.spec(2,1);
            cParams = new GridLayout.LayoutParams(row, col);
            cParams.setMargins(240, 0,0,0);
            tv.setLayoutParams(cParams);
            root.addView(tv);
        }

        tv = new TextView(this);
        tv.setText("A1");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.CYAN);
        tv.setPadding(350,0,349,0);
        row = GridLayout.spec(3,0);
        col = GridLayout.spec(3,1);
        cParams = new GridLayout.LayoutParams(row, col);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("System.out.println(greeting + \", World!\")");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.CYAN);
        tv.setPadding(10,0,10,0);
        row = GridLayout.spec(4,0);
        col = GridLayout.spec(3,1);
        cParams = new GridLayout.LayoutParams(row, col);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        tv = new TextView(this);
        tv.setText("String greeting");
        tv.setTextSize(16);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.CYAN);
        tv.setPadding(238,0,239,0);
        row = GridLayout.spec(5,0);
        col = GridLayout.spec(3,1);
        cParams = new GridLayout.LayoutParams(row, col);
        tv.setLayoutParams(cParams);
        root.addView(tv);

        for(int i = 7; i< 12; i++)
        {
            tv = new TextView(this);
            if(i==7)
            {
                tv.setText("Greeting");
            }
            else if(i==8)
            {
                tv.setText("Good Morning");
            }
            else if(i==9)
            {
                tv.setText("Good Afternoon");
            }
            else if(i==10)
            {
                tv.setText("Good Evening");
            }
            else if(i==11)
            {
                tv.setText("Good Night");
            }else{}
            tv.setTextSize(16);
            tv.setTextColor(Color.BLACK);
            tv.setBackgroundColor(Color.parseColor("#FFA500"));
            if(i == 7)
            {
                tv.setPadding(0,0,592,0);
            }
            else if(i==8)
            {tv.setPadding(0,0,484,0);}
            else if(i==9)
            {tv.setPadding(0,0,453,0);}
            else if(i==10)
            {tv.setPadding(0,0,494,0);}
            else if(i==11)
            {tv.setPadding(0,0,538,0);}
            row = GridLayout.spec(i-1,0);
            col = GridLayout.spec(3,1);
            cParams = new GridLayout.LayoutParams(row, col);
            tv.setLayoutParams(cParams);
            root.addView(tv);
        }
        vih.addView(root);
        setContentView(vih);
//setContentView(R.layout.homework1);
    }
}
