 package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.SolverVariable;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {
private TextView ans;
private Button seven,eight,nine,divide,four,five,six,times,one,two,three,minuz,zero,c,equal,plus;
private String input,Result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ans=findViewById(R.id.ans);

        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        divide=findViewById(R.id.divide);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        times=findViewById(R.id.times);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        minuz=findViewById(R.id.minuz);
        zero=findViewById(R.id.zero);
        c=findViewById(R.id.c);
        equal=findViewById(R.id.equal);
        plus=findViewById(R.id.plus);

    }
    public void ButtonClick(View view){
        Button button=(Button)view;
        String data=button.getText().toString();
        switch (data){
            case "c":
                input="";
                break;
            case "x":
                Solve();
                input+="*";
                break;
            case"=":
                Solve();
                Result=input;
                break;
            default:
                if(input==null){
                    input="";
                  }
                if (data.equals("+")||data.equals("-")||data.equals("/")){
        Solve();
            }
            input+=data;
        }
        ans.setText(input);
    }
    private void Solve(){
        if (input.split("\\*").length==2){
            String number[]=input.split("\\*");
            try {
                double mul = Double.parseDouble(number[0]) * Double.parseDouble(number[1]);
                input = mul+"";
            }
            catch (Exception e){

            }
        }
        else if (input.split("/").length==2){
            String number[]=input.split("/");
            try {
                double div = Double.parseDouble(number[0]) * Double.parseDouble(number[1]);
                input = div+"";
            }
            catch (Exception e){









