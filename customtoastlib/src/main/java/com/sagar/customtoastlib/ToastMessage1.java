package com.sagar.customtoastlib;

import android.content.Context;
import android.widget.Toast;

public class ToastMessage1 {
    public static void showMesssage(Context context, String message){
        Toast.makeText(context, "demo..", Toast.LENGTH_SHORT).show();
    }
}
