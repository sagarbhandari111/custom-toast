package com.sagar.customtoastlib;

import android.app.Activity;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class ToastMessage1 {

    public static void showMessage(Activity context, String message){
        // Initiate the Toast instance.
        View toastView = context.getLayoutInflater().inflate(R.layout.activity_toast_message, null);
        Toast toast = new Toast(context);
        // Set custom view in toast.
        toast.setView(toastView);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0,0);
        toast.show();
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
