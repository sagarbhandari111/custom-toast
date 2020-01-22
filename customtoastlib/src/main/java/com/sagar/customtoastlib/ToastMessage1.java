package com.sagar.customtoastlib;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

public class ToastMessage1 {

    public static void showMessage(Context context, String message, View toastView){
        // Initiate the Toast instance.
        Toast toast = new Toast(context);
        // Set custom view in toast.
        toast.setView(toastView);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0,0);
        toast.show();
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
