package com.sagar.customtoastlib;

import android.content.Context;
import android.widget.Toast;

public class ToastMessage {
    public static void message(Context context, String message){
        Toast.makeText(context, "hello", Toast.LENGTH_SHORT).show();
    }
}
