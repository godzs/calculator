package com.example.zhousheng.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Stack;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    StringBuilder words = new StringBuilder();

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

    public void onClick(View v) {
        Button button_ac = (Button) findViewById(R.id.button_ac);    //清零
        TextView input_text = (TextView) findViewById(R.id.input_text);
        switch (v.getId()) {
            case R.id.button_0:
                if (words.length() == 0) {
                    break;
                } else {
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
                input_text.setText(words);
                ;
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
                words = words.delete(0, words.length());
                break;
            case R.id.button_point:
                ;
                if (words.length() == 0) {
                    words = words.append("0");
                    words = words.append(".");
                    input_text.setText(words);
                    break;
                }
                char num_point = words.charAt(words.length() - 1);
                if (num_point == '/' || num_point == '-' || num_point == '+' || num_point == '*') {
                    words = words.append("0");
                    words = words.append(".");
                    input_text.setText(words);
                    break;
                }
                if (words.length() >= 2) {
                    if (num_point == '.')
                        break;
                    char num_point2 = words.charAt(words.length() - 2);
                    if (num_point2 == '.') {
                        Toast.makeText(MainActivity.this, "请输入正确表达式！", Toast.LENGTH_SHORT).show();
                        break;
                    }
                }

                words = words.append(".");
                input_text.setText(words);

                break;
            case R.id.button_add:
                if (words.length() > 0) {
                    char num = words.charAt(words.length() - 1);
                    if (num == '/' || num == '-' || num == '+' || num == '.' || num == '*') {
                        Toast.makeText(MainActivity.this, "请输入正确表达式！", Toast.LENGTH_SHORT).show();
                    } else {
                        words = words.append("+");
                        input_text.setText(words);
                    }
                }
                break;
            case R.id.button_sub:
                if (words.length() > 0) {
                    char num = words.charAt(words.length() - 1);
                    if (num == '/' || num == '-' || num == '+' || num == '.' || num == '*') {
                        Toast.makeText(MainActivity.this, "请输入正确表达式！", Toast.LENGTH_SHORT).show();
                    } else {
                        words = words.append("-");
                        input_text.setText(words);
                    }
                }
                break;
            case R.id.button_mult:
                if (words.length() > 0) {
                    char num = words.charAt(words.length() - 1);
                    if (num == '/' || num == '-' || num == '+' || num == '.' || num == '*') {
                        Toast.makeText(MainActivity.this, "请输入正确表达式！", Toast.LENGTH_SHORT).show();
                    } else {
                        words = words.append("*");
                        input_text.setText(words);
                    }
                }
                break;
            case R.id.button_div:
                if (words.length() > 0) {
                    char num = words.charAt(words.length() - 1);
                    if (words.length() > 1) {
                        char num1 = words.charAt(words.length() - 2);
                        if (num == '0' && (num1 == '/' || num1 == '-' || num1 == '+' || num1 == '*')) {
                            Toast.makeText(MainActivity.this, "除数不能为0！", Toast.LENGTH_SHORT).show();
                            break;
                        }

                    }
                    if (num == '/' || num == '-' || num == '+' || num == '.' || num == '*') {
                        Toast.makeText(MainActivity.this, "请输入正确表达式！", Toast.LENGTH_SHORT).show();
                        break;

                    }
                    words = words.append("/");
                    input_text.setText(words);

                }

                break;
            case R.id.button_delete:
                if (words.length() > 0) {
                    words.delete(words.length() - 1, words.length());
                    input_text.setText(words);
                }
                break;
            case R.id.button_equal:
                String post = Postfix(words);
                String result = numberCount(post);
                input_text.setText(result);
                words = words.delete(0, words.length());
                words.append(result);

                break;
            default:
                break;

        }


    }

    public boolean operator(char op) {
        if (op == '+' || op == '-' || op == '*' || op == '/' || op == '~') {
            return true;
        } else
            return false;
    }

    private int priority(char c) {     //判断优先级
        switch (c) {
            case '~':
                return 0;
            case '+':
            case '-':
            case ')':
                return 1;
            case '*':
            case '/':
                return 2;
            case '(':
                return 3;
        }
        return 0;
    }

    boolean isInStack = false;  //是否检测到运算符
    boolean calculateOne = true;   //删除栈顶的‘#’
    /* private boolean judgeOnFirst = true; */


    public String Postfix(StringBuilder words) {
        Stack<Character> mark = new Stack<Character>(); //运算符栈
        words = words.append("~");  //最后一位添加“#”以表示运算结束
        String post = "";      //后缀表达式
        String total = "";
        String num = "";
        for (int i = 0; i <= words.length() - 1; i++) {
            char oper = words.charAt(i);
            if (operator(oper) == true) {
                isInStack = true;
                if (isInStack == true && total != "") {
                    post = post + total + " ";
                    total = "";
                }
                while (!mark.empty() && oper != '~')   //如果栈非空，且表达式未遍历完
                {
                    Character ac = mark.pop();
                    if (ac != null && (priority(ac.charValue()) > priority(oper) || priority(ac.charValue()) == priority(oper))) {  //判断栈顶符号与当前符号的优先级
                        post = post + ac;             //如果栈顶符号的优先级高，则输出到后缀表达式中
                        ac = null;
                    }
                    if (ac != null) {
                        mark.push(ac);
                        break;
                    }
                }
                if (oper != '~') {
                    mark.push(oper);
                }
            } else {
                num = oper + "";
                total += num;
            }
        }
        while (!mark.isEmpty()) {

            post += " " + mark.pop().toString(); //如果栈非空，需要将栈中运算符放到后缀表达式末尾
        }
        return post;
    }


    public String numberCount(String post) {
        Stack<String> num_stk = new Stack<String>();    //操作数栈,初始化
        String num = "";
        String total = "";
        for (int i = 0; i < post.length(); i++) {
            char oper = post.charAt(i);
            if (oper == ' ') {
                num_stk.push(total.toString()); //数字入栈
                total = "";
                if (num_stk.contains(" ")) {
                    num_stk.pop();
                }
            }
            if (operator(oper)) {

                double num2 = Double.valueOf(num_stk.pop().toString());
                double num1 = Double.valueOf(num_stk.pop().toString());
                double result = 0;
                switch (oper) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        BigDecimal numA = new BigDecimal(Double.toString(num1));
                        BigDecimal numB = new BigDecimal(Double.toString(num2));
                        result = numA.subtract(numB).doubleValue();//add(numB).doubleValue();
                        // result=num1-num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                    default:
                        break;
                }
                String value = String.valueOf(result);
                if (value.indexOf(".") > 0) {
                    value = value.replaceAll("0+?$", "");//去掉多余的0,正则表达式
                    value = value.replaceAll("[.]$", "");//如最后一位是.则去掉

                }
                num_stk.push(value);  //操作后的结果入栈

            } else {
                num = oper + "";
                total += num;
            }
        }
        String final_result = num_stk.pop();
        return final_result;

    }
}


