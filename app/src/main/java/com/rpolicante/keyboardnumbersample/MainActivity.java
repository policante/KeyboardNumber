package com.rpolicante.keyboardnumbersample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.rpolicante.keyboardnumber.KeyboardNumberFormatter;
import com.rpolicante.keyboardnumber.KeyboardNumberKeyListener;
import com.rpolicante.keyboardnumber.KeyboardNumberPicker;
import com.rpolicante.keyboardnumber.KeyboardNumberPickerHandler;

public class MainActivity extends AppCompatActivity implements KeyboardNumberKeyListener, KeyboardNumberPickerHandler, KeyboardNumberFormatter {

    private KeyboardNumberPicker picker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        picker = new KeyboardNumberPicker
                .Builder(1001)
                .create();

        Button openPicker = (Button) findViewById(R.id.open_picker);
        openPicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                picker.clearKeyboard();
                picker.show(getSupportFragmentManager(), "KeyboardNumberPicker");
            }
        });
    }

    @Override
    public void beforeKeyPressed(KeyboardNumberPicker picker, String oldString, String newDigit) {
        Log.d("KeyboardNumberPicker", "##beforeKeyPressed## Old String: " + oldString + "\nNew Digit: " + newDigit);
    }

    @Override
    public void onTextChanged(KeyboardNumberPicker picker, String oldString, String newString, String digit) {
        Log.d("KeyboardNumberPicker", "##onTextChanged## Old String: " + oldString + "\nNew String: " + newString + "\nDigit: " + digit);
    }

    @Override
    public void afterKeyPressed(KeyboardNumberPicker picker, String newString) {
        Log.d("KeyboardNumberPicker", "##afterKeyPressed## New String: " + newString);
    }

    @Override
    public void onConfirmAction(KeyboardNumberPicker picker, String value) {
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("Value: " + value);
    }

    @Override
    public void onCancelAction(KeyboardNumberPicker picker) {
        Log.d("KeyboardNumberPicker", "Cancel action");
    }

    @Override
    public String formatNumber(KeyboardNumberPicker picker, String strValue) {
        String value = strValue.replaceAll("\\D+", "");
        StringBuilder out = new StringBuilder();
        int j = 0;
        String mask = "(##) #####-####";
        String lastChar = "";
        for (int i = 0; i < mask.length(); i++) {
            if (mask.charAt(i) == '#') {
                try {
                    char zzz = value.charAt(j);
                    if (!lastChar.isEmpty()) {
                        out.append(lastChar);
                        lastChar = "";
                    }
                    out.append(zzz);
                } catch (Exception e) {
                    break;
                }
                j++;
            } else {
                lastChar += mask.charAt(i);
            }
        }
        return out.toString();
    }

}
