package com.example.zhousheng.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    StringBuilder words=new StringBuilder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button_1 = (Button) findViewById(R.id.button_1);
        Button button_2 = (Button) findViewById(R.id.button_2);
        Button button_3 = (Button) findViewById(R.id.button_3);
        Button button_4 = (Button) findViewById(R.id.button_4);
        Button button_5 = (Button) findViewById(R.id.button_5);
        Button button_6 = (Button) findViewById(R.id.button_6);
        Button button_7 = (Button) findViewById(R.id.button_7);
        Button button_8 = (Button) findViewById(R.id.button_8);
        Button button_9 = (Button) findViewById(R.id.button_9);
        Button button_0 = (Button) findViewById(R.id.button_0);
        Button button_ac = (Button) findViewById(R.id.button_ac);    //清零
        Button button_delete = (Button) findViewById(R.id.button_delete);   //删除
        Button button_add = (Button) findViewById(R.id.button_add);    //加
        Button button_point = (Button) findViewById(R.id.button_point);  //小数点
        Button button_sub = (Button) findViewById(R.id.button_sub);   //减法
        Button button_mult = (Button) findViewById(R.id.button_mult);  //乘法
        Button button_div = (Button) findViewById(R.id.button_div);  //除法
        Button button_equal = (Button) findViewById(R.id.button_equal);  //等号
        button_0.setOnClickListener(this);
        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);
        button_7.setOnClickListener(this);
        button_8.setOnClickListener(this);
        button_9.setOnClickListener(this);
        button_ac.setOnClickListener(this);
        button_delete.setOnClickListener(this);
        button_point.setOnClickListener(this);
        button_add.setOnClickListener(this);
        button_sub.setOnClickListener(this);
        button_mult.setOnClickListener(this);
        button_div.setOnClickListener(this);
        button_equal.setOnClickListener(this);

    }
    public void onClick (View v)
    {
        TextView input_text=(TextView)findViewById(R.id.input_text);
        switch(v.getId())
        {
            case R.id.button_0:
                if(words.length()==0) {
                    break;
                }
                else {
                    words = words.append("0");
                    input_text.setText(words);
                }
                break;
            case R.id.button_1:
                words = words.append("1");
                input_text.setText(words);
                break;
            case R.id.button_2:
                words = words.append("2");
                input_text.setText(words);
                break;
            case R.id.button_3:
                words = words.append("3");
                input_text.setText(words);
                break;
            case R.id.button_4:
                words = words.append("4");
                input_text.setText(words);
                break;
             case R.id.button_5:
                 words = words.append("5");
                 input_text.setText(words);;
                    break;
            case R.id.button_6:
                words = words.append("6");
                input_text.setText(words);
                break;
            case R.id.button_7:
                words = words.append("7");
                input_text.setText(words);
                break;
            case R.id.button_8:
                words = words.append("8");
                input_text.setText(words);
                break;
            case R.id.button_9:
                words = words.append("9");
                input_text.setText(words);
                break;
            case R.id.button_ac:
                input_text.setText("");
                words=words.delete(0,words.length());
                break;
            case R.id.button_point:
                ;
                if(words.length()==0) {
                    words=words.append("0.");
                    input_text.setText(words);
                    break;
                }
                char num_point = words.charAt(words.length() - 1);
               if (num_point == '/' || num_point == '-' || num_point == '+' || num_point == '.' || num_point == '*') {
                    words = words.append("0.");
                    input_text.setText(words);
                }
                else {
                    words = words.append(".");
                    input_text.setText(words);
                }
                break;
            case R.id.button_add:
                if(words.length()>0) {
                    char num = words.charAt(words.length() - 1);
                    if (num == '/' || num == '-' || num == '+' || num == '.' || num == '*') {
                        Toast.makeText(MainActivity.this, "请输入正确表达式！", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        words = words.append("+");
                        input_text.setText(words);
                    }
                }
                break;
            case R.id.button_sub:
                if(words.length()>0) {
                    char num = words.charAt(words.length() - 1);
                    if (num == '/' || num == '-' || num == '+' || num == '.' || num == '*') {
                        Toast.makeText(MainActivity.this, "请输入正确表达式！", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        words = words.append("-");
                        input_text.setText(words);
                    }
                }
                break;
            case R.id.button_mult:
                if(words.length()>0) {
                    char num = words.charAt(words.length() - 1);
                    if (num == '/' || num == '-' || num == '+' || num == '.' || num == '*') {
                        Toast.makeText(MainActivity.this, "请输入正确表达式！", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        words = words.append("*");
                        input_text.setText(words);
                    }
                }
                break;
            case R.id.button_div:
                if(words.length()>0) {
                    char num = words.charAt(words.length() - 1);
                    char num1 = words.charAt(words.length() - 2);
                    if (num == '0'&&(num1 == '/' || num1 == '-' || num1 == '+' || num1 == '*'))
                        Toast.makeText(MainActivity.this, "除数不能为0！", Toast.LENGTH_SHORT).show();
                    else if (num == '/' || num == '-' || num == '+' || num == '.' || num == '*')
                        Toast.makeText(MainActivity.this, "请输入正确表达式！", Toast.LENGTH_SHORT).show();
                    else {
                        words = words.append("/");
                        input_text.setText(words);
                }
                }
                break;
            case R.id.button_delete:
                if(words.length()>0){
                    words.delete(words.length() - 1, words.length());
                    input_text.setText(words);
                }
                break;
                default:
                    break;

        }

    }

}
