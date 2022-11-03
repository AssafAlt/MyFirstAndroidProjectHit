package com.example.myfirstprojecthit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView calcMonitor;
    String num1,num2, op,res="";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calcMonitor = findViewById(R.id.textViewCalc);

    }

    public void onClickNumberFunction(View view){
        if(view instanceof Button){
            Button button = (Button) view;
            String str = button.getText()+"";
            calcMonitor.append(str);
            res= res + str;

        }
    }
    public void onClickOperatorFunction(View view){
        if(view instanceof Button){
            Button button = (Button) view;
            String str = button.getText()+"";
            calcMonitor.append(str);
            op=str;
            num1=res;
            res="";
        }

    }
    public void onClickClearFunction(View view){
        calcMonitor.setText("");
        res="";
    }

    public void onClickEqualFunction(View view){
       num2 = res;
       int number1=Integer.parseInt(num1);
       int number2=Integer.parseInt(num2);
       double  result =0 ;
        switch (op){
            case "+":
                result = number1+number2;
                break;
            case "-":
                result=number1-number2;
                break;
            case "X":
                result=number1*number2;
                break;
            case "/":
                if(number2==0){
                    calcMonitor.setText("Cant Divide By Zero ,Please Click C");
                    return;
                }else{
                    result = number1/number2;
                    break;
                }





        }
        String res2 = Double.toString(result);



        calcMonitor.setText(res2);
    }
}