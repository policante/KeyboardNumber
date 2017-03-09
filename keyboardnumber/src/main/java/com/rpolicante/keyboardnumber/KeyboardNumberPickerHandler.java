package com.rpolicante.keyboardnumber;

/**
 * Created by Cooper Card on 09/03/2017.
 */

public interface KeyboardNumberPickerHandler {

    void onConfirmAction(KeyboardNumberPicker picker, String value);
    void onCancelAction(KeyboardNumberPicker picker);

}
