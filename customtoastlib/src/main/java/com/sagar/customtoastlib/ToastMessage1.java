package com.sagar.customtoastlib;

import android.app.Activity;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ToastMessage1 {

    public static void showMessage(Activity context, String message, int resources){
        // Initiate the Toast instance.
        TextView textView;
        ImageView imageView;
        View toastView = context.getLayoutInflater().inflate(R.layout.activity_toast_message, null);
        Toast toast = new Toast(context);
        textView = (TextView) context.findViewById(R.id.customToastText) ;
        imageView =(ImageView)context.findViewById(R.id.customToastImage) ;
        textView.setText(message);
        imageView.setImageResource(resources);
        toastView.animate();
        // Set custom view in toast.
        toast.setView(toastView);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0,0);
        toast.show();
//        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
