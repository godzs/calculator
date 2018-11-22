package com.example.zhousheng.calculator;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.math.*;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Stack;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    StringBuilder words = new StringBuilder();
    StringBuilder words1 = new StringBuilder();
    int i=0;
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
        Button button_min= (Button) findViewById(R.id.button_min);
        Configuration mConfiguration = this.getResources().getConfiguration(); //获取设置的配置信息
        int ori = mConfiguration.orientation; //获取屏幕方向
        if (ori == mConfiguration.ORIENTATION_LANDSCAPE) {
            Button button_sin = (Button) findViewById(R.id.button_sin);      //sin
            Button button_cos = (Button) findViewById(R.id.button_cos);
            Button button_tan = (Button) findViewById(R.id.button_tan);
            Button button_B = (Button) findViewById(R.id.button_B);
            Button button_OCT = (Button) findViewById(R.id.button_OCT);
            Button button_lk = (Button) findViewById(R.id.button_lk);
            Button button_rk = (Button) findViewById(R.id.button_rk);
            Button button_H= (Button) findViewById(R.id.button_H);
            Button button_X2= (Button) findViewById(R.id.button_X2);
            Button button_X3= (Button) findViewById(R.id.button_x3);
            Button button_divx=(Button) findViewById(R.id.button_divx);
            Button button_xmult=(Button) findViewById(R.id.button_xmult);
            Button button_e=(Button) findViewById(R.id.button_e);
            Button button_pi=(Button) findViewById(R.id.button_pi);
            Button button_ln=(Button) findViewById(R.id.button_ln);
            Button button_ex=(Button) findViewById(R.id.button_ex);
            Button button_2X=(Button) findViewById(R.id.button_2X);
            Button button_genhao=(Button) findViewById(R.id.button_genhao);
            Button button_3genhao=(Button) findViewById(R.id.button_3genhao);
            Button button_log=(Button) findViewById(R.id.button_log);

            button_divx.setOnClickListener(this);
            button_log.setOnClickListener(this);
            button_genhao.setOnClickListener(this);
            button_3genhao.setOnClickListener(this);
            button_2X.setOnClickListener(this);
            button_ex.setOnClickListener(this);
            button_ln.setOnClickListener(this);
            button_pi.setOnClickListener(this);
            button_e.setOnClickListener(this);
            button_xmult.setOnClickListener(this);
            button_X2.setOnClickListener(this);
            button_X3.setOnClickListener(this);
            button_lk.setOnClickListener(this);
            button_rk.setOnClickListener(this);
            button_H.setOnClickListener(this);
            button_sin.setOnClickListener(this);
            button_cos.setOnClickListener(this);
            button_tan.setOnClickListener(this);
            button_B.setOnClickListener(this);
            button_OCT.setOnClickListener(this);


        }

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
        button_min.setOnClickListener(this);


    }

    public void onClick(View v) {
        Button button_ac = (Button) findViewById(R.id.button_ac);    //清零
        TextView input_text = (TextView) findViewById(R.id.input_text);

        switch (v.getId()) {

            case R.id.button_0:
                if (words.length() == 0) {
                    break;
                } else {
                    if(i==1) {
                        words = words.delete(0, words.length());
                        i = 0;
                    }
                    words = words.append("0");
                    input_text.setText(words);
                }
                break;
            case R.id.button_1:

                if(i==1) {
                    words = words.delete(0, words.length());
                    i = 0;
                }
                words = words.append("1");
                input_text.setText(words);
                break;
            case R.id.button_2:
                if(i==1) {
                    words = words.delete(0, words.length());
                    i = 0;
                }
                words = words.append("2");
                input_text.setText(words);
                break;
            case R.id.button_3:
                if(i==1) {
                    words = words.delete(0, words.length());
                    i = 0;
                }
                words = words.append("3");
                input_text.setText(words);
                break;
            case R.id.button_4:
                if(i==1) {
                    words = words.delete(0, words.length());
                    i = 0;
                }
                words = words.append("4");
                input_text.setText(words);
                break;
            case R.id.button_5:
                if(i==1) {
                    words = words.delete(0, words.length());
                    i = 0;
                }
                words = words.append("5");
                input_text.setText(words);
                ;
                break;
            case R.id.button_6:
                if(i==1) {
                    words = words.delete(0, words.length());
                    i = 0;
                }
                words = words.append("6");
                input_text.setText(words);
                break;
            case R.id.button_7:
                if(i==1) {
                    words = words.delete(0, words.length());
                    i = 0;
                }
                words = words.append("7");
                input_text.setText(words);
                break;
            case R.id.button_8:
                if(i==1) {
                    words = words.delete(0, words.length());
                    i = 0;
                }
                words = words.append("8");
                input_text.setText(words);
                break;
            case R.id.button_9:
                if(i==1) {
                    words = words.delete(0, words.length());
                    i = 0;
                }
                words = words.append("9");
                input_text.setText(words);
                break;
            case R.id.button_ac:
                input_text.setText("");
                button_ac.setText("AC");
                words = words.delete(0, words.length());
                break;
            case R.id.button_point:
                if(i==1) {
                    words = words.delete(0, words.length());
                    i = 0;
                }
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
                        i=0;
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
                        i=0;
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
                        i=0;
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
                    i=0;
                    input_text.setText(words);

                }
                break;
            case R.id.button_delete:
                if (words.length() > 0) {
                    words.delete(words.length() - 1, words.length());
                    input_text.setText(words);
                }
                break;

            case R.id.button_min:
                if(words.length()==0)
                {
                    i=0;
                    words=words.append("-");
                    input_text.setText("-");
                }
                    break;
            case R.id.button_divx:
                if(words.length()==0)
            {
                input_text.setText("error!");
                break;
            }
                double num_x = Double.valueOf(words.toString());
                if(num_x==0.0)
                {
                    input_text.setText("error!");
                    break;
                }
                else
                {
                    double num_y=1.0/num_x;
                    words = words.delete(0, words.length());
                    words=words.append(num_y);
                    input_text.setText(words);
                }
                break;

            case R.id.button_xmult:
                BigDecimal sum = new BigDecimal(1);          //bigdecimal可以超过20位，方便大数计算
                if(words.length()==0)
                {
                    input_text.setText("error!");
                    break;
                }
                int num_xmult = Integer.valueOf(words.toString());
                if(num_xmult==0&&num_xmult==1)
                {
                    words = words.delete(0, words.length());
                    words=words.append("1");
                    input_text.setText(words);
                    break;
                }
                else
                {
                    for(int p=num_xmult;p>=1;p--)
                    {
                        sum= sum.multiply(new BigDecimal(p));
                    }
                    words = words.delete(0, words.length());
                    words=words.append(sum.toString());
                    input_text.setText(words);
                }
                break;

            case R.id.button_B:
                if(words.length()==0)
                {
                    input_text.setText("error!");
                    break;
                }
                int num_B = Integer.valueOf(words.toString());
                input_text.setText(Integer.toBinaryString(num_B));
                words = words.delete(0, words.length());
                break;

            case R.id.button_OCT:
                if(words.length()==0)
                {
                    input_text.setText("error!");
                    break;
                }
                int num_O = Integer.valueOf(words.toString());
                input_text.setText(Integer.toOctalString(num_O));
                words = words.delete(0, words.length());
                break;

            case R.id.button_H:
            {
                if(words.length()==0)
                {
                    input_text.setText("error!");
                    break;
                }
                int num_H = Integer.valueOf(words.toString());
                input_text.setText(Integer.toHexString(num_H));
                words = words.delete(0, words.length());
                break;
            }
            case R.id.button_lk:
                words=words.append("(");
                input_text.setText(words);
                break;
            case R.id.button_rk:
                words=words.append(")");
                input_text.setText(words);
                break;
            case R.id.button_sin:
                if(words.length()==0)
                {
                    input_text.setText("error!");
                    break;
                }
                double num = Double.valueOf(words.toString());
                double num1=Math.sin(Math.toRadians(num));
                words = words.delete(0, words.length());
                words=words.append(num1);
                input_text.setText(words);
                break;

            case R.id.button_cos:
                if(words.length()==0)
                {
                    input_text.setText("error!");
                    break;
                }
                double num_cos = Double.valueOf(words.toString());
                double num1_cos=Math.cos(Math.toRadians(num_cos));
                words = words.delete(0, words.length());
                words=words.append(num1_cos);
                input_text.setText(words);
                break;

            case R.id.button_tan:
                if(words.length()==0)
                {
                    input_text.setText("error!");
                    break;
                }
                double num_tan = Double.valueOf(words.toString());
                double num1_tan=Math.tan(Math.toRadians(num_tan));
                words = words.delete(0, words.length());
                words=words.append(num1_tan);
                input_text.setText(words);
                break;
            case R.id.button_e:
                words = words.delete(0, words.length());
                words=words.append(Math.E);
                input_text.setText(words);
                break;

            case R.id.button_pi:
                words = words.delete(0, words.length());
                words=words.append(Math.PI);
                input_text.setText(words);
                break;

            case R.id.button_ln:
                if(words.length()==0)
                {
                    input_text.setText("error!");
                    break;
                }
                double num_ln=Double.valueOf(words.toString());
                words = words.delete(0, words.length());
                words=words.append(Math.log(num_ln));
                input_text.setText(words);
                break;

            case R.id.button_ex:
                if(words.length()==0)
                {
                    input_text.setText("error!");
                    break;
                }
                double num_ex=Double.valueOf(words.toString());
                words = words.delete(0, words.length());
                words=words.append(Math.exp(num_ex));
                input_text.setText(words);
                break;
            case R.id.button_genhao:
                if(words.length()==0)
                {
                    input_text.setText("error!");
                    break;
                }
                double num_genhao=Double.valueOf(words.toString());
                words = words.delete(0, words.length());
                words=words.append(Math.sqrt(num_genhao));
                input_text.setText(words);
                break;
            case R.id.button_3genhao:
                if(words.length()==0)
                {
                    input_text.setText("error!");
                    break;
                }
                double y=0;
                double num_3genhao=Double.valueOf(words.toString());
                words = words.delete(0, words.length());
                y=Math.pow(num_3genhao,1.0/3);
                DecimalFormat b=new DecimalFormat("########.######");
                words=words.append(b.format(y));
                input_text.setText(words);
                break;

            case R.id.button_log:
                if(words.length()==0)
                {
                    input_text.setText("error!");
                    break;
                }
                double num_log=Double.valueOf(words.toString());
                words = words.delete(0, words.length());
                words=words.append(Math.log10(num_log));
                input_text.setText(words);
                break;

            case R.id.button_2X:  //2的x次方
                if(words.length()==0)
                {
                    input_text.setText("error!");
                    break;
                }
                double num_2x=Double.valueOf(words.toString());
                words = words.delete(0, words.length());
                words=words.append(Math.pow(2,num_2x));
                input_text.setText(words);
                break;

            case R.id.button_X2:   //x平方
                if(words.length()==0)
                {
                    input_text.setText("error!");
                    break;
                }
                double num_x2=Double.valueOf(words.toString());
                 num_x2=num_x2*num_x2;
                words = words.delete(0, words.length());
                words=words.append(num_x2);
                input_text.setText(words);
                break;

            case R.id.button_x3:
                if(words.length()==0)
                {
                    input_text.setText("error!");
                    break;
                }
                double num_x3=Double.valueOf(words.toString());
                num_x3=num_x3*num_x3*num_x3;
                words = words.delete(0, words.length());
                words=words.append(num_x3);
                input_text.setText(words);
                break;

            case R.id.button_equal:
                char c=words.charAt(0);
                if(c=='-')
                    words.insert(0,"0");
                String post = Postfix(words);
                String result = numberCount(post);
               input_text.setText(result);
                words = words.delete(0, words.length());
               words.append(result);
                i=1;
                break;
            default:
                break;

        }
        if(words.length()>0)
            button_ac.setText("C");
    }

    public boolean operator(char op) {
        if (op == '+' || op == '-' || op == '*' || op == '/' || op == '~'||op=='('||op==')') {
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

    public String Postfix(StringBuilder words) {
        int j=0;
        int z=0;
        Stack<Character> mark = new Stack<Character>(); //运算符栈
        words = words.append("~");  //最后一位添加“#”以表示运算结束
        String post = "";      //后缀表达式
        String total = "";
        String num = "";
        for (int i = 0; i <= words.length() - 1; i++) {
            j=0;
            char oper = words.charAt(i);
           // System.out.println(oper);
            if (operator(oper) == true) {
                if (total != "") {
                    post = post + total + " ";
                    total = "";
                }
                while (!mark.empty() && oper != '~')   //如果栈非空，且表达式未遍历完
                {
                    Character ac = mark.pop();
                  //  System.out.println("ac "+ac);
                    if (ac != null &&ac!='('&& (priority(ac.charValue()) > priority(oper) || priority(ac.charValue()) == priority(oper))) {  //判断栈顶符号与当前符号的优先级;
                           if(ac!='('&&ac!=')')
                            post = post + ac;             //如果栈顶符号的优先级高，则输出到后缀表达式中
                      //  System.out.println("post"+post);
                            ac = null;
                    }
                    if(ac!=null&&ac=='('&&oper!=')')
                    {
                            mark.push(ac);
                            mark.push(oper);
                            j = 1;
                            ac = null;
                            break;
                    }
                    if(ac!=null&&oper==')'&&ac=='(')
                    {
                        j=1;
                        break;

                    }
                    if (ac != null) {
                        mark.push(ac);
                        break;
                    }

                }
                if (oper != '~') {
                   if(j!=1) {
                       mark.push(oper);
                   }
                }
            } else {
                num = oper + "";
                total += num;
            }
        }
        while (!mark.isEmpty()) {
            Character k=mark.pop();
            if(k!='('&&k!=')')
            post += " " + k.toString(); //如果栈非空，需要将栈中运算符放到后缀表达式末尾
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


