package com.rpolicante.keyboardnumber;

/**
 * Created by Cooper Card on 09/03/2017.
 */

public interface KeyboardNumberKeyListener {

    void beforeKeyPressed(KeyboardNumberPicker picker, String oldString, String newDigit);
    void onTextChanged(KeyboardNumberPicker picker, String oldString, String newString, String digit);
    void afterKeyPressed(KeyboardNumberPicker picker, String newString);

}