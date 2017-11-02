package com.continuum.open.codewinandroid;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.continuum.open.codewinandroid.databinding.ActivityMainBinding;

import logic.Math;

public class MainActivity extends AppCompatActivity
    implements Operation{

    private final String TAG="Main";
    private ActivityMainBinding binding;
    private Math mathLib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setCallback(this);
        mathLib=new Math();
    }

    @Override
    public void add() {
        Log.d(TAG,"Add Operation");
        double output= mathLib.addition(firstNo(),secondNo());
        binding.output.setText(String.valueOf(output));
    }

    @Override
    public void sub() {
        Log.d(TAG,"Sub Operation");
        double output= mathLib.subtraction(firstNo(),secondNo());
        binding.output.setText(String.valueOf(output));
    }

    @Override
    public void mul() {
        Log.d(TAG,"Mul Operation");
        double output= mathLib.multiplication(firstNo(),secondNo());
        binding.output.setText(String.valueOf(output));
    }

    @Override
    public void div() {
        Log.d(TAG,"Div Operation");
        double output= mathLib.division(firstNo(),secondNo());
        binding.output.setText(String.valueOf(output));
    }

    private double firstNo(){
        return Double.parseDouble(binding.input1.getText().toString());
    }

    private double secondNo(){
        return Double.parseDouble(binding.input2.getText().toString());
    }
}
