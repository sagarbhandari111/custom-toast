package com.sagar.customtoastlib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class ToastMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_message);
    }

    public void showMessage(Context context, String message){
        View toastView = getLayoutInflater().inflate(R.layout.activity_toast_message, null);
        ToastMessage1.showMessage(getApplicationContext(),message,toastView);
    }
}
